import random
from time import sleep
print('=' * 10, "jokenpô", '=' * 10)
jogador = str(input('''PEDRA
PAPEL
TESOURA
Esolha:''')).upper()
#opcao = {1: 'PEDRA', 2: 'PAPEL', 3: 'TESOURA', }
if jogador == 'PEDRA' or jogador == 'PAPEL' or jogador == 'TESOURA':
    print('Sua escolha foi:', jogador)
else:
    print('COMANDO INVALIDO, TENTE NOVAMENTE!! pedra, papel ou tesoura')
computador = random.choice(["pedra","papel","tesoura"]).upper()
print(f'Computador escolheu: {computador}')
if jogador == computador:
    print("Empate")
elif jogador == "PEDRA" and computador == 'PAPEL':
    print("Computador ganhou!")
elif jogador == "PAPEL" and computador == 'TESOURA':
    print("Computador ganhou!")
elif jogador == 'TESOURA' and computador == 'PEDRA':
    print('Computador ganhou!')
else:
    if computador == 'PEDRA' and jogador == 'PAPEL':
        print('Você ganhou!')
    elif computador == 'PAPEL' and jogador == 'TESOURA':
        print('Você ganhou!')
    elif computador == 'TESOURA' and jogador == 'PEDRA':
        print('Você ganhou!')






