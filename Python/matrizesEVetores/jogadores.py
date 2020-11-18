
""" comentario é assim
Um time de basquete possui 12 jogadores. Deseja-se um programa que, dado o nome e a altura
dos jogadores, determine:
- o nome e a altura do jogador mais alto;
- a média de altura do time;
- a quantidade de jogadores com altura superior a média, listando o nome e a altura de cada um.
"""

x = 1
name = str("")
soma= float(0)
auxiliar=float(0)
altura = float(0)
y= int(0)
media = float(0)
maior = float(0)
nomeMaior= str(" ")
listaNome = []
listaAltura = []

while x <= 12:
    name = input("Por favor, digite o nome ")
    altura =input("por favor, informe a altura de " + name + " ")
    listaNome.append(name)
    listaAltura.append(altura)
    x += 1

""" for x in listaNome: 
#como mostrar os dados organizados
    print(x) 
    print(listaAltura[y])
    y += 1 """
for  contagem in listaAltura:
#transfomando string em float
    auxiliar = float(contagem)
    soma += auxiliar   
    
len = len(listaNome)
media = soma/len
print("media da altura: " )
print(media)

for  contagem in listaAltura:
    novaAltura = float(contagem)
    if novaAltura >maior:
        maior = novaAltura
        nomeMaior = listaNome[y] 
    y += 1
x=0
y=0
print("jogadores maiores ou iguais a media:")
for  contagem in listaAltura:
    novaAltura = float(contagem)
    if novaAltura >= media:
        auxiliar = str(novaAltura)
        x += 1
        print(listaNome[y] + " com a altura de " + auxiliar)
    y += 1
strMaior = str(maior)
print("o jogador mais alto é " + nomeMaior + " com a altura de " + strMaior)

