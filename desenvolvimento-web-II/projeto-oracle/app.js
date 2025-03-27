require('dotenv').config();
const oracledb = require('oracledb');

// Configuração para o Oracle Instant Client (se necessário)
try {
    oracledb.initOracleClient({ libDir: 'C:\\oracle\\instantclient_19_19' });
} catch (err) {
  console.error('Aviso: Usando modo Thin. Para melhor performance, instale o Instant Client');
}

async function testarConexao() {
  let connection;
  
  try {
    connection = await oracledb.getConnection({
      user: process.env.ORACLE_USER,
      password: process.env.ORACLE_PASSWORD,
      connectString: process.env.ORACLE_CONNECTION_STRING
    });
    
    console.log('✅ Conexão bem-sucedida!');
    
    // Teste uma consulta simples
    const result = await connection.execute(
      `SELECT 'Conexão Node.js funcionando!' AS mensagem FROM dual`
    );
    
    console.log(result.rows[0].MENSSAGEM);
    
  } catch (err) {
    console.error('❌ Erro detalhado:', {
      message: err.message,
      errorNum: err.errorNum,
      stack: err.stack
    });
  } finally {
    if (connection) {
      try {
        await connection.close();
      } catch (err) {
        console.error('Erro ao fechar conexão:', err);
      }
    }
  }
}

module.exports = {testarConexao};