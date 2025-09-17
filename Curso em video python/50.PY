soma=0
cont = 0
for i in range(1,7):
    s=int(input(f"nummero {i}°:"))
    if s %2==0:
        soma = soma + i
        cont = cont + 1
print(f"Você informou {cont} números pares e a soma foi {soma}")

