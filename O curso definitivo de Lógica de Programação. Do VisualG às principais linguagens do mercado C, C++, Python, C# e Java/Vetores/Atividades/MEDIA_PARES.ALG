Algoritmo "media_pares"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 05/10/2025
Var
N,I:inteiro
vet: vetor [0..99] de real
media,soma,pares:real

Inicio
escreva("Quantos elementos vai ter o vetor?: " )
leia(n)

para i de 0 ate n-1 faca
     escreva("Digite um numero: ")
     leia(vet[i])
fimpara

escreval

soma <- 0
pares <- 0
para i de 0 ate n-1 faca
     se vet[i] mod 2 = 0 entao
        soma <- soma + vet[i]
        pares <- pares + 1
     fimse
fimpara

   se pares = 0 entao
      escreval("NENHUM NUMERO PAR")
   senao
        media <- soma / pares
        escreva("MEDIA DOS PARES: ",media )
   fimse





Fimalgoritmo