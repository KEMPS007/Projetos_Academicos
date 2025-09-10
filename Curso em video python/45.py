import random
from time import sleep
n = int(input('''[1] PEDRA
[2] PAPEL
[3] TESOURA
Esolha um numero de 1 a 3:'''))
#opcao = {1: 'PEDRA', 2: 'PAPEL', 3: 'TESOURA', }
if n == 1:
    print('Você escolheu: PEDRA')
elif n == 2:
    print('Você escolheu: PAPEL')
elif n == 3:
    print('Você escolheu: TESOURA')
else:
    print("Valor invalido tente novamente!")

jokenpo = random.randint(1,3)
print(opcao[jokenpo])
if n == opcao[jokenpo]:
    print('empate')






