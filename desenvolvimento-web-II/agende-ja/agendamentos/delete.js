const fs = require('fs');
const path = require('path');
const db = path.join(__dirname, 'database.json');

function cancelarConsulta(id, callback) {
  fs.readFile(db, 'utf-8', (err, data) => {
    if (err) return callback(err);

    let consultas = [];
    try {
      consultas = JSON.parse(data);
    } catch {
      consultas = [];
    }

    const novasConsultas = consultas.filter(c => c.id !== id);

    fs.writeFile(db, JSON.stringify(novasConsultas, null, 2), err => {
      if (err) return callback(err);
      callback(null, 'Consulta cancelada com sucesso!');
    });
  });
}

module.exports = cancelarConsulta;