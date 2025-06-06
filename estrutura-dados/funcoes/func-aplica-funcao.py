def aplicar_funcao(lista, func):
    return [func(item) for item in lista]
#Exemplo
numeros = [1, 2, 3, 4, 5]
def ao_quadrado(x):
    return x ** 2
resultado = aplicar_funcao(numeros, ao_quadrado)
print(resultado)
