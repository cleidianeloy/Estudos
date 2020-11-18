#include<iostream>
#include<unistd.h> // include do sleep
using namespace std;

main()
{	setlocale(LC_ALL,"portuguese");
	int cont;
	for(cont=10;cont>=0; cont--)
	{
		cout<<cont<<" ";
		sleep(1); //para por um segundo
					
		
	}
	cout<<"fogo!!"<<endl;
	
	system("pause");
}
