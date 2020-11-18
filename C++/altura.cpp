/* leia a altura e o sexo (M para masculino ou F para feminino) de um conjunto de N pessoas, onde N é lido no inicio do programa
obtenha e mostre na tela:
a) A maior e a menor altura do grupo;
b) A média de altura das mulheres ( Soma de todas as alturas das mulheres / número de mulheres);
c) Número total de homens.*/


#include<iostream>
using namespace std;

main()
{ setlocale(LC_ALL,"portuguese");
	float altura,maior=0, menor=999999999.9, alturaF;
	char sexo;
	int N, cont=1, contF=0, contM=0;
	
	cout<<"diga a quantidade de pessoas: "<<endl;
	cin>>N;
	while(cont<=N)
	{
		cout<<"diga a altura: ";
		cin>>altura;
		cout<<"diga o sexo (F/M): ";
		cin>>sexo;
		
		while(sexo!='F' and sexo!='f' and sexo!='M' and sexo!='m')
		{
			cout<<"sexo está declarado de forma errada!!"<<endl<<"tente de novo (usando M para masculino e F para feminino)";
			cin>>sexo;
		}
		if(altura<menor)
		{
			menor=altura;
		}
		if(altura>maior)
		{
			maior=altura;
		}
		
		
		
		if(sexo=='F' or sexo=='f')
		{
			contF++;
			alturaF=alturaF+altura;
			
			
		}else
		if(sexo=='M' or sexo=='m')
		{
			contM++;
		}
		cont++;
	}
	
	cout<<"menor altura de todas: "<<menor<<endl;
	cout<<"maior altura de todas: "<<maior<<endl;
	cout<<"media da altura das mulheres: "<<alturaF/contF<<endl;
	cout<<"numero total de homens: "<<contM<<endl;
	
	system("pause");
}
