#include<iostream>
#include<time.h>
#include<stdlib.h>
#include<math.h> 
using namespace std;

main()
{
	setlocale(LC_ALL,"Portuguese");
	srand(time(NULL));
	int i,j;
	int vetor[8],potencia[8]={0,1,2,3,4,5,6,7},resultado=0;	
	for (i=8;i>0;i--)
	{
	
			//cout<<"Digite o "<<i+1<<"o valor: ";cin>>vetor[i];
			
			vetor[i]=rand()%2;
			cout<<"["<<i<<"]= "<<vetor[i]<<endl;
	
				
	} 
		for(j=0;j>8;j++)
		{
			resultado=resultado+vetor[i]*pow(2,potencia[j]);
		}	
			
		

		cout<<resultado<<"  ";
		
	
}

