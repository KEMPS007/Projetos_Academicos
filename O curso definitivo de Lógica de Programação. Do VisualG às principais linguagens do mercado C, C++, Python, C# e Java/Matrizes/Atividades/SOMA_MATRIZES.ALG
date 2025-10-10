Algoritmo "soma_matrizes"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 10/10/2025
Var
n,m,i,j:inteiro
a,b,c: vetor [0..9,0..9] de inteiro


Inicio
escreva("Quantas linhas vai ter cada matriz?: ")
leia(n)
escreva("Quantas colunas vai ter cada matriz?: ")
leia(m)
escreval("Digite os valores da matriz A: ")
para i de 0 ate n-1 faca
     para j de 0 ate m-1 faca
          escreva("Elemento[",i,",",j,"]: ")
          leia(a[i,j])
     fimpara
fimpara
escreval("Digite os valores da matriz B: ")
para i de 0 ate n-1 faca
     para j de 0 ate m-1 faca
          escreva("Elemento[",i,",",j,"]: ")
          leia(b[i,j])
     fimpara
fimpara


para i de 0 ate n-1 faca
     para j de 0 ate m-1 faca
          c[i,j] <- a[i,j] + b[i,j]
          escreva(c[i,j])
     fimpara
     escreval
fimpara
escreval

Fimalgoritmo