#include<iostream>
#include <stdio.h>
#include <ctype.h>
#include<bits/stdc++.h>
using namespace std;
main()
{
	// trabalho de cleidiane e dâmaris 
	setlocale(LC_ALL,"Portuguese");
	int n, q, i, m,l,c, j;
	cout<<"diga a quantidade de alunos: "; cin>>n;
	cout<<"quantidade de questões: "; cin>>m;
	int acertos[m];
	float nota[n],a=0, maior=0,aprovado=0,reprovado=0, media=0,mediag=0;
	string nome[n],matriz[n][m],gabarito[m];
	for(i=0;i<m;i++)
	{   
		do
		{
			cout<<"questão "<<i+1<<": "; cin>>gabarito[i];
			transform(gabarito[i].begin(), gabarito[i].end(), gabarito[i].begin(), ::toupper);
			if(gabarito[i]!="A" and gabarito[i]!="B" and gabarito[i]!="C" and gabarito[i]!="D" and gabarito[i]!="E")
					cout<<"Resposta inválida. Digite apenas 'A,B,C,D,E'"<<endl;	
	   	}
	  	while(gabarito[i]!="A" and gabarito[i]!="B" and gabarito[i]!="C" and gabarito[i]!="D" and gabarito[i]!="E");
	   	acertos[i]=0;
	}
		for(l=0;l<n;l++)
		{
			cout<<"diga o nome do aluno: "; cin>>nome[l];
			for(c=0;c<m;c++)	
			{
				do{
				cout<<"questão "<<c+1<<": "; cin>>matriz[l][c];
				transform(matriz[l][c].begin(), matriz[l][c].end(), matriz[l][c].begin(), ::toupper);
				if(matriz[l][c]!="A" and matriz[l][c]!="B" and matriz[l][c]!="C" and matriz[l][c]!="D" and matriz[l][c]!="E")
					cout<<"Resposta inválida. Digite apenas 'A,B,C,D,E'"<<endl;	
				}
				while(matriz[l][c]!="A" and matriz[l][c]!="B" and matriz[l][c]!="C" and matriz[l][c]!="D" and matriz[l][c]!="E");
				if(matriz[l][c]==gabarito[c])
				{
					acertos[c]++;
					a++;				
				}
					
					
			}
		
			nota[l]=(a/m)*10;
			media=media+nota[l];
			cout<<endl<<nota[l]<<endl;
			a=0;
			if(nota[l]>maior)
			{
				maior=nota[l];
			}
			if(nota[l]>=5)
			{
				cout<<"aprovado"<<endl;
				aprovado++;
			}else
			{
				cout<<"reprovado"<<endl;
				reprovado++;
			}
   		}
		
		for (c=0;c<m;c++)
		{
			cout<<"Tiveram "<<acertos[c]*100/m<<"%"<<" acertos na questão "<<c+1<<endl;
		
		}	
		cout<<"quantidade de aprovados: "<<aprovado<<endl<<"porcentagem de aprovados: "<<aprovado*100/n<<"%"<<endl;
		cout<<"quantidade de reprovados: "<<reprovado<<endl<<"porcentagem de reprovados: "<<reprovado*100/n<<"%"<<endl;
		
		for(l=0;l<n;l++)
		{
			cout<<nome[l]<<" Nota: "<<nota[l]<<endl;
		}
		
		cout<<"aprovados: "<<endl;
		for(l=0;l<n;l++)
		{
			if(nota[l]>=5)
			{
				cout<<nome[l]<<" Nota "<<nota[l]<<endl;			
			}
		
		}
		mediag=media/n;
		cout<<"média geral dos candidatos: "<<endl;
		cout<<mediag;
		cout<<endl<<"maior nota é: "<<endl;
		cout<<maior<<endl;
		cout<<"pertence a: "<<endl;
		for(l=0;l<n;l++)
		{  
			
			if(nota[l]==maior)
				{
				cout<<nome[l]<<endl;
				}
		}
		
	
		
		

	


}
