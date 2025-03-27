require('dotenv').config();
const { initialize } = require('./config/database');
const UserModel = require('./models/userModels_oracle');
const ProductModel = require('./models/productModel_oracle');

async function main() {
  try {
    await initialize();
    
    // Exemplo de uso
    const userId = await UserModel.create({
      name: 'João Silva',
      email: 'joao@example.com',
      password: 'hashed_password'
    });
    
    console.log('Usuário criado com ID:', userId);
    
    const products = await ProductModel.findAll();
    console.log('Produtos:', products);
    
  } catch (err) {
    console.error('Erro:', err);
  }
}

main();