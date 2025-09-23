Algoritmo "temperatura"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 21/09/2025
Var

valorC:caracter
f,c,temperaturaF:real

Inicio
escreval("informe atemperatura:")
leia(temperaturaF)
escreval("informe a escala F° ou C°")
leia(valorC)
se valorC = "f" então
   c <- (5/9) *(temperaturaF - 32)
   escreva("Temperatura equivalente em Celsius:",c:8:2,"°")
senao
     se valorC = "c" então
     f <- 32 + (9* (temperaturaF / 5))
     escreva("Temperatura equivalente em Fahrenheit:",f:8:2,"°")
     fimse
fimse


Fimalgoritmo
