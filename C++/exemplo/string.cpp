#include<iostream>
#include<bits/stdc++.h> // Biblioteca pra usar o transform

using namespace std; 
  
int main() {
	setlocale(LC_ALL,"Portuguese");

    string exemplo = "Olá mundo"; 
  	
  	//Transforma toda a string pra maiúsculo
    transform(exemplo.begin(), exemplo.end(), exemplo.begin(), ::toupper); 
    cout << exemplo << endl; 
   
   	//Transforma toda a string pra minúsculo
    transform(exemplo.begin(), exemplo.end(), exemplo.begin(), ::tolower); 
    cout << exemplo << endl; 
   
  system("Pause");
}
