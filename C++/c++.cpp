#include<iostream>
using namespace std;

main()
{
	// inicio do programa
	setlocale(LC_ALL,"portuguese"); // configura idioma
		int A, B, R;
		
		cout<<"digite um numero: ";
		cin>>A;
		cout<<"Digite o segundo número: ";
		cin>>B;
		
		R= A + B;
		cout<<"A soma de "<<A<< " + "<<B<< " é "<<R<<endl; 
		
		system("pause");
} //fim do programa
