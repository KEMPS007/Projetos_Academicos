primeiroTermo = int(input("Digite o primeiro termo: "))
razao = int(input('Digite a razao: '))
decimo = primeiroTermo + 10 * razao
for c in range(primeiroTermo,decimo,razao):
    print(c, end=' => ')