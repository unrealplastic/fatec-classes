document.getElementById('produtoForm').addEventListener('submit', async (e) => {
    e.preventDefault();
    
    const produto = {
      nome: document.getElementById('nome').value,
      preco: parseFloat(document.getElementById('preco').value),
      estoque: parseInt(document.getElementById('estoque').value)
    };
  
    try {
      const response = await fetch('http://localhost:3000/produtos', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(produto)
      });
      
      if (response.ok) {
        alert('Produto cadastrado com sucesso!');
      } else {
        const error = await response.json();
        alert(`Erro: ${error.error}`);
      }
    } catch (err) {
      alert('Erro ao conectar com o servidor');
    }
  });