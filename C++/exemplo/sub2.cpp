// testando subprograma��o FUN��O (int, float, string, char, ...)
// FUN��O tem retorno de algum dado para o programa que o chamou

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
	cout<<"Digite um n�mero: "; cin>>numero;
	cout<<"O quadrado de "<<numero<<" � "<<quadrado(numero)<<endl;
	
	cout<<"O quadrado de 100 � "<<quadrado(100)<<endl;
	
	int raio;
	cout<<"Digite o raio: "; cin>>raio;
	cout<<"A �rea da circunfer�ncia de raio "<<raio<<" � "<<PI()*quadrado(raio)<<endl;
	
}
