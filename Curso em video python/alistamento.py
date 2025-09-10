import datetime
print('Bom dia!')
ano = int(input('Digite o ano de nascimento: '))

#CONVER TER UMA STRING EM DATA

#ano atual
atual = datetime.date.today().year
idade = atual - ano
if idade < 18:
    print(f'Você tem menos de 18 anos.')
    print(F'falta {idade - 18} para voce se alistar.')
elif idade > 18:
    print(f'já passou o tempo do alistamento. Você devia ter se alistado em {18 - idade} .')
else:
    print('você está com a idade para o alistamento.')