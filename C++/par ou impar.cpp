#include<iostream>
using namespace std;

main()
{
	setlocale(LC_ALL,"portuguese");
	
	int numero;
	
	cout<<"digite um n�mero: ";
	cin>>numero;
	
	if(numero%2 == 0)
	{
		cout<<numero<<" � par"<<endl;
	}
	else
	{
		cout<<numero<<" � impar"<<endl;
	}
	system("pause");
}
