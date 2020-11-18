#include<iostream>
using namespace std;

main()
{	
	setlocale(LC_ALL,"Portuguese");
	int N=0, contador=0,Cnotas=0;
	char nome[20];
	float nota=0, soma=0, somaM=0,media=0, mediaT=0;

	
	cout<<"diga a quantidade de alunos: ";
	cin>>N;
	int x[N];
	for (contador=1;contador<=N;contador++)
	{
		soma=0;
		cout<<"diga o nome do "<<contador-1+1<<"º aluno: ";
		cin>>x[contador];
		
		for (Cnotas=1;Cnotas<=3;Cnotas++)
		{
			cout<<"diga a "<<Cnotas-1+1<<"º nota: ";
			cin>>x[Cnotas];
			
		}
		cout<<nome<<" e sua notas: ";
		for (Cnotas=1;Cnotas<=3;Cnotas++)
		{
			cout<<x[Cnotas]<<" ";
			soma=soma+x[Cnotas];
		}
		
		media=soma/3;
	
		cout<<endl<<"sua média: "<<media<<" ";
		somaM=somaM+media;
		
			if(media>=6)
		{
			cout<<"aprovado"<<endl;
		}else
		{
			cout<<"reprovado"<<endl;
		}
		
		
	}
	
		mediaT=somaM/N;
	cout<<"media geral da turma: "<<mediaT<<endl;
	
			
}

		

