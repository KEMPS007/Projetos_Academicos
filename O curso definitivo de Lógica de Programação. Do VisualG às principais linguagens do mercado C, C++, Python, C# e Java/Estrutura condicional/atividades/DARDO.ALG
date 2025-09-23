Algoritmo "dardo"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/09/2025
Var
tentativa,tentativa1,tentativa2:real


Inicio
escreva("jogue o 1° dardo:")
leia(tentativa)
escreva("jogue o 2° dardo:")
leia(tentativa1)
escreva("jogue o 3° dardo:")
leia(tentativa2)
se (tentativa > tentativa2) e (tentativa > tentativa1)ENTAO
   escreva("MAIOR DISTANCIA:",tentativa)
senao
     se (tentativa1 > tentativa) e (tentativa1 > tentativa2)ENTAO
        escreva("MAIOR DISTANCIA:",tentativa1)
     senao
          escreva("MAIOR DISTANCIA:", tentativa2)
      FIMSE
FIMSE
Fimalgoritmo

