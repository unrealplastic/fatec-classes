require('dotenv').config();
const oracledb = require('oracledb');

// Configuração do Oracle Client
try {
  oracledb.initOracleClient({ 
    libDir: process.env.ORACLE_CLIENT_PATH || 'C:\\oracle\\instantclient_19_19' 
  });
} catch (err) {
  console.warn('Modo Thin ativado. Para melhor performance, instale o Instant Client');
}

// Configuração do pool de conexões
const poolConfig = {
  user: process.env.ORACLE_USER,
  password: process.env.ORACLE_PASSWORD,
  connectString: process.env.ORACLE_CONNECTION_STRING,
  poolMin: parseInt(process.env.ORACLE_POOL_MIN),
  poolMax: parseInt(process.env.ORACLE_POOL_MAX),
  poolIncrement: parseInt(process.env.ORACLE_POOL_INCREMENT),
  poolTimeout: parseInt(process.env.ORACLE_POOL_TIMEOUT)
};

// Cria o pool de conexões
async function initialize() {
  await oracledb.createPool(poolConfig);
  console.log('Pool de conexões Oracle criado');
}

// Métodos para executar queries
async function executeQuery(sql, binds = [], options = {}) {
  let connection;
  try {
    connection = await oracledb.getConnection();
    return await connection.execute(sql, binds, {
      outFormat: oracledb.OUT_FORMAT_OBJECT,
      ...options
    });
  } finally {
    if (connection) await connection.close();
  }
}

async function executeTransaction(operations) {
    let connection;
    try {
      connection = await oracledb.getConnection();
      await connection.execute('BEGIN');
      
      const result = await operations(connection);
      
      await connection.execute('COMMIT');
      return result;
    } catch (err) {
      if (connection) await connection.execute('ROLLBACK');
      throw err;
    } finally {
      if (connection) await connection.close();
    }
  }

module.exports = { initialize, executeQuery };