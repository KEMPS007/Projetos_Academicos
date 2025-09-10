nota = float(input('Digite a sua nota: '))
nota2 = float(input('Digite a sua segunda nota: '))
MEDIA = (nota + nota2) / 2
if MEDIA < 5.0:
    print(f'{MEDIA} SUA MÉDIA ESTÁ BAIXA VOCÊ FOI REPROVADO!')
elif   5.0  >= MEDIA < 7.0:
    print(f'{MEDIA} VOCÊ ESTA EM RECUPERAÇÃO')
elif MEDIA >= 7.0:
    print(f'{MEDIA} PARABENS VOCÊ FOI APROVADO')




