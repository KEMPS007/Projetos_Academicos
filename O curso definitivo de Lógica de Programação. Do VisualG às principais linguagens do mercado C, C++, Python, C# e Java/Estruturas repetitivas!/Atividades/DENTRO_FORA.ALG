Algoritmo "dentro_fora"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 30/09/2025
Var
n,x,i,dentro,fora:inteiro



Inicio
escreva("digite um número:")
leia(n)
dentro <-0
fora<-0
para i de 1 ate n faca
     escreval("digite um número:")
     leia(x)
     se (x >= 10) e (x <= 20) entao
        dentro<- dentro + 1
     senao
          fora<- fora + 1
     fimse


fimpara
escreval("entre o intervalo de 10 a 20 ")
escreval(dentro," estão dentro")
escreva(fora," estão fora")

Fimalgoritmo