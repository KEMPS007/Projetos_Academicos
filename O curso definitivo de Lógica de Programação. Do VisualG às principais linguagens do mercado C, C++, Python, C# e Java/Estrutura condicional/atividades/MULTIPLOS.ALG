Algoritmo "multiplos"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 21/09/2025
Var
numero1,numero2:inteiro


Inicio
escreval("Digite o 1° número:")
leia(numero1)
escreval("Digite o 2° número:")
leia(numero2)
se (numero1 % numero2 = 0) ou (numero2 % numero1 = 0) então
   escreva("São multiplos")
   senão
        escreva("Não são multiplos")
fimse



Fimalgoritmo