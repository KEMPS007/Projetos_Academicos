import datetime
d= datetime.date.today().year
contador = 0
contador2 = 0
contador3 = 0
for c in range(1,7+1):
    ano = int(input(f"digite o {c}° ano de nascimento:"))
    idade = d - ano
    if idade >= 18:
        #print('maior de idade')
        contador2 = contador2 + 1
    else:
        #print('menor de idade')
        contador = contador + 1
    contador3 = contador3 + 1
print(f'De {contador3} pessoas, {contador2} é maior de idade e {contador} é menor de idade. ')