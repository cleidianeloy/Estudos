def CriarMatriz(vetor,tamanho):
    for a in range(3):
        vetor.append([0] * tamanho) 
"""criando uma matriz"""
"""  [colula][linha] """
def PreencherMatriz(vetor,tamanho):
 
    for coluna in range(tamanho):

        for l in range(tamanho): 
            vetor[coluna][l] = int(input("Por favor, digite um numero"))
        
"preencher matriz"

def MatrizSoma(total, parcela1, parcela2,tamanho):
   
    for coluna in range(3):
 
        for l in range(3): 
            total[coluna][l] = parcela1[coluna][l] + parcela2[coluna][l] 

def MatrizMultiplica(total, parcela1, parcela2,tamanho):
   
    for coluna in range(3):
 
        for l in range(3): 
            total[coluna][l] = parcela1[coluna][l] * parcela2[coluna][l]

def MatrizDivide(total, parcela1, parcela2,tamanho):
   
    for coluna in range(3):
 
        for l in range(3): 
            total[coluna][l] = parcela1[coluna][l] / parcela2[coluna][l] 