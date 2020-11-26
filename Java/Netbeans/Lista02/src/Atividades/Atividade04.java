/*
Resolva a questão anterior usando o operador condicional ternário.
 */
package Atividades;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade04 {
    public static void atividade() {
        Scanner escreva = new Scanner (System.in);
        int[] numeros;
        int maior=0 , menor =0;
        numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escreva o " + (i+1) + "º numero");
            numeros[i] = escreva.nextInt();
            
        }
        for(int auxiliar : numeros){
            maior = (auxiliar>maior) ? auxiliar : maior;
           
        }
        menor = maior;
        for(int auxiliar : numeros){
            menor = (auxiliar<menor) ? auxiliar : menor;
            
        }
       
        System.out.println("maior:"+ maior + "\n"+ "menor:" + menor);
    }    
}
