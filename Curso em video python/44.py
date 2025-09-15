produto = float(input("Digite o valor da compra: "))
print('''Forma de pagamento
[1] AVISTA
[2] CARTÃO AVISTA 
[3] 2X NO CARTÃO
[4] 3X OU MAIS NO CARTÃO 
''')
opcao = int(input("Qual a sua opção?"))
avista = (produto * 10) / 100
n = produto - avista
avitaCartao =  (produto * 5) / 100 - produto
cartao2x = produto / 2
cartao3x = (produto * 20) / 100 + produto
if opcao == 1:
    print(f"à vista dinheiro/cheque: 10% de desconto, o valor do produto: {n}")
elif opcao == 2:
    print(f"à vista no cartão: 5% de desconto, o valor do produto: {avitaCartao}")
elif opcao == 3:
    print(f" em até 2x no cartão: preço formal, o valor do produto: {cartao2x}")
elif opcao == 4:
    print(f" 3x ou mais no cartão: 20% de juro, o valor do produto: {cartao3x}")