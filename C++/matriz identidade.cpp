#include<iostream>
using namespace std;

main()
{
	setlocale(LC_ALL,"Portuguese");
	int N;
	
	cout<<"Diga um numero";
	cin>>N;

	int M[N][N], L,C;
	
	for(L=0;L<N;L++)
	{
		for(C=0;C<N;C++)
		{
			if(L==C)
			{
				M[L][C]=1;
				cout<<M[L][C]<<endl;
			
			}else
			{
				M[L][C]=0;
				cout<<M[L][C]<<endl;
			}		
			
		}
		
	}
	
	
	
}
