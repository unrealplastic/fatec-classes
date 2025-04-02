const { pool } = require('../config/database');

class UsuarioController {
  static async criar(req, res) {
    const { nome, email, senha } = req.body;

    if (!nome || nome.length < 3) {
      return res.status(400).json({ error: 'Nome deve ter pelo menos 3 caracteres' });
    }
    if (!email || !email.includes('@')) {
      return res.status(400).json({ error: 'E-mail inválido' });
    }
    if (!senha || senha.length < 6) {
      return res.status(400).json({ error: 'Senha deve ter pelo menos 6 caracteres' });
    }

    try {
      const [result] = await pool.execute(
        'INSERT INTO usuarios (nome, email, senha) VALUES (?, ?, ?)',
        [nome, email, senha]
      );
      
      res.status(201).json({
        id: result.insertId,
        nome,
        email
      });
      
    } catch (err) {
      console.error('Erro ao criar usuário:', err);
      res.status(500).json({ 
        error: 'Erro ao criar usuário',
        detalhes: process.env.NODE_ENV === 'development' ? err.message : null
      });
    }
  }

  static async listarTodos(req, res) {
    try {
      const [usuarios] = await pool.execute('SELECT * FROM usuarios');
      res.status(200).json(usuarios);
    } catch (err) {
      console.error('Erro ao buscar usuários:', err);
      res.status(500).json({ error: 'Erro ao buscar usuários' });
    }
  }
}

module.exports = UsuarioController;