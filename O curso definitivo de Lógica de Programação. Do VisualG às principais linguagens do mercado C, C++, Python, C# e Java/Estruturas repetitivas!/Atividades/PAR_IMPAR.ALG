Algoritmo "par_impar"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 30/09/2025
Var
n,i,x:inteiro




Inicio
escreva("Digite um número:")
leia(n)
para i de 1 ate n faca
     escreva("Digite um número:")
     leia(x)
     se x = 0 entao
        escreval("NULO")
     senao
          se x < 0 entao
             se x mod 2 = 0 entao
                escreval("Par Negativo")
             senao
                  escreval("impar Negativo")
             fimse
          senao
               se x mod 2 = 0 entao
                    escreval("Par Positivo")
               senao
                     escreval("impar positivo")
               fimse
          fimse

     fimse
fimpara


Fimalgoritmo
