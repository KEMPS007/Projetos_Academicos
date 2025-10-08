Algoritmo "dados_pessoas"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 06/10/2025
Var
n,i,cont,cont1: inteiro
sexo:caracter
maior:real
menor:real
media:real
soma:real
m: vetor [ 0..99] de caracter
f: vetor [0..99] de caracter
altura:vetor[0..99] de real
alturaM: vetor[0..99] de real
alturaF: vetor[0..99] de real
Inicio
escreva("Quantas pessoas serao digitadas?: ")
leia(n)
cont <- 0
cont1 <- 0
para i de 0 ate n-1 faca
     escreva("Altura da ",n+1,"° pessoa: ")
     leia(altura[i])
     escreva("Genero da", n+1, "° pessoa: ")
     leia(sexo)
     
     se sexo = "m" entao
        m[i] <- sexo
        alturaM[i] <- altura[i]
        cont1 <- cont1 + 1
     senao
          se sexo = "f" entao
             f[i] <- sexo
             alturaF[i] <- altura[i]
             soma<- soma + alturaF[i]
             cont<- cont + 1
          fimse
     fimse
fimpara

media <- soma/cont
maior <-altura[0]
menor <-altura[0]
para i de 0 ate n-1 faca
     se altura[i] > maior entao
        maior <- altura[i]
     fimse
     se altura[i] < menor entao
        menor <- altura[i]
     fimse
fimpara

escreval("Menor altura= ",menor)
escreval("Maior altura= ",maior)
escreval("Media das alturas das mulheres = ",media:4:2)
escreva("Numero de homens = ",cont1)

Fimalgoritmo