#include<iostream>
#include<math.h> 
using namespace std;

main()
{
	setlocale(LC_ALL,"Portuguese");
	int N=0,C=0,i=0,aux=0,j=0,P=0;
	int x[8], potencia[8]={0,1,2,3,4,5,6,7}, resultado=0;
	for(C=0;C<8;C++)
	{
		cout<<"diga um digito de um numero binário (1/0): "<<endl;
		cin>>x[C];
		
	}
	
	cout<<"vetor gerado: "<<" ";
	for(C=0;C<8;C++)
	{
		cout<<x[C]<<" ";
	}
	for(j=0;j<8-1;j++)
	{
	
		for(C=0;C<N-(j+1);C++)
		{
			if(x[C]>x[C+1])
			{
				aux=x[C];
				x[C]=x[C+1];
				x[C+1]=aux;
				
			}
	
		}
		
		cout<<endl<<"vetor final: "<<" ";
	
	}
	
		for(P=0;P<8;P++)
		{
					
			resultado=resultado+x[C]*pow(2,potencia[P]);
			
			
		}
	cout<<resultado<<" ";	
}
	
