# DESENVOLVA UM PROGAMA QUE PERGUNTE A DISTÂCIA DE UMA VIAGEM EM KM. CALCULE O PREÇO DA PASSAGEM, COBRANDO R$ 0,50 POR KM PARA VIAGENS DE ATÉ 200KM E R$0,54 PARA VIAGENS MAIS LONGAS.
from time import sleep
print("Bom dia!")
local = str(input('Para qual cidade voce deseja ir ? '))
km = float(input('Me informe a distacia da sua viagem em KM: '))

print(f'CALCULANDO...')
sleep(2)
if km <= 200:
    print(f'O preço da sua passagem para {local} R$ {km*0.50:.2f}')
else:
    print(f'O preço da passagem para {local} R$ {km*0.45:.2f}')