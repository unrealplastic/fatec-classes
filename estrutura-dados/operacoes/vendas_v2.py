salario_fixo = 500.00
vendas = float(input("Digite o valor total das vendas do mês: R$ "))
comissao = 0.06 * vendas
faturamento_total = salario_fixo + comissao
print(f"Faturamento total do mês: R$ {faturamento_total:.2f}")
