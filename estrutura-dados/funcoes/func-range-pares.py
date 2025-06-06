def gerar_pares(n):
    lista = []
    for i in range(n + 1):  # inclui o n
        if i % 2 == 0:
            lista.append(i)
    return lista
n = int(input("Digite um número: "))
pares = gerar_pares(n)
print(f"Números pares entre 0 e {n}: {pares}")
