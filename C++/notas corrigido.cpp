#include<iostream>
using namespace std;

main()
{	
	setlocale(LC_ALL,"Portuguese");
	int N=0, contador=0;
	float somaM=0, mediaT=0;

	
	cout<<"diga a quantidade de alunos: ";
	cin>>N;
	string x[N];
	float nota1[N], nota2[N],nota3[N], media[N];
	for (contador=0;contador<N;contador++)
	{
		
		cout<<"diga o nome do "<<contador+1<<"� aluno: ";
		cin>>x[contador];
		
	
			cout<<"diga a 1� nota: ";
			cin>>nota1[contador];
			cout<<"diga a 2� nota: ";
			cin>>nota2[contador];
			cout<<"diga a 3� nota: ";
			cin>>nota3[contador];
			
		
		media[contador]=(nota1[contador]+nota2[contador]+nota3[contador])/3;
	
		cout<<endl<<"sua m�dia: "<<media[contador]<<" ";
		somaM=somaM+media[contador];
		
			if(media[contador]>=6)
		{
			cout<<"aprovado"<<endl;
		}else
		{
			cout<<"reprovado"<<endl;
		}
		
		
	}
	
		mediaT=somaM/N;
	for(contador=0;contador<N;contador++)
	{
			cout<< "aluno: "<<x[contador]<<endl;
			cout<<"notas: "<<nota1[contador]<<" "<<nota2[contador]<<" "<<nota3[contador]<<endl;
			cout<<"media: "<<media[contador]<<endl;
	
	}

	cout<<"media geral da turma: "<<mediaT<<endl;
	
			
}

		

