def comprimentos(tupla_strings):
    return tuple(len(s) for s in tupla_strings)
entrada = input("Digite as strings separadas por vírgula: ")
tupla_entrada = tuple(s.strip() for s in entrada.split(","))
resultado = comprimentos(tupla_entrada)
print("Comprimentos das strings:{}".format(resultado))
