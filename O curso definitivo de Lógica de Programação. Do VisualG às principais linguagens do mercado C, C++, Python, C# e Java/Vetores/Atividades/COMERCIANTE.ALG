Algoritmo "comerciante"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/10/2025
Var
n,i,cont,cont1,cont2:inteiro
produto: vetor [0..99] de caracter
precoCompra,precoVenda,porcento: vetor [0..99] de real
totalCompra,totalVenda,lucro:real
Inicio
escreva("Serao digitados dados de quantos produtos? ")
leia(n)
totalCompra <-0
totalvenda <-0
para i de 0 ate n-1 faca
     escreval("produto ", i+1)
     escreva("Nome: ")
     leia(produto[i])
     escreva("Preco de compra: ")
     leia(precoCompra[i])
     totalCompra <- totalCompra + precoCompra[i]
     escreva("preço de venda: ")
     leia(precoVenda[i])
     totalVenda <- totalVenda + precoVenda[i]
fimpara
lucro <- totalVenda - totalCompra
cont <- 0
cont1 <- 0
cont2 <- 0
escreval("RELATORIO:")
para i de 0 ate n-1 faca
     porcento[i] <- (precoVenda[i] - precoCompra[i])/ precoCompra[i] * 100
     se porcento[i] < 10 entao
       cont <- cont + 1
     senao
        se porcento[i] <= 20 entao
           cont1 <- cont1 + 1
        senao
           se porcento[i] > 20 entao
              cont2 <- cont2 + 1
           fimse
        fimse
     fimse
fimpara

escreval("Lucro abaixo de 10%: ",cont)
escreval("Lucro entre 10% e 20%: ",cont1)
escreval("Lucro acima de 20%: ",cont2)
escreval("Valor total de compra: ",totalCompra:4:2)
escreval("Valor total de venda: ",totalVenda:4:2)
escreva("Lucro total: ",lucro:4:2)
Fimalgoritmo