/* faça um programa para ler um vetor com N nomes, onde N deve ser lido no inicio do programa
apresente o mesmo vetor classificado alfabeticamente */
#include<iostream>
using namespace std;
main()
{
	setlocale(LC_ALL,"Portuguese");
	int n, i, j;
	cout<<"quantos nomes? ";cin>> n;
	string nome[n], aux;
	
	for(i=0;i<n;i++)
	{
		cout<<"diga o nome: ";
		cin>>nome[i];
		
	}
	for(j=0;j<n;j++)
	{
		for(i=0;i<n-(j+1);i++)
		{
			if(nome[i]>nome[i+1])
			 {
				aux=nome[i];
			 	nome[i]=nome[i+1];
			 	nome[i+1]=aux;
			 }
		}
	}
	
	for(i=0;i<n;i++)
	{
		
		cout<<nome[i]<<" ";
		
	}
}

 
