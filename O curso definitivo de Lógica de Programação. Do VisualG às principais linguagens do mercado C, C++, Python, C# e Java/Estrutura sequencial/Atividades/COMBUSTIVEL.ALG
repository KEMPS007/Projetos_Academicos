Algoritmo "combustivel"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 26/09/2025
Var
x,alcool,diesel,gasolina,fim:inteiro


Inicio
alcool <- 0
gasolina <-0
diesel <-0
escreva("Informe um codigo (1, 2, 3) ou 4 para parar:")
leia(x)
enquanto x <> 4 faca
         se x = 1 entao
            alcool <- alcool + 1
         senao
              se x = 2 entao
                 gasolina <- gasolina + 1
              senao
                   se x = 3 entao
                      diesel <- diesel + 1
                   fimse
              fimse
         fimse
         escreva("Informe um codigo (1, 2, 3) ou 4 para parar:")
         leia(x)
fimenquanto
escreval("Alcool:",alcool)
escreval("Gasolina:",gasolina)
escreval("Diesel:",diesel)

Fimalgoritmo