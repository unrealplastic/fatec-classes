# Relatório Técnico

1. Introdução
O objetivo deste documento é explicar como desenvolvemos o sistema de gestão de itens e pessoas, utilizando a forma MVC (Model-View-Controller). O sistema permite incluir, mudar, mostrar e remover itens e pessoas num banco de dados MySQL.

2. Desenvolvimento da Aplicação
O sistema foi feito com a linguagem JavaScript e Node.js, usando o framework Express para organizar as rotas e a ligação com o banco de dados MySQL.

# 2.1 Arquitetura MVC
A forma Model-View-Controller foi usada assim:
- Model: Cuida de definir como os dados são organizados e de falar com o banco de dados MySQL.
- View : Mostra as páginas HTML que as pessoas usam para incluir itens e pessoas
- Controller : Lida com os pedidos HTTP e fala com os models para dar os dados certos às views.

3. Funcionalidades Implementadas

# 3.1 Cadastro de Produtos
Criamos funções CRUD para cuidar dos itens, com verificação dos dados de acordo com as regras:
- O nome do item deve ter pelo menos 3 letras.
- O preço deve ser um valor que não seja negativo.
- A quantidade deve ser um número inteiro maior ou igual a zero.

Endpoints:
- GET /produtos: Devolve todos os itens.
- GET /produtos/{id}: Devolve o item com o ID indicado.
- POST /produtos: Cria um novo item.
- PUT /produtos/{id}: Muda os dados de um item já existente.
- DELETE /produtos/{id}: Apaga um item pelo ID.

# 3.2 Cadastro de Usuários
Fizemos funções CRUD para cuidar das pessoas, garantindo que as informações sejam verificadas corretamente.

Endpoints:
- GET /usuarios: Devolve todas as pessoas.
- GET /usuarios/{id}: Devolve a pessoa com o ID indicado.
- POST /usuarios: Cria uma nova pessoa.
- PUT /usuarios/{id}: Muda os dados de uma pessoa já existente.
- DELETE /usuarios/{id}: Apaga uma pessoa pelo ID.

4. Validação de Campos
Verificamos os dados que entram nos controllers antes de guardar no banco de dados. Se houver erro, o sistema mostra avisos certos.

5. Dificuldades e Soluções
# Dificuldades Encontradas
- Ajuste inicial do MySQL e sua ligação com o Node.js.
- Uso correto da forma MVC.
- Lidar com erros e verificar os dados.

# Soluções Adotadas
- Uso do Sequelize como ORM para simplificar a conversa com o MySQL.
- Estudo e revisão da forma MVC antes de começar a usar.
- Uso de um sistema de verificação no Express para proteger os dados colocados.

6. Referências
- Manual oficial do Node.js: https://nodejs.org/
- Manual oficial do Express: https://expressjs.com/
- Manual do Sequelize: https://sequelize.org/
- Manual do MySQL: https://dev.mysql.com/doc/

7. Participantes
- Nicole Lisboa de Carvalho
- Vinicius de Moraes Crepaldi
