/*
Escreva um aplicativo para ler cinco inteiros e determine o maior e o menor inteiro do
grupo, imprimindo os devidos resultados na tela.
 */
package Atividades;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade03 {
    
    public static void atividade() {
        Scanner escreva = new Scanner (System.in);
        int[] numeros;
        int temp;
        numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escreva o " + (i+1) + "º numero");
            numeros[i] = escreva.nextInt();
        }
       
        for (int m = 0; m < numeros.length - 1; m++) { 
            
            for (int j = m+1 ; j < numeros.length; j++) {
                if(numeros[m]>numeros[j]){
                    temp = numeros[m];
                    numeros[m] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
        for(int mostra : numeros){
            System.out.print(mostra);
            
        }
        System.out.println("no menor é o numero: " + numeros[0] + "\n" + "o maior é o numero: " + numeros[4]);
        
    }

}
