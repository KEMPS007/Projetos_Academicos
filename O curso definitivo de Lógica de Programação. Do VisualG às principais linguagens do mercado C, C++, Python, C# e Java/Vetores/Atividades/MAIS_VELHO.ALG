Algoritmo "mais_velho"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 05/10/2025
Var
N,I,maior:inteiro
maiorNome:caracter
nomes: vetor [0..99] de caractere
idades:vetor [0..99] de inteiro

Inicio

escreva("Quantas pessoas voce vai digitar?: ")
leia(N)
para i de 1 ate N faca
     escreval("Dados da", i,"° pessoa: ")
     escreva("NOME: ")
     leia(nomes[i])
     escreva("IDADE: ")
     leia(idades[i])
fimpara

maior <- idades [1]
maiorNome <- nomes[1]

para i de 1 ate N faca
     se maior < idades[i] entao
        maior <- idades[i]
        maiorNome <- nomes[i]
     fimse
fimpara

escreva("PESSOA MAIS VELHA: ",maiorNome)

















Fimalgoritmo