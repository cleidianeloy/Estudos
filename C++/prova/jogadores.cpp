#include<iostream>
using namespace std;
main()
{
	setlocale(LC_ALL,"Portuguese");
	int n, i;
	cout<<"informe quantos jogadores: "; cin>>n;
	int   idade[n]={0}, soma=0, juvenil=0; 
	float altura[n]={0}, media=0.0;
	string nome[n]={"a"};
	
	for(i=0;i<n;i++)
	{
		cout<<"informe o nome do jogador: "; cin>>nome[i];
		cout<<"informe a altura do jogador: "; cin>>altura[i];
		cout<<"informe a idade"; cin>>idade[i];
		
		soma=soma+idade[i];
	
	}
	
	for(i=0;i<n;i++)
	{
		cout<<"nome: "<<nome[i]<<endl;
		cout<<"idade: "<<idade[i]<<endl;
		cout<<"altura: "<<altura[i]<<endl;
	}
	media=soma/n;
	cout<<"media das idades: "<<media<<endl;
	
	for(i=0;i<n;i++)
	{
		if(idade[i]<=21)
		{
			juvenil++;
		}
	}
	cout<<"percentual de jogares juvenis: "<<juvenil*100/n<<"%";
	
}
