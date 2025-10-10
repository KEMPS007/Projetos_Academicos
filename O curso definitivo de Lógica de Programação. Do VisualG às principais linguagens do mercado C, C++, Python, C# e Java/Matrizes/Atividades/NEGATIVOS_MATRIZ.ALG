Algoritmo "negativos_matriz"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 10/10/2025
Var
m,n,i,j:inteiro
mat: vetor [0..10, 0..10] de real
vet:vetor [0..10] de real

Inicio
escreva("Qual a quantidade de linhas da matriz? :")
leia(m)
escreva("Qual a quantidade de colunas da matriz? :")
leia(n)

para i de 0 ate m-1 faca
     para j de 0 ate n-1 faca
          escreva("Elemento [", i, ",", j, "]: ")
          leia(mat[i,j])
     fimpara
fimpara
escreval("VALORES NEGATIVOS: ")
para i de 0 ate m-1 faca
     para j de 0 ate n-1 faca
          se mat[i,j] < 0 entao
             escreval(mat[i,j])
          fimse
     fimpara
fimpara


Fimalgoritmo