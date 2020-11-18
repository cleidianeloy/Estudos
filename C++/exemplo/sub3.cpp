/* desenvolver uma função que retorne o IMC onde IMC deverá receber o parâmetro PESO.
*/
#include<iostream>
using namespace std;

float IMC(float peso, float altura)
{
	float R;
	R = peso / (altura * altura);	
	return(R);
}

string Categoria_IMC(float IMC)
{
	if (IMC<=18.5)		return("Muito abaixo do peso");
	else if (IMC<=24.9)	return("Peso normal");
	else 				return("fazer o resto");
}

main()
{
	setlocale(LC_ALL,"Portuguese");
	
	float P, A;
	
	cout<<"Peso     : ";cin>>P;
	cout<<"Altura   : ";cin>>A;
	cout<<"IMC      : "<<IMC(P,A)<<endl;
	cout<<"Categoria: "<<Categoria_IMC(IMC(P,A))<<endl;
}
