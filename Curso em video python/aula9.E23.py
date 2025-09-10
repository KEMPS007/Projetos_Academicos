numero = str(input('digite um numero de 0 a 9999: '))
n = len(numero)
print(f'unidade:{numero[0]}')
print(f'dezena:{numero[1]}')
print(f'centena: {numero[2]}')
print(f'milha: {numero[3]}')

# Resolução
num = int(input('digite um numero de 0 a 9999:'))
n = num // 1 % 10
d = num // 10 % 10
c = num // 100 % 10
m = num // 1000 % 10
print(f'unidade:{n}')
print(f'dezena:{d}')
print(f'centena:{c}')
print(f'milha:{m}')