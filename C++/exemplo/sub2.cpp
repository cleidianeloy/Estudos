// testando subprogramação FUNÇÃO (int, float, string, char, ...)
// FUNÇÃO tem retorno de algum dado para o programa que o chamou

#include<iostream>
using namespace std;

double PI()
{
	return (3.14159265359);
}

float quadrado(float N)
{
	float R;
	R = N * N;
	return(R);
}

main()
{
	setlocale(LC_ALL,"Portuguese");
	cout<<PI()<<endl;
	
	float numero;
	cout<<"Digite um número: "; cin>>numero;
	cout<<"O quadrado de "<<numero<<" é "<<quadrado(numero)<<endl;
	
	cout<<"O quadrado de 100 é "<<quadrado(100)<<endl;
	
	int raio;
	cout<<"Digite o raio: "; cin>>raio;
	cout<<"A área da circunferência de raio "<<raio<<" é "<<PI()*quadrado(raio)<<endl;
	
}
