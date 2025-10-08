Algoritmo "abaixo_da_media"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 05/10/2025
Var
N,i:inteiro
M:vetor[0..99] de real
soma,media:real


Inicio
escreva("Quantos elementos vai ter o vetor?: ")
leia(n)

soma<-0

para i de 0 ate n-1 faca
     escreva("Digite um numero: ")
     leia(M[i])
     soma<- soma + M[i]
fimpara

escreval

media <- soma / n
escreval("MEDIA DO VETOR = ",media:5:3)


escreval("ELEMENTOS ABAIXO DA MEDIA:")
para i de 0 ate n-1 faca
   se M[i] < media entao

      escreval(M[I])
   fimse
fimpara

Fimalgoritmo