Algoritmo "coordenadas"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 22/09/2025
Var
x,y:real

Inicio
escreva("Valor de X:")
leia(x)
escreva("Valor de Y:")
leia(y)
se (x = 0) e (y = 0)então
   escreva("Origem")
   senão
        se (x < 0) e (y < 0) então
           escreva("Q3")
           senão
                se (x < 0) e (y > 0) então
                   escreva("Q2")
                   senão
                        se ( x > 0) e (y < 0)então
                        escreva("Q4")
                        senão
                             se (x > 0) e (y > 0) então
                                escreva("Q1")
fimse
fimse
fimse
fimse
fimse

Fimalgoritmo