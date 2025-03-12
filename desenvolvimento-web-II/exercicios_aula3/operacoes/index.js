import soma from "./soma.js"
import subtrai from "./subtrai.js"
import divide from "./divide.js"
import multiplica from "./multiplica.js"

const sinal = multiplica

if(sinal == soma){
    console.log(soma(4,2))
} else if(sinal == subtrai){
    console.log(subtrai(4,2))
} else if(sinal == divide){
    console.log(divide(4,2))
} else if (sinal == multiplica){
    console.log(multiplica(4,2))
} else {
    console.log("operação não identificada")
}