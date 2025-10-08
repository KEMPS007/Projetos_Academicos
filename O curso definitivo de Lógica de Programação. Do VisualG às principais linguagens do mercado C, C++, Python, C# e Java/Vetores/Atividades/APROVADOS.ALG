Algoritmo "aprovados"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 05/10/2025
Var
n,i:inteiro
primeiro: vetor [0..9] de real
segundo: vetor  [0..9] de real
soma,media: vetor [0..99] de real
nomes: vetor [0..9] de caracter

Inicio
escreva("Quantos alunos serao digitados?: ")
leia(n)

para i de 0 ate n-1 faca
     escreval("Digite nome, primeira e segunda nota do", i+1,"° aluno: ")
     escreva("NOME: ")
     leia(nomes[i])
     escreva("PRIMEIRO SEMESTRE: ")
     leia(primeiro[i])
     escreva("SEGUNDO SEMESTRE: ")
     leia(segundo[i])
fimpara
para i de 0 ate n-1 faca
     media[i] <- (primeiro[i] + segundo[i]) / 2
fimpara
escreval("ALUNOS APROVADOS: ")
para i de 0 ate n-1 faca
     se media[i] => 6 entao
        escreval(nomes[i])
     fimse
     
fimpara
Fimalgoritmo