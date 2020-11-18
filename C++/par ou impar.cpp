#include<iostream>
using namespace std;

main()
{
	setlocale(LC_ALL,"portuguese");
	
	int numero;
	
	cout<<"digite um número: ";
	cin>>numero;
	
	if(numero%2 == 0)
	{
		cout<<numero<<" é par"<<endl;
	}
	else
	{
		cout<<numero<<" é impar"<<endl;
	}
	system("pause");
}
