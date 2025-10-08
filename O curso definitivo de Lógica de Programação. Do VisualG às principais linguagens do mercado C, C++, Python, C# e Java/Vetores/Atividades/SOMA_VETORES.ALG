Algoritmo "soma_vetores"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 04/10/2025
Var
n,i:inteiro
a,b,c: vetor[0..99] de inteiro

Inicio
escreva("Quantos valores vai ter cada vetor?: ")
leia(n)
para i de 0 ate n-1 faca
     escreva("Digite os valores do vetor A: ")
     leia(a[i])
fimpara

escreval

para i de 0 ate n-1 faca
     escreva("Digite os valores do vetor B: ")
     leia(b[i])
fimpara

escreval

para i de 0 ate n-1 faca
     c[i] <- a[i] + b[i]
     escreval("Digite os valores do vetor B:",c[i])
fimpara

Fimalgoritmo