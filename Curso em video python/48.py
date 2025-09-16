soma=0
cont = 0
for calculo in range(1,501,2):
    if calculo% 3==0:
        cont = cont + 1
        soma=soma+calculo
print(f"A soma de todos os {cont} valores solicitados é {soma}")








