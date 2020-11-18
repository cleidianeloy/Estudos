#include<iostream>
#include<time.h>
#include<stdlib.h>
using namespace std;

main()
{
	setlocale(LC_ALL,"Portuguese");
	srand(time(NULL));
	int A[3][3],B[3][3],C[3][3],l, c;
	
	for(l=0;l<3;l++)
	{
		for(c=0;c<3;c++)
		{
				A[l][c]=rand()%10;
				cout<<"["<<A[l][c]<<"]";
		}
		
		cout<<endl;
	}
	 cout<<" X "<<endl;
	for(l=0;l<3;l++)
	{
		for(c=0;c<3;c++)
		{
				B[l][c]=rand()%10;
				cout<<"["<<B[l][c]<<"]";
		
		 }
		 cout<<endl;
	}
		 cout<<" = "<<endl;
	for(l=0;l<3;l++)
	{
		for(c=0;c<3;c++)
		{
				C[l][c]=A[l][c]*B[l][c];
				cout<<"["<<C[l][c]<<"]";
		
		 }
		 cout<<endl;
	}
	
}
