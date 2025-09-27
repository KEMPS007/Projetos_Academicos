Algoritmo "media_idades"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 25/09/2025
Var
 idade,soma,cont:inteiro
 media:real


Inicio
soma <- 0
cont <- 0
escreval("Digite as idades:")
leia(idade)
enquanto idade >= 0 faca
         soma <- soma + idade
         cont <- cont + 1
         leia(idade)
fimenquanto
se cont = 0 entao
   escreva("IMPOSSIVEL CALCULAR")
senao
     media <- soma / cont
     escreval("media =", media:4:2)
fimse

Fimalgoritmo