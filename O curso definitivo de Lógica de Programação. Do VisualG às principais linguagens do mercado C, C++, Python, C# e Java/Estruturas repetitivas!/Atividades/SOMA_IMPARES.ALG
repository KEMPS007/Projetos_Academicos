Algoritmo "soma_impares"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 29/09/2025
Var
x,y,i,soma,troca:inteiro


Inicio
escreval("Digite 2 números")
leia(x)
leia(y)
se x > y entao
   troca <- x
   x <- y
   y <- troca
fimse
soma <- 0
para i de x+1 até y-1 faca
     se i % 2 <> 0 entao
        soma <- soma + i
     fimse
fimpara
escreval("soma dos impares =", soma)
Fimalgoritmo