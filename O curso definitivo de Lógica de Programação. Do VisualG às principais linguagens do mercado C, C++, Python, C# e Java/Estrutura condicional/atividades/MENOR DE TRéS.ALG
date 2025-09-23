Algoritmo "menor de trés"

Var
 a,b,c,valor: inteiro


Inicio
escreval("Primeiro valor:")
leia(a)
escreval("Segundo valor:")
leia(b)
escreval("terçeiro valor:")
leia(c)

se (a < b) e (a < c) entao
 escreval("menor:", a)
senão
 se(b < a) e (b < c) entao
 escreval("menor:",b)
   senão (c < a) e (c < b) entao
      escreval("menor:",c)
    fimse
fimse


Fimalgoritmo
