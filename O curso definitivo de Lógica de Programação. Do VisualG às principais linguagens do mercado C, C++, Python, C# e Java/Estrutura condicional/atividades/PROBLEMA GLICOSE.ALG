Algoritmo "Problema glicose"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/09/2025
Var
medida:real

Inicio
 escreval("Digite a medida da glicose:")
 leia(medida)
se medida <= 100 então
    escreval("Classificacao: normal")
senão
     se (medida <= 140) então
         escreval("Classificacao: elevado")
      senão
           escreval("Classificacao: diabetes")
           fimse
fimse


Fimalgoritmo