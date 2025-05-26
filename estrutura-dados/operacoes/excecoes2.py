N = 0

while N < 100 or N > 500:
    try:
        S = (input("Digite um valor no intervalo de [100, 500]")) #recebe o número
        N = int(S) #atribui o número a N como um inteiro
    except:
        print("{} não é um número inteiro".format(S)) #se não for um número inteiro imprime a mensagem
        N = 0 #define N como 0
    else:
        if N < 100 or N > 500:
            print ("O valor lido {} está fora do intervalo".format(N))
        else:
            print("O valor lido {} está OK".format(N))
    finally:
        print("\n\n")