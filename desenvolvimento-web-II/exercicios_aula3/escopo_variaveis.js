//escopo de variáveis let
//global
let nome = "rodrigo"
{   //escopo local   
    let nome = "xxxx"
}
console.log(nome)

//escopo global
const apelido = "rodrigo 3"
{   //escopo local   
    const apelido = "xxxx"
}
console.log(apelido)
