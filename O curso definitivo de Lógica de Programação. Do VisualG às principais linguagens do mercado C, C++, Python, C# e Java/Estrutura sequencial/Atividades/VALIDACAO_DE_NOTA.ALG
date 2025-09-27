Algoritmo "validacao_de_nota"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 25/09/2025
Var
x,y,media:real


Inicio
escreval("Digite a primeira nota:")
leia(x)
escreval("Digite a segunda nota:")
leia(y)
enquanto (x < 0) ou (x > 10) faca
         escreval("Valor invalido! Tente novamente:")
         leia(X)
fimenquanto
enquanto (y < 0) ou (y > 10) faca
         escreval("Valor invalido! Tente novamente:")
         leia(y)
fimenquanto
media <- (x + y) / 2
escreva("MEDIA =",media)
Fimalgoritmo
