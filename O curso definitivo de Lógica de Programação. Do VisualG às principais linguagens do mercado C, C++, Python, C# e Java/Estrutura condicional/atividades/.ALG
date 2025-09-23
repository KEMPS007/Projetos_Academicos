Algoritmo ""tempo_de_jogo"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 22/09/2025
Var
inici,final,hora:inteiro


Inicio
escrevaL("Hora inicial:")
leia(inici)
escreval("Hora final:")
leia(final)
se (final = 0) e (inici = 0)então
escreva("24H")
senão
     se (inici > final)então
        hora <- (24 - inici) + final
        escreva("tempo de jogo",hora)
        senão
             se (inici < final) então
                hora <-  final - inici
                escreva("tempo de jogo:",hora)

fimse
fimse
Fimalgoritmo
