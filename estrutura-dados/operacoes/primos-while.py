'''
N = int(input("Digite um número inteiro"))
cont = 0
i = 2

while i < N:
    R = N % i 
    if R == 0:
        cont += 1 
    i += 1 
if cont == 0:
    print("{} é primo" .format (N))
else:
    print("{} não é primo" .format (N))
'''

N = int(input("Digite um número inteiro"))
i = 2

while i < N:
    R = N % i
    if R == 0:
        print("{} não é primo".format(N))
        break
    i += 1
else:
    print("{} é primo".format(N))