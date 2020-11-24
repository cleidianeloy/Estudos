import mysql.connector

def conexao(hostname,username,senha,databasename):
    mydb = mysql.connector.connect(
    host= hostname,
    user= username,
    password= senha,
    database= databasename
    )
    return mydb

mydb = conexao("localhost","root","","mercado")
mycursor = mydb.cursor()
def criarBanco():
    mycursor.execute("CREATE DATABASE IF NOT EXISTS mercado")
def apagarBanco():
    mycursor.execute("DROP DATABASE mercado")

def inserirEstoque(codigo,nomeProduto,quantidade):
    sql = "INSERT INTO estoque (codigo, nomeproduto,quantidade) VALUES (%s, %s, %s)"
    value = (codigo, nomeProduto, quantidade)
    mycursor.execute(sql,value)
    mydb.commit()
    print(mycursor.rowcount, "atualizado com sucesso.")
def inserirGondolas(codigo, quantidade):
    sql = "INSERT INTO gondolas (codigo, numeroMaximo, numeroAtual) VALUES (%s, %s, %s)"
    value = (codigo, quantidade, "0")
    mycursor.execute(sql,value)
    mydb.commit()
    print(mycursor.rowcount, "atualizado com sucesso.")
def pesquisaNome(nomeProduto):
     sql = "SELECT * FROM estoque WHERE nomeProduto LIKE '%" + nomeProduto + "%'"
     mycursor.execute(sql)
     resultado = mycursor.fetchall()

     for x in resultado:
        print(x)

def pesquisaCodigo(codigo):
    sql = "SELECT * FROM estoque WHERE codigo = %s"
    value = (codigo, )
    mycursor.execute(sql,value)
    resultado = mycursor.fetchall()

    for x in resultado:
        print(x)
def diminuirGondolas(codigo,quantidade):
     sql = "UPDATE gondolas SET numeroAtual = numeroAtual -%s WHERE codigo = %s"
     value = (quantidade, codigo)
     mycursor.execute(sql,value)
     mydb.commit()
     print(mycursor.rowcount, "atualizado com sucesso.")


def extravio(codigo, quantidade,motivo):
    sql = "INSERT INTO extravio (codigo, quantidade, motivo) VALUES (%s, %s, %s)"
    value = (codigo, quantidade, motivo)
    mycursor.execute(sql,value)
    mydb.commit()
    print(mycursor.rowcount, "atualizado com sucesso.")
    diminuirGondolas(codigo,quantidade)

def retornaCodigo(nome):
    sql = "SELECT codigo FROM estoque WHERE nomeproduto = %s"
    value = (nome, )
    mycursor.execute(sql,value)
    resultado = mycursor.fetchall()
    auxiliar = []
    for x in resultado:
        auxiliar = x[0]
    return auxiliar