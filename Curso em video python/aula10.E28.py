#28 Escreva um programa que faça o computador ''pensar'' em um numero entre 0 e 5 e peça para o usuario tentar descobrir qual numero foi escolhido pelo computador.
import random
numero = int(input('Escolha um número entre 0 e 5:'))
n1 = random.choice([1,2,3,4,5])
print(f'O numero escolhido foi {n1}')
if numero == n1:
    print('Você acertou!')
else:
    print('Você errou!')

#Resolução do professor
import time
computador = random.randint(0,5) #Escolhe um numero inteiro de 0 a 5
print('-=-'*20)
print('Vou pensar em um número entre 0 e 5. Tente adivinhar...')
print('-=-'*20)
jogador = int(input('Em qual numero eu pensei?')) # O jogador tenta adivinha
print('PROCESSANDO...')
time.sleep(3)
if jogador == computador:
    print('PARABENS! VOCE ACERTOU!')
else:
    print('Que pena! VOCE ERROU! kkkkkkkkkkkkkkkkkkkkkkk OTARIO!!!')


