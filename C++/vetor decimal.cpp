#include<iostream>
#include<time.h>
#include<stdlib.h>
#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
using namespace std;

main()

{
	setlocale(LC_ALL,"Portuguese");
	srand(time(NULL));
	float vetor[8];
	int i;
	
	
	for(i=0;i<8;i++)
	{
			vetor[i]=rand()%20;
			cout<<"["<<i<<"]= "<<vetor[i]<<endl;
			
	}

	for (i=1;i<8;i++)
	{
		
		cout<<vetor[i]<<"  ";
	}
}
