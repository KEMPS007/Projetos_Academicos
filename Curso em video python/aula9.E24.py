cidade = input('Digite o nome da cidade: ')
s = cidade.split()
print(f'A sua cidade começa com Santos ? {s[0],'santos'in cidade}')


# resolução
cid = str(input('Digite o nome da cidade: ')).strip()
print(cid[:5].upper() == 'SANTOS')