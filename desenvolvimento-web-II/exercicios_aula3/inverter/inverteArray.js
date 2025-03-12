let array = [1, 2, 3, 4, 5];

let arrayInvertido = [];

for (let i = array.length - 1; i >= 0; i--) {
    arrayInvertido.push(array[i]);
}

console.log("Array original:", array);
console.log("Array invertido:", arrayInvertido);