function gerarNumerosPares(N) {
    let numerosPares = [];


    for (let i = 1; i <= N; i++) {
        numerosPares.push(i * 2);
    }

    return numerosPares;
}

let N = 10;
let numerosPares = gerarNumerosPares(N);

console.log("Primeiros", N, "números pares:", numerosPares);