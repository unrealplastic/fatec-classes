def somar_lista(lista):
    return sum(lista)
    
entrada = input("Digite os números separados por vírgula: ")

numeros = [int(num) for num in entrada.split(",")]

resultado = somar_lista(numeros)
print(f"A soma dos números é {resultado}")

