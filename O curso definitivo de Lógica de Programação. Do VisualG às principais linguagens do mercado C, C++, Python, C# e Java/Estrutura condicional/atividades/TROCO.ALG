Algoritmo "Troco"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 18/09/2025
Var
   produto1,troco2,quantidade,dinheiro,troco,valor:real

Inicio
escreval("Qual o valor do produto ?:")
leia(produto1)
escreval("quantidade:")
leia(quantidade)
valor <- produto1 * quantidade
escreval("valor total:",valor)
escreval("Dinheiro rebido")
leia(dinheiro)
se dinheiro < valor então
   troco <- valor - dinheiro
   escreval("Dinheiro insuficiente, FALTA:",troco,"$")
senão dinheiro > valor então
      troco2 <- dinheiro - valor
      escreval("troco", troco2,"$")
fimse




Fimalgoritmo