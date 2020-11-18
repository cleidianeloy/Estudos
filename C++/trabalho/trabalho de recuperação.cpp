/*Desenvolva um programa em C++ para simular o funcionamento de um caixa eletrônico.
A funcionalidade se baseará em dois módulos: Sacar e Recarregar.
As cédulas utilizadas devem ser: 2, 5, 10, 20, 50 e 100 reais.
Defina, inicialmente, a quantidade 10 para cada cédula.
A estrutura e o tipo das variáveis é critério seu.
O módulo Recarregar deverá solicitar a quantidade de cada cédula. Esta quantidade deverá ser acrescentada ao que já existe.
No repositório de notas, o limite máximo para cada cédula é de 200.
O módulo Sacar deverá solicitar o valor a ser retirado.
O caixa não deve aceitar saques:
- superior a 1000 reais;
- inferior a 10 reais;
- quando não existam as cédulas necessárias; ou
- quando o valor não é válido, ou seja, não há combinação de notas possível.
Na impossibilidade do saque deverá ser informado o motivo. Caso contrário, informar as cédulas sacadas e deduzir do repositório. A prioridade é utilizar a distribuição ótima, ou seja, as notas de maior valor para minimizar a quantidade de cédulas. Ex.: 245: 2 de 100; 2 de 20; 1 de 5.
O programa poderá conter funções como o void para os módulos e outras de acordo com a estratégia.*/

#include<iostream>
#include<bits/stdc++.h>
using namespace std;

main()
{
	setlocale(LC_ALL,"portuguese");
 	string escolha;
	cout<<"olá, bem vindo ao caixa eletronico"<<endl;
	cout<<"células disponiveis: 2,5,10,20,50,100"<<endl;
	cout<<"qual seu procedimento? saque ou deposito"; cin>>escolha;
	transform(escolha.begin(), escolha.end(), escolha.begin(), ::toupper);
}
