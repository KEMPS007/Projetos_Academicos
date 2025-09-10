nome = input('Fale o seu nome completo:').strip()
m = nome.upper()
n = nome.lower()


#nome.replace(" ",'')
#nn =  nome.replace( ' ',' ')
nm = len(nome)   - nome.count(' ')

divide = nome.split()
numero = len(divide[0])



print(f'O nome em maiúsculo: {m}')
print(f'O nome em menúsculo: {n}')
print(f'O nome completo tem {nm} letras')
print(f'O primeiro nome tem {numero} letras')