#include<iostream>
using namespace std;

void linha()
{
	cout<<"--------------------------------"<<endl;
}

void linha_especial(char C, int N)
{
	for (int i=1; i<=N;i++)
	{
		cout<<C;
	}
	cout<<endl;
}
main()
{
	setlocale(LC_ALL,"Portuguese");
	int x=20;
	linha();
	linha_especial('*', 50);
	linha_especial('a',x);
	char caracter;
	cout<<"digite um caracter: "; cin>>caracter;
	linha_especial(caracter,30);
	
	linha();
}
