soma = 0
qnt = 0
x = 1 

while x != 0:
    x = int(input("Digite x:"))
    if x != 0:
        soma += x
        qnt += 1 
print("Total dos valores digitador = %d" % soma)
print("Quantidade dos valores = %d" % qnt)