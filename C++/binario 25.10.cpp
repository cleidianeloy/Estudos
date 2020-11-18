#include<iostream>
#include<math.h> 
#include<time.h>
#include<stdlib.h>
using namespace std;

main()
{
	setlocale(LC_ALL,"Portuguese");
	srand(time(NULL));
	int C, x[8],potencia=0;
	
	cout<<"numero binário: ";
	for(C=0;C<8;C++)
	{
			x[C]=rand()%2;
			cout<<x[C]<<" ";
		
		
	}
	cout<<endl<<"número binário em decimal: "<<" ";
	
	potencia=potencia+x[7]*pow(2,0);
	potencia=potencia+x[6]*pow(2,1);
	potencia=potencia+x[5]*pow(2,2);
	potencia=potencia+x[4]*pow(2,3);
	potencia=potencia+x[3]*pow(2,4);
	potencia=potencia+x[2]*pow(2,5);
	potencia=potencia+x[1]*pow(2,6);
	potencia=potencia+x[0]*pow(2,7);
	

	cout<<potencia;
	
}

