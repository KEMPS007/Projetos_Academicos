Algoritmo "operadora"

Var
 minutus,valor:real


Inicio
 escreval("Minutus consumidos:")
 leia(minutus)
 se minutus < 100 então
   escreval("Valor total:50.00$")
    senão minutus > 100 então
      valor <- (minutus - 100) * 2 + 50
      escreval("Valor total:",valor,"$")
     fimse



Fimalgoritmo
