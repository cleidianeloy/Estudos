// testando subprogramação VOID (vazio)

#include<iostream>
using namespace std;

void linha()
{
	cout<<"------------------------------"<<endl;
}

void linha_especial(char C, int N)
{
	int i;
	for (i=1; i<=N; i++)
	{
		cout<<C;
	}
	cout<<endl;
}

void boas_vindas(string usuario)
{
	cout<<"Seja bem-vindo, "<<usuario<<"!!!"<<endl;
}

main()
{
	setlocale(LC_ALL,"Portuguese");
	int x=20;
	linha();
	boas_vindas("joão");
	
	linha_especial('*', 50);
	linha_especial('#', x);
	
	char caracter;
	cout<<"Digite um caracter: "; cin>>caracter;
	linha_especial(caracter, 30);
		
	linha();
}
