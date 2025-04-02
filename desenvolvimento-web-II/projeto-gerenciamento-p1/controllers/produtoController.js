const { pool } = require('../config/database');

class ProdutoController {

  static async criar(req, res) {
    const { nome, preco, estoque } = req.body;

    if (!nome || nome.length < 3) {
      return res.status(400).json({ error: 'Nome deve ter pelo menos 3 caracteres' });
    }
    if (isNaN(preco) || preco <= 0) {
      return res.status(400).json({ error: 'Preço deve ser um número positivo' });
    }
    if (!Number.isInteger(estoque) || estoque < 0) {
      return res.status(400).json({ error: 'Estoque deve ser um número inteiro maior ou igual a zero' });
    }

    try {
      const [result] = await pool.execute(
        'INSERT INTO produtos (nome, preco, estoque) VALUES (?, ?, ?)',
        [nome, parseFloat(preco), parseInt(estoque)]
      );

      res.status(201).json({
        id: result.insertId,
        nome,
        preco: parseFloat(preco),
        estoque: parseInt(estoque)
      });

    } catch (err) {
      console.error('Erro ao criar produto:', err);
      res.status(500).json({ 
        error: 'Erro ao criar produto',
        detalhes: process.env.NODE_ENV === 'development' ? err.message : null
      });
    }
  }

  static async listarTodos(req, res) {
    try {
      const [produtos] = await pool.execute('SELECT * FROM produtos');
      res.status(200).json(produtos);
    } catch (err) {
      console.error('Erro ao buscar produtos:', err);
      res.status(500).json({ error: 'Erro ao buscar produtos' });
    }
  }

  static async buscarPorId(req, res) {
    const { id } = req.params;

    try {
      const [produtos] = await pool.execute('SELECT * FROM produtos WHERE id = ?', [id]);
      
      if (produtos.length === 0) {
        return res.status(404).json({ error: 'Produto não encontrado' });
      }

      res.status(200).json(produtos[0]);
    } catch (err) {
      console.error('Erro ao buscar produto:', err);
      res.status(500).json({ error: 'Erro ao buscar produto' });
    }
  }

  static async atualizar(req, res) {
    const { id } = req.params;
    const { nome, preco, estoque } = req.body;

    // Validações (as mesmas do criar)
    if (nome && nome.length < 3) {
      return res.status(400).json({ error: 'Nome deve ter pelo menos 3 caracteres' });
    }
    if (preco && (isNaN(preco) || preco <= 0)) {
      return res.status(400).json({ error: 'Preço deve ser um número positivo' });
    }
    if (estoque && (!Number.isInteger(estoque) || estoque < 0)) {
      return res.status(400).json({ error: 'Estoque deve ser um número inteiro maior ou igual a zero' });
    }

    try {
      const [produtos] = await pool.execute('SELECT * FROM produtos WHERE id = ?', [id]);
      if (produtos.length === 0) {
        return res.status(404).json({ error: 'Produto não encontrado' });
      }

      const dadosAtualizados = {
        nome: nome || produtos[0].nome,
        preco: preco !== undefined ? parseFloat(preco) : produtos[0].preco,
        estoque: estoque !== undefined ? parseInt(estoque) : produtos[0].estoque
      };

      await pool.execute(
        'UPDATE produtos SET nome = ?, preco = ?, estoque = ? WHERE id = ?',
        [dadosAtualizados.nome, dadosAtualizados.preco, dadosAtualizados.estoque, id]
      );

      res.status(200).json({
        id,
        ...dadosAtualizados
      });

    } catch (err) {
      console.error('Erro ao atualizar produto:', err);
      res.status(500).json({ 
        error: 'Erro ao atualizar produto',
        detalhes: process.env.NODE_ENV === 'development' ? err.message : null
      });
    }
  }

  static async deletar(req, res) {
    const { id } = req.params;

    try {
      const [result] = await pool.execute('DELETE FROM produtos WHERE id = ?', [id]);
      
      if (result.affectedRows === 0) {
        return res.status(404).json({ error: 'Produto não encontrado' });
      }

      res.status(200).json({ message: 'Produto removido com sucesso' });
    } catch (err) {
      console.error('Erro ao remover produto:', err);
      res.status(500).json({ error: 'Erro ao remover produto' });
    }
  }
}

module.exports = ProdutoController;