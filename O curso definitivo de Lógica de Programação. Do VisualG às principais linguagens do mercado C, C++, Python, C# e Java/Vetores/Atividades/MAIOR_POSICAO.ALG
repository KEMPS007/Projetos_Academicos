Algoritmo "maior_posicao"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 04/10/2025
Var
n,i:inteiro
p:vetor [0..9] de real
maior,posicao:real

Inicio
escreva("Quanto numeros voce vai digitar?: ")
leia(n)
para i de 0 ate n-1 faca
     escreva("Digite um numero: ")
     leia(p[i])
fimpara
maior <- p[0]
posicao <- 0
para i de 0 ate n-1 faca
     se p[i] > maior entao
        maior <- p[i]
        posicao <- i
     fimse
fimpara
escreval("MAIOR VALOR =",maior)
escreva("POSICAO DO MAIOR VALOR",posicao)










Fimalgoritmo