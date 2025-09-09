casa = float(input('Qual o valor da casa? :'))
salario = float(input('Qual o seu salario? :'))
anos = int(input('Quantos anos na casa? :'))
# 30% do salario
valor = salario * 0.30
#covertendo anos em meses
meses = anos * 12
#divindo a fatura mensal
fatura = casa / meses
print(f'Para pagar a casa de {casa:.2f} em {anos} anos')
print(f'A prestação será de R${fatura}')
if fatura > valor:
    print('\033[0;31;43mEmprestimo negado!\033[m')
    print('O valor passou 30% do seu salário')
elif fatura == valor:
    print('Emprestimo APROVADO!')
else:
    print('Emprestimo FEITO!')
