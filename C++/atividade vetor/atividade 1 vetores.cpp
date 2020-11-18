#include<iostream>
using namespace std;

/*
Um time de basquete possui 12 jogadores. Deseja-se um programa que, dado o nome e a altura
dos jogadores, determine:
- o nome e a altura do jogador mais alto;
- a média de altura do time;
- a quantidade de jogadores com altura superior a média, listando o nome e a altura de cada um.
 
*/

main()
{	
	setlocale(LC_ALL,"Portuguese");
	int C;
	string nome[12], Nalto;
	float altura[12],alto=0, soma=0, media;
	
	for (C=0;C<12;C++)
	{
		cout<<"diga o nome do jogador: ";
		cin>>nome[C];
		cout<<"diga a altura do jogador: ";
		cin>>altura[C];
		
		soma=soma+altura[C];
		
			if(altura[C]>alto)
		{
			alto=altura[C];
	
		}

		

	}
	cout<<"maior  altura: "<<alto<<" ";
	for (C=0;C<12;C++)
	{
		if(altura[C]==alto)
		{
			cout<<endl<<nome[C]<<endl;
		}
	
			
	}
	
	// fazer relatorio dos jogadores mais altos
	
	media=soma/12;
	cout<<"media dos jogadores: "<<media<<endl;
	
	for (C=0;C<12;C++)
	{
		if(altura[C]>=media)
	
		cout<<"altura maior ou igual a media: "<<endl<<nome[C]<<endl;
	}
	
	
	//fazer relatorio jogadores maiores ou iguais que a media
}
