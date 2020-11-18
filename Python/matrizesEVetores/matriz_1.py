""" Ler duas matrizes A e B, cada uma com duas dimensões com 3 linhas e 3 colunas. Construir uma
matriz C de mesma dimensão, sendo que C é formada pela soma dos elementos da matriz A e B.
Apresentar a matriz C.
 """
from functions.matrizes import CriarMatriz, PreencherMatriz, MatrizSoma
a = []
b = []
c = []


"""criando uma matriz"""
CriarMatriz(a,3)
CriarMatriz(b,3)
CriarMatriz(c,3)

PreencherMatriz(a,3)
print("a é: ")
print(a)
PreencherMatriz(b,3)
print("b é: ")
print(b)
MatrizSoma(c,a,b,3) 
print("resultado final (c): ")
print(c)

