# .29 ESCREVA UM PROGRAMA QUE LEIA A VELOCIDADE DE UM VEICULO. SE ULTRAPASSAR 80KM/H MOSTRE UMA MENSSAGEM DIZENDO QUE FOI MULTADO. A MULTA VAI CUSTA R$7,00 POR CADA KM ACIMA DO LIMITE
velocidade =int(input('Qual a velocidade atual do veiculo ?'))
if velocidade > 80:
    print(f'\033[1;31;42mVOCÊ ULTAPASSOU O LIMITE DE 80KM/H \033[m')
    print(f'\033[1;31mVOCÊ SERÁ MULTADO EM R${(velocidade - 80) * 7:.2f}\033[m')
else:
    print('Tenha um bom dia, dirija com segurança!')


