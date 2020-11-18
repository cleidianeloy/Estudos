#include<iostream>
#include<time.h>
#include<stdlib.h>
using namespace std;

main()
{
	setlocale(LC_ALL,"Portuguese");
	srand(time(NULL));
	int n, l, c, aux;
	cout<<"escolha o tamanho da matriz: "; cin>>n;
	int A[n][n];
	
	for(l=0;l<n;l++)
	{
		for(c=0;c<n;c++)
		{
				A[l][c]=rand()%10;
				cout<<"["<<A[l][c]<<"]";
		}
		
		cout<<endl;
	}
	cout<<endl;
	
	for(l=0;l<n;l++)
	{
		for(c=0;c<n;c++)
		{
			
				cout<<"["<<A[c][l]<<"]";
		}
		
		cout<<endl;
	}
	cout<<endl;
	
}
