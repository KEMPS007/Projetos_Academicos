Algoritmo "experiencias"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 01/10/2025
Var
N,i,qte,totalCobaias,totalSapos,totalCoelhos,totalRatos:inteiro
pratos,pcoelhos,psapos: real
tipoCobaia: caractere



Inicio
totalRatos<-0
totalCoelhos<-0
totalSapos <-0
escreva("Quantos casos testes serão digitados? ")
leia(n)
para i de 1 ate n faca
     escreva("Quantidades de cobaias: ")
     leia(qte)
     escreva("tipo de cobaia: ")
     leia(tipoCobaia)
     
     se tipoCobaia = "r" entao
        totalRatos <- totalRatos + qte
     senao
          se tipoSapos = "s" entao
             totalSapos <- totalSapos + qte
          senao
               totalCoelhos <- totalCoelhos + qte
          fimse
     fimse
fimpara

totalCobais <- totalRatos + totalSapos + totalCoelhos
pratos<- totalRatos/totalCobais * 100
pcoelhos<- totalCoelhos/ totalCobais * 100
psapos<- totalSapos/ totalCobais * 100

escreval()
escreval("RELATORIO FINAL")
escreval("TOTAL:",totalCobais,"COBAIAS")
escreval("TOTAL DE COELHOS:",totalCoelhos)
escreval("TOTAL DE SAPOS",totalSapos)
escreval("TOTAL DE RATOS",totalRatos)
escreval("PORCENTUAL DE COELHOS: ",pcoelhos)
escreval("PORCENTUAL DE SAPOS: ",psapos)
escreval("PORCENTUAL DE RATOS: ",pratos)
Fimalgoritmo