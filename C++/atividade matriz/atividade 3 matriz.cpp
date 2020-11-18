#include<iostream>
#include<time.h>
#include<stdlib.h>
using namespace std;

main()
{
	setlocale(LC_ALL,"Portuguese");
	srand(time(NULL));
	int A[3][3],l, c;
	float B[3]={0,0,0};
	
	for(l=0;l<3;l++)
	{
		for(c=0;c<3;c++)
		{
			
				A[l][c]=rand()%10;
				cout<<"["<<A[l][c]<<"]";
				
			B[l]=B[l]+A[l][c];
				
		}
		
		
		cout<<endl;
	}
	 cout<<endl;
	 
	for(l=0;l<3;l++)
	{
			for(c=0;c<3;c++)
		 {
	 		cout<<"["<<A[l][c]<<"]";
	 		
	 		
	 	
		 }
		 
		 cout<<" =  "<<B[l]/3<<endl;
	}
	

}

