const fs = require('fs');
const path = require('path');
const db = path.join(__dirname, 'database.json');

function cadastrarConsulta(consulta, callback) {
  fs.readFile(db, 'utf-8', (err, data) => {
    if (err) return callback(err);

    let consultas = [];
    try {
      consultas = JSON.parse(data);
    } catch {
      consultas = [];
    }

    consultas.push(consulta);

    fs.writeFile(db, JSON.stringify(consultas, null, 2), err => {
      if (err) return callback(err);
      callback(null, 'Consulta cadastrada com sucesso!');
    });
  });
}

module.exports = cadastrarConsulta;