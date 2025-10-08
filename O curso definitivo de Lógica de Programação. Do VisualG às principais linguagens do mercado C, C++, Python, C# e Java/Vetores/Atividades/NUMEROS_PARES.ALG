Algoritmo "numeros_pares"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 04/10/2025
Var
n,i, soma: inteiro
pares:vetor [0..9] de inteiro


Inicio
escreva("Quantos numeros voce vai digitar?: ")
leia(n)
soma <- 0
para i de 0 ate n-1 faca
     escreva("Digite um numero:")
     leia(pares[i])
     se pares[i] mod 2 = 0 entao

        soma <- soma + 1
     fimse
fimpara
para i de 0 ate n-1 faca
     se pares[i] mod 2 = 0 entao
        escreval("NUMEROS PARES",pares[i])
     fimse
fimpara
escreval
escreval("quantidades de pares:",soma)
Fimalgoritmo