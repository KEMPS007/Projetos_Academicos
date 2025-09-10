import random

n ='alunos que vão participar'
a1 =str(input('aluno 1: '))
a2 =str(input('aluno 2: '))
a3 =str(input('aluno 3: '))
a4 =str(input('aluno 4: '))
lista = [a1, a2, a3, a4,]
random.shuffle(lista)
print(f'O primeiro grupo vai ser {lista}')