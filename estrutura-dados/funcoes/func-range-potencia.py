def potencias_de_dois(expoente):
    return [2**i for i in range(expoente + 1)]
n = int(input("Digite o expoente máximo: "))
resultado = potencias_de_dois(n)
print(f"Potências de 2 até 2^{n}: {resultado}")
