const http = require('http');
const PORT = process.env.PORT || 3000;
const HOST = process.env.HOST || '127.0.0.1';
const REQUI = true;
const server = http.createServer((req, res) => {
 console.log(`${req.method} ${req.url}`);
 if(REQUI){
 console.log('--- Detalhes da Requisição ---');
 console.log('Headers:', req.headers);
 }
 res.writeHead(200, { 'Content-Type': 'text/plain; charset=utf-8' });
 res.end('Olá, mundo! Este é o meu servidor Node.js.\n');
});
server.listen(PORT, HOST, () => {
 console.log(`Servidor rodando em http://${HOST}:${PORT}`);
 });
