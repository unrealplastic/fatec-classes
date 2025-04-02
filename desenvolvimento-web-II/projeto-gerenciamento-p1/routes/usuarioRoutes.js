const express = require('express');
const router = express.Router();
const UsuarioController = require('../controllers/usuarioController');

router.post('/', UsuarioController.criar);
router.get('/', UsuarioController.listarTodos);

module.exports = router;