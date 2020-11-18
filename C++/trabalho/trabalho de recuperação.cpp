/*Desenvolva um programa em C++ para simular o funcionamento de um caixa eletr�nico.
A funcionalidade se basear� em dois m�dulos: Sacar e Recarregar.
As c�dulas utilizadas devem ser: 2, 5, 10, 20, 50 e 100 reais.
Defina, inicialmente, a quantidade 10 para cada c�dula.
A estrutura e o tipo das vari�veis � crit�rio seu.
O m�dulo Recarregar dever� solicitar a quantidade de cada c�dula. Esta quantidade dever� ser acrescentada ao que j� existe.
No reposit�rio de notas, o limite m�ximo para cada c�dula � de 200.
O m�dulo Sacar dever� solicitar o valor a ser retirado.
O caixa n�o deve aceitar saques:
- superior a 1000 reais;
- inferior a 10 reais;
- quando n�o existam as c�dulas necess�rias; ou
- quando o valor n�o � v�lido, ou seja, n�o h� combina��o de notas poss�vel.
Na impossibilidade do saque dever� ser informado o motivo. Caso contr�rio, informar as c�dulas sacadas e deduzir do reposit�rio. A prioridade � utilizar a distribui��o �tima, ou seja, as notas de maior valor para minimizar a quantidade de c�dulas. Ex.: 245: 2 de 100; 2 de 20; 1 de 5.
O programa poder� conter fun��es como o void para os m�dulos e outras de acordo com a estrat�gia.*/

#include<iostream>
#include<bits/stdc++.h>
using namespace std;

main()
{
	setlocale(LC_ALL,"portuguese");
 	string escolha;
	cout<<"ol�, bem vindo ao caixa eletronico"<<endl;
	cout<<"c�lulas disponiveis: 2,5,10,20,50,100"<<endl;
	cout<<"qual seu procedimento? saque ou deposito"; cin>>escolha;
	transform(escolha.begin(), escolha.end(), escolha.begin(), ::toupper);
}
