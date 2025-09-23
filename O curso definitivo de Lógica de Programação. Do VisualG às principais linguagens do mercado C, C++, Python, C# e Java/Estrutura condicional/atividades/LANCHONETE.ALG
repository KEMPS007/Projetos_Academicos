Algoritmo "lanchonete"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 21/09/2025
Var
produto,produto1,produto2,produto3,produto4,produto5:real
quantidade:real


Inicio
escrevaL("tabela de preços,1: R$ 5.00, 2: R$ 3.50, 3: R$ 4.80, 4: R$ 8.90, 5: R$ 7.32")
leia(produto)
escreval("quantidade:")
leia(quantidade)
se produto = 1 então
   produto1 <- 5.00 * quantidade
   escreva("Valor a pagar:",produto1:8:2)
   senão
        se produto = 2 então
           produto2 <- 3.50 * quantidade
           escreva("Valor a pagar:",produto2:8:2)
           senão
                se produto = 3 então
                   produto3 <- 4.80 * quantidade
                   escreva("Valor a pagar:",produto3:8:2)
                   senão
                        se produto = 4 então
                           produto4 <- 8.90 * quantidade
                           escreva("Valor a pagar:",produto4:8:2)
                           senão
                                se produto = 5 então
                                  produto5 <- 7.32 * quantidade
                                   escreva("Valor a pagar:",produto5:8:2)
                                fimse
                        fimse

                fimse
         fimse
fimse

Fimalgoritmo
