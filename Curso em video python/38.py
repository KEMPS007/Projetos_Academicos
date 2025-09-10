n1 = int(input('Digite um numero inteiro:'))
n2 = int(input('Digite outro numero inteiro:'))
if n1 > n2:
    print(f'O primeiro número {n1} é maior')
elif n2 > n1:
    print(f'O segundo número {n2} é maior')
else:
    print(f'\033[6;31;40mNão existe maior, o valor são iguais\033[m')

