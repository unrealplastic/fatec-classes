document.querySelector("#form-submmit").addEventListener("submit", (e) =>{
    e.preventDefault(); //previne o envio do formulario

    const nome = document.querySelector("#nome").value
    const idade = document.querySelector("#idade").value;
    if(nome === ""){
        alert ("Os campos precisam ser preenchidos")
        return false
    }

    if(idade === ""){
        alert ("Os campos precisam ser preenchidos")
        return false
    }

    const usuario = {
        nome :nome, // recebe o valor do formulario
        idade : idade
    }

    exibirDados(usuario)
});

const ul = document.createElement("ul")

function exibirDados(){
    const li = document.createElement("li")
    li.innerText = `Nome: ${usuario.nome} e idade: ${usuario.idade}`
    ul.appendChild("li")
    document.body.appendChild(ul)
}

document.querySelector("#cep").addEventListener("blur", async () =>{
    const cep = document.querySelector("#cep").value
    try{
        const dados = await fetch(`https://viacep.com.br/ws/${cep}/json/`)
        const resultados =  await dados.json()

        document.querySelector("#rua").value = resultados.logradouro
        document.querySelector("#bairro").value = resultados.bairro
        document.querySelector("#cidade").value = resultados.localidade
        document.querySelector("#uf").value = resultados.uf

    } catch(error){
        console.log(error)
    }
})



//console.log(document.getElementById("titulo"))
 //console.log(document.getElementsByClassName("paragrafo")) //retorn um array
//console.log(document.getElementsByTagName("button"))



/*document.addEventListener("DOMContentLoaded", () =>{

        

    console.log(document.querySelector("#titulo"))
    console.log(document.querySelector(".paragrafo")) //retorna o conteúdo do paragrafo
    console.log(document.querySelector("button"))

    //altera o conteúdo

    const nome = "♥♥♥";
    document.querySelector("#titulo").innerHTML = `Novo título ${nome}` //innerHTML interpreta formatações de texto
    document.querySelector(".paragrafo").innerText = "jsidjd" //retorna o conteúdo do paragrafo. innerText não interpreta formatações de texto
    document.querySelector("button").addEventListener("click", ( ) =>{
        alert("botão clicado")
    })

    document.querySelector("#nome").addEventListener("keyup", (e) => {
        console.log(e.target.value)
     })

})*/