Algoritmo "alturas"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 04/10/2025
Var
n,i,cont:inteiro
soma,mdeia,porcentagem:real
nomes:vetor  [0..9] de caractere
idades:vetor [0..9] de inteiro
altura:vetor [0..9] de real


Inicio
escreva("Quantas pessoas serão digitadas: ")
leia(n)
para i de n-1 faca
     escreva("NOME:")
     leia(nomes)
     escreva("IDADE:")
     leia(idades)
     escreva("altura:")
     leia(altura)
fimpara
soma <- 0
para i de n-1 faca
     soma <- soma + altura[i]
fimpara
media <- soma/n
escreval
escreval(" ALTURA MEDIA:",media:4:2)

cont<-1
para i de 0 ate n-1 faca
     se idades < 16 entao
        cont <- cont + 1
     fimse
fimpara

porcentagem <- cont*100/n
escreval("pessoas com menos de 16 anos:",porcentagem:3:2, "%")

para i de 0 ate n-1 faca
     se idades[i] < 16 entao
        escreval(nomes[i])
     fimse
 fimpara











Fimalgoritmo