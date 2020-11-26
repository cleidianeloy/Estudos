/*
 Escreva um aplicativo que faça a leitura de um inteiro e identifica se ele é ímpar ou par.
 */
package Atividades;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade05 {
     public static void atividade() {
        
         Scanner escreva = new Scanner (System.in);
         System.out.println("Informe um numero:");
         int numero = escreva.nextInt();
         String retorna = (numero%2==0) ? "par" : "impar";
         System.out.println(retorna);
    }
}
