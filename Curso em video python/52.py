contador = 0
numero = int(input("Escreva um numero: "))
for c in range(1,numero +  1):
    if numero % c == 0:
        print("\033[32m", end=' ')
        contador = contador + 1
    else:
        print("\033[31m", end=' ')
    print(c, end=' ')
print(f'\n\033[mO número {numero} foi dividido por {contador} vezes')
if contador == 2:
    print('E por isso ele é PRIMO')
else:
    print('E por isso ele NÃO É PRIMO')