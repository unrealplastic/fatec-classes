def pessoa_mais_velha(lista):
    return max(lista, key=lambda pessoa: pessoa[1])
quantidade = int(input("Quantas pessoas deseja cadastrar? "))
pessoas = []
for _ in range(quantidade):
    nome = input("Digite o nome: ")
    idade = int(input("Digite a idade: "))
    pessoas.append((nome, idade))
mais_velha = pessoa_mais_velha(pessoas)
print(f"A pessoa mais velha é {mais_velha[0]} com {mais_velha[1]} anos.")
