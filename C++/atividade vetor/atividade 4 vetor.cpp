#include<iostream>
using namespace std;
/*
Receber do usuário uma lista de N nomes, sexo e idades de pessoas, onde N é fornecido
inicialmente pelo usuário. Mostrar o nome, o sexo e a idade da pessoa mais idosa e da pessoa
mais jovem. Mostrar a relação (nome e idade) das mulheres e, após, dos homens.
 
*/
main()
{
	setlocale(LC_ALL,"Portuguese");
	int n, i;
	cout<<"quantos nomes? "; cin>>n;
	string nome[n],velho, teen;
	char sexo[n];
	int idade[n], velha=0, jovem=999999;
	for(i=0;i<n;i++)
	{
		cout<<"diga o nome: "; cin>>nome[i];
		cout<<"seu sexo(F/M): "; cin>>sexo[i];
		if(sexo[i]!='f' and sexo[i]!='F' and sexo[i]!='M' and sexo[i]!='m')
		{
			cout<<"sexo foi informado de forma errada, tente novamente usando 'f' para feminino e 'm' para masculino: ";
			cin>>sexo[i];
		}
		
		cout<<"sua idade: ";cin>>idade[i];
		
		
		
		if(idade[i]>velha)
		{
			velha=idade[i];
			
		
		}
		if(idade[i]<jovem)
		{
			jovem=idade[i];
		}
		
		
	}
	cout<<"a idade da pessoa mais velha é: "<<velha<<endl;
	cout<<"nome das pessoas mais velhas: ";
	for(i=0;i<n;i++)
	{
		if(idade[i]==velha)
		 {
	 		cout<<nome[i]<<" ";
	 	
		 }
	}
	
	
	cout<<endl<<"a idade da pessoa mais nova é: "<<jovem<<endl;
	cout<<"nomes das pessoas mais novas: ";
	for(i=0;i<n;i++)
	{
		if(idade[i]==jovem)
			 {
	 			cout<<nome[i]<<" ";
	 	
		 }
	}


	for(i=0;i<n;i++)
	{
		if(sexo[i]=='f' or sexo[i]=='F')
		{
		cout<<nome[i]<<" tem "<<idade[i]<<endl;
		}
	}
	
	for(i=0;i<n;i++)
	{
			if(sexo[i]=='m' or sexo[i]=='M')
			{
			cout<<nome[i]<<"tem "<<idade[i]<<endl;
			}
		
	}
		
	 

}
