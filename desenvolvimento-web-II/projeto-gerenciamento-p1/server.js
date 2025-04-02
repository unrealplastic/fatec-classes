require('dotenv').config();
const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');
const path = require('path');
const { pool } = require('./config/database');
const PORT = process.env.PORT || 3000;
const produtoRoutes = require('./routes/produtoRoutes');
const usuarioRoutes = require('./routes/usuarioRoutes');

const app = express();

app.use(cors());
app.use(bodyParser.json());
app.use(express.static(path.join(__dirname, 'public')));

async function testDatabaseConnection() {
  try {
    const connection = await pool.getConnection();
    console.log('Conexão com MySQL estabelecida!');
    connection.release();
  } catch (err) {
    console.error('Falha ao conectar ao MySQL:', err.message);
    process.exit(1);
  }
}

app.use('/produtos', produtoRoutes);
app.use('/usuarios', usuarioRoutes);

app.get('/cadastro-produto', (req, res) => {
  res.sendFile(path.join(__dirname, 'public', 'cadastro-produto.html'));
});

app.get('/cadastro-usuario', (req, res) => {
  res.sendFile(path.join(__dirname, 'public', 'cadastro-usuario.html'));
});

app.get('/health', (req, res) => {
  res.status(200).json({ status: 'OK', database: 'MySQL' });
});

app.use((err, req, res, next) => {
  console.error(err.stack);
  res.status(500).json({ error: 'Erro interno do servidor' });
});

app.listen(PORT, async () => {
    await testDatabaseConnection();
    console.log(`
    Servidor rodando na porta: ${PORT}
    Links disponíveis:
    Cadastro de Usuários: http://localhost:${PORT}/cadastro-usuario
    Cadastro de Produtos: http://localhost:${PORT}/cadastro-produto
    `);
  });