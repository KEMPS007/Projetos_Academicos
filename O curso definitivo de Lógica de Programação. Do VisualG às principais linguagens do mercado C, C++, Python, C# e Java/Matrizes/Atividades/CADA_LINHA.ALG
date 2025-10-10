Algoritmo "cada_linha"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 10/10/2025
Var
n,i,j,maior:inteiro
mat: vetor [0..9,0..9] de inteiro


Inicio
escreva("Qual a ordem da matriz? : ")
leia(n)

para i de 0 ate n-1 faca
     para j de 0 ate n-1 faca
          escreva("Elemento [", i, ",", j, "]: ")
          leia(mat[i,j])
     fimpara
fimpara
escreval("MAIOR ELEMENTO DE CADA LINHA: ")

para i de 0 ate n-1 faca
     maior <- mat[i,0]
     para j de 0 ate n-1 faca
          se mat[i,j] > maior entao
             maior <- mat[i,j]
             escreval(maior)
          fimse

     fimpara
     escreval(maior)
fimpara

Fimalgoritmo