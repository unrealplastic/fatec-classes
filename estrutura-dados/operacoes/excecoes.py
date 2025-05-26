A = int(input("Digite um valor para A"))
B = int(input("Digite um valor para B"))

try:
    R = A/B 
    print("Resultado: R = %.1f" %R)
except:
    print("Não é possível calcular a divisão")