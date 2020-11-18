#include<iostream>
using namespace std;
main()
{
		setlocale(LC_ALL,"Portuguese");
	int n,l,c, i;
	cout<<"diga o tamanho da matriz: "; cin>>n;
	
	string matriz[n][n],  o="o", x="x";
	
	for(l=0; l<n; l++)
	{
		for(c=0;c<n;c++)
		{
			
		
				if(l+c==n-1)
				{
				
					matriz[l][c]=x;
				
				
				}else
				{
					matriz[l][c]=o;
				}
			
			
		
			cout<<"["<<matriz[l][c]<<"]";
		
		}
		
		cout<<endl;
		
	}

	
	
	
	
}
