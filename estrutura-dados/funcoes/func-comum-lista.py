def elementos_comuns(lista1, lista2):
    return list(set(lista1) & set(lista2))
entrada1 = input("Digite os elementos da primeira lista separados por vírgula: ")
entrada2 = input("Digite os elementos da segunda lista separados por vírgula: ")
lista1 = [item.strip() for item in entrada1.split(",")]
lista2 = [item.strip() for item in entrada2.split(",")]
comuns = elementos_comuns(lista1, lista2)
print("Elementos em comum:{}".format(comuns))
