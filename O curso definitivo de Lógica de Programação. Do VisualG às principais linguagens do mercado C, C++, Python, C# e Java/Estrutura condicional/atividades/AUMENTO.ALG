Algoritmo "aumento"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 21/09/2025
Var
salario,aumento20,aumento15,aumento10,aumento5,total:real


Inicio
escrevaL("Digite o seu salario:")
leia(salario)
se salario <= 1000 então
   aumento20 <- (salario * 20) / 100
   total <- aumento20 + salario
   escreva("Novo salario:", total, "aumento:", aumento20, "20%")
   senão
        se (salario > 1000) e (salario <= 3000) então
           aumento15 <- (salario * 15) / 100
           total <- aumento15 + salario
           escreva ("Novo salario:", total, "aumento:", aumento15, "15%")
           senão
                se (salario > 3000) e (salario <= 8000) então
                   aumento10 <- (salario * 10) / 100
                   total <- aumento10 + salario
                   escreva("Novo salario:", total,"aumento",aumento10, "10%")
                   senão
                        se (salario > 8000) então
                           aumento5 <- (salario * 5)/ 100
                           total <- aumento5 + salario
                           escreva("novo salario:", total, "aumento:", aumento5,"5%")
                           
           
        
fimse


Fimalgoritmo
fimse
fimse
fimse