casa = float(input('Qual o valor da casa? :'))
salario = float(input('Qual o seu salario? :'))
anos = int(input('Quantos anos na casa? :'))
# 30% do salario
valor = salario * 0.30
#covertendo anos em meses
meses = anos * 12
#divindo a fatura mensal
fatura = casa / meses
if fatura > valor:
    print('Emprestimo negado!')
    print('O valor passou 30% do seu salário')
elif fatura == valor:
    print('Emprestimo aprovado!')
else:
    print('Emprestimo feito!')
