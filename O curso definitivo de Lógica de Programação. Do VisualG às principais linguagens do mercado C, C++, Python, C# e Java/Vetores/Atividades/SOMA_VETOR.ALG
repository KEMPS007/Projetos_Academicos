Algoritmo "soma_vetor"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 03/10/2025
Var
n,i:inteiro
soma,media:real
vet:vetor[0..9] de real


Inicio
escreva("Quantos números você vai digitar: ")
leia(n)

para i de 0 ate n-1 faca
     escreva("Digite um número:")
     leia(vet[i])
fimpara
escreval
escreva("VALORES = ")
para i de 0 ate n-1 faca
     escreva(vet[i]:3:1)
fimpara

soma <- 0
para i de 0 ate n-1 faca
     soma <- soma + vet[i]
fimpara
escreval
escreval("soma = ", soma:4:2)
media <- soma / n
escreval("MEDIA = ", media:4:2)
Fimalgoritmo