// backend/index.js
const express = require('express');
const fs = require('fs');
const cors = require('cors');
const path = require('path');

const app = express();
const PORT = 3000;
const DB_PATH = path.join(__dirname, 'database.json');

app.use(cors());
app.use(express.json());

// Função para ler o banco de dados
function lerConsultas() {
  try {
    const data = fs.readFileSync(DB_PATH, 'utf8');
    return JSON.parse(data);
  } catch {
    return [];
  }
}

// Função para salvar no banco de dados
function salvarConsultas(consultas) {
  fs.writeFileSync(DB_PATH, JSON.stringify(consultas, null, 2));
}

// Rota GET - listar consultas
app.get('/consultas', (req, res) => {
  const consultas = lerConsultas();
  res.json(consultas);
});

// Rota POST - cadastrar consulta
app.post('/consultas', (req, res) => {
  const { paciente, data, especialidade } = req.body;
  const consultas = lerConsultas();
  const novaConsulta = {
    id: Date.now(),
    paciente,
    data,
    especialidade
  };
  consultas.push(novaConsulta);
  salvarConsultas(consultas);
  res.status(201).json(novaConsulta);
});

// Rota DELETE - cancelar consulta por ID
app.delete('/consultas/:id', (req, res) => {
  const id = parseInt(req.params.id);
  let consultas = lerConsultas();
  consultas = consultas.filter(c => c.id !== id);
  salvarConsultas(consultas);
  res.status(204).send();
});

app.listen(PORT, () => {
  console.log(`Servidor rodando em http://localhost:${PORT}`);
});
