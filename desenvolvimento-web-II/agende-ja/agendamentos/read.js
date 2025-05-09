const fs = require('fs');
const path = require('path');
const db = path.join(__dirname, 'database.json');

function listarConsultas(callback) {
  fs.readFile(db, 'utf-8', (err, data) => {
    if (err) return callback(err);

    let consultas = [];
    try {
      consultas = JSON.parse(data);
    } catch {
      consultas = [];
    }

    callback(null, consultas);
  });
}

module.exports = listarConsultas;