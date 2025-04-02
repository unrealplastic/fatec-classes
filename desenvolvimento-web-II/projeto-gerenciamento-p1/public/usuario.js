document.addEventListener('DOMContentLoaded', () => {
    const form = document.getElementById('usuarioForm');
    
    form.addEventListener('submit', async (e) => {
      e.preventDefault();
      
      const usuario = {
        nome: document.getElementById('nome').value,
        email: document.getElementById('email').value,
        senha: document.getElementById('senha').value
      };
  
      if (usuario.nome.length < 3) {
        alert('Nome deve ter pelo menos 3 caracteres');
        return;
      }
  
      if (!usuario.email.includes('@')) {
        alert('E-mail inválido');
        return;
      }
  
      if (usuario.senha.length < 6) {
        alert('Senha deve ter pelo menos 6 caracteres');
        return;
      }
  
      try {
        const response = await fetch('http://localhost:3000/usuarios', {
          method: 'POST',
          headers: { 'Content-Type': 'application/json' },
          body: JSON.stringify(usuario)
        });
  
        const data = await response.json();
  
        if (response.ok) {
          alert('Usuário cadastrado com sucesso!');
          form.reset();
        } else {
          alert(`Erro: ${data.error || 'Falha ao cadastrar usuário'}`);
        }
      } catch (error) {
        console.error('Erro:', error);
        alert('Erro ao conectar com o servidor');
      }
    });
  });