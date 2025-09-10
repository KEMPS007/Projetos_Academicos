import datetime
atletas = int(input('Qual o ano do seu nascimento? '))

atual = datetime.date.today().year
idade = atual - atletas
if idade <= 9:
    print('Você Esta classificado na categoria: mirim')
elif idade <= 14:
    print('VocÊ Esta classificado na categoria: infantil')
elif idade <= 19:
    print('Você Esta classificado na categoria: junior')
elif idade <= 25:
    print('Você Esta classificado na categoria: senior')
else:
    print('Você Esta classificado na categoria: master')
