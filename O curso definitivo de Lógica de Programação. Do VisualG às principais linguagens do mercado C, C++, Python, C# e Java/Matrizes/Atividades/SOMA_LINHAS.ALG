Algoritmo "soma_linhas"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 09/10/2025
Var
m,n,i,j:inteiro
mat: vetor [0..9,0..9] de inteiro
vet: vetor [0..9] de inteiro


Inicio
escreva("Qual a quantidade de linhas da matriz? :")
leia(m)
escreva("Qual a quantidade de colunas na matriz? :")
leia(n)

para i de 0 ate m-1 faca
     escreval("Digite os elementos da", i+1," linha")
     para j de 0 ate n -1 faca
          leia(mat[i,j])
     fimpara
fimpara

para i de 0 ate m-1 faca
     vet[i] <- 0
     para j de 0 ate n-1 faca
          vet[i] <- vet[i] + mat[i,j]
          
     fimpara
fimpara

escreval("VETOR GEREDO")
para i de 0 ate m-1 faca
     escreval(vet[i]:3:1)
fimpara

Fimalgoritmo