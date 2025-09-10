import math
N = int(input('qual é o cateto adjacente?'))
n2 = int(input('qual é o cateto oposto?'))
n3 = math.sqrt(N**2 + n2**2)

print(f'o comprimento da hipotenusa é {n3}')