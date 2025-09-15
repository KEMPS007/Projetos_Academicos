peso = float(input("Qual o seu peso:"))
altura = float(input("Qual a sua altura:"))
imc = peso / (altura * altura)
if imc < 18.5:
    print("IMC abaixo de 18,5: Abaixo do Peso")
elif imc >= 18.5 and imc < 25:
    print("Entre 18,5 e 25: Peso Ideal")
elif imc >= 25 and imc <30:
    print("25 até 30: Sobrepeso")
elif imc >= 30 and imc < 40:
    print("30 até 40: Obesidade")
else:
    print("Acima de 40: Obesidade Mórbida")