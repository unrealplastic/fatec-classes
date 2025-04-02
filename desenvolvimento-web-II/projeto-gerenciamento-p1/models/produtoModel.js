const pool = require('../config/database.js');

class ProdutoModel{
    static async getAll(){
        const [rows] = await pool.query('SELECT * FROM produtos');
        return rows;
    }

    static async getById(id) {
        const [rows] = await pool.query('SELECT * FROM produtos WHERE id = ?', [id]);
        return rows[0];
    }

      static async create({ nome, preco, estoque }) {
        const [result] = await pool.query(
          'INSERT INTO produtos (nome, preco, estoque) VALUES (?, ?, ?)',
          [nome, preco, estoque]
        );
        return result.insertId;
    }

    static async update(id, { nome, preco, estoque }) {
        await pool.query(
          'UPDATE produtos SET nome = ?, preco = ?, estoque = ? WHERE id = ?',
          [nome, preco, estoque, id]
        );
    }

    static async delete(id) {
        await pool.query('DELETE FROM produtos WHERE id = ?', [id]);
    }
    
}

module.exports = ProdutoModel;