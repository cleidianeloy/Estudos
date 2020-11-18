#include<iostream>
using namespace std;
main()
{
	setlocale(LC_ALL,"Portuguese");
	int n, i, maior=0;
	cout<<"informe N: "; cin>>n;
	int vetor[n];
	
	for(i=0;i<n;i++)
	{
	
		cout<<"diga um numero: ";
		cin>>vetor[i];
		
		if(vetor[i]%2==0)
		{
			cout<<endl<<"é par"<<endl;
		}else
		{
			cout<<endl<<"é impar"<<endl;
		}
		
			
	}
	
		for(i=0;i<n;i++)
		{
			if(vetor[i]>maior)
			{
				maior=vetor[i];
			}
		}
	
	for(i=0;i<n;i++)
	{
		cout<<vetor[i]<<" ";
	}

	cout<<endl<<"numeros negativos: ";
	for(i=0;i<n;i++)
	{
		if(vetor[i]<0)
		{
			cout<<vetor[i]<<" ";
		}
		
	}
	cout<<endl<<"numeros positivos: ";
		for(i=0;i<n;i++)
		{
			if(vetor[i]>0)
			{
				cout<<vetor[i]<<endl;
			}
		}
	
	for(i=0;i<n;i++)
	{
		if(vetor[i]==maior)
		{
		 	cout<<"maior numero: "<<vetor[i];
		}
		
	}
		

	
}
