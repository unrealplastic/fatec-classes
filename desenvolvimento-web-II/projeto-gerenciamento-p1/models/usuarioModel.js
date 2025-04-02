const pool = require('../config/database.js');

class UsuarioModel {
    static async getAll() {
        const [rows] = await pool.query('SELECT * FROM usuarios');
        return rows;
      }
    
      static async getById(id) {
        const [rows] = await pool.query('SELECT * FROM usuarios WHERE id = ?', [id]);
        return rows[0];
      }
    
      static async create({ nome, email, senha }) {
        const [result] = await pool.query(
          'INSERT INTO usuarios (nome, email, senha) VALUES (?, ?, ?)',
          [nome, email, senha]
        );
        return result.insertId;
      }
    
      static async update(id, { nome, email }) {
        await pool.query(
          'UPDATE usuarios SET nome = ?, email = ? WHERE id = ?',
          [nome, email, id]
        );
      }
    
      static async delete(id) {
        await pool.query('DELETE FROM usuarios WHERE id = ?', [id]);
      }
}

module.exports = UsuarioModel;