/* faça um programa para ler um vetor com N nomese idades, onde N deve ser lido no inicio do programa
apresente o mesmo vetor classificado pela idade */
#include<iostream>
using namespace std;
main()
{
	setlocale(LC_ALL,"Portuguese");
	int n, i, j;
	cout<<"quantos nomes? ";cin>> n;
	string nome[n], aux;
	int idade[n], auxidade;
	
	for(i=0;i<n;i++)
	{
		cout<<"diga o nome: ";
		cin>>nome[i];
		cout<<"diga sua idade: ";
		cin>>idade[i];
		
	}
	for(j=0;j<n;j++)
	{
		for(i=0;i<n-(j+1);i++)
		{
			if(idade[i]>idade[i+1])
			 {
				auxidade=idade[i];
			 	idade[i]=idade[i+1];
			 	idade[i+1]=auxidade;
			 	
			 	aux=nome[i];
			 	nome[i]=nome[i+1];
			 	nome[i+1]=aux;
			 }
		}
	}
	
	for(i=0;i<n;i++)
	{
		
		cout<<nome[i]<<" "<< idade[i]<<endl;
		
	}
}

 
