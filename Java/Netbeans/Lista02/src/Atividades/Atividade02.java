/*Escreva um aplicativo para solicitar ao usuário a digitação de dois números inteiros, que
obtém os números do usuário e exibe o maior entre eles seguido pelas palavras “é maior”
em um diálogo de mensagem de informação. Se os números forem iguais, ele imprime a
mensagem “os números são iguais!”.*/
package Atividades;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade02 {

    
    public static void atividade() {
        Scanner escreva = new Scanner (System.in);
        int[] numeros;
        numeros = new int[2];
        
        for (int i = 0; i <2; i++) {
            System.out.println("Escreva o " + (i+1) + "º numero");
            numeros[i]= escreva.nextInt();
        }
       
       
        System.out.println("os valores são: " + numeros[0] + " e " + numeros[1]);
        
        
        if(numeros[0] > numeros[1]){
            System.out.println(numeros[0] + " é o maior");
        }
        if(numeros[0] < numeros[1])
        {
            System.out.println(numeros[1] + " é o menor");
        }
        if(numeros[0] == numeros[1]){
            System.out.println("os dois numeros são iguais");
        }
        
    } 
}
