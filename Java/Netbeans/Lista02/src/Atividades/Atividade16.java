/*
Escrever um programa para ler dois valores e uma das seguintes operações a serem
executadas (codificadas da seguinte forma: 1 – Adição, 2 – Subtração, 3 – Multiplicação e
4 – Divisão). Calcular e escrever o resultado dessa operação sobre os dois valores lidos.
 */
package Atividades;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade16 {
    public static void atividade(){
        Scanner escreva = new Scanner(System.in);
        System.out.println("informe o primeiro valor");
        int n1 = escreva.nextInt();
        System.out.println("informe o segundo valor");
        int n2 = escreva.nextInt();
        System.out.println("informe a operação sendo que: 1 – Adição, 2 – Subtração, 3 – Multiplicação e 4 – Divisão ");
        int operacao = escreva.nextInt();
        
       switch(operacao){
           case 1:
               System.out.println("Adição foi escolhida");
               System.out.println("resultado: " + (n1+n2));
               break;
           case 2:
               System.out.println("Subtração foi escolhida");
               System.out.println("resultado: " + (n1-n2));
               break;
           case 3:
               System.out.println("Multiplicação foi escolhida");
               System.out.println("resultado: " + (n1*n2));
               break;
           case 4:
               System.out.println("Divisão foi escolhida");
               System.out.println("resultado: " + (n1/n2));
               break;
           default:
               System.out.println("A opção escolhida não é valida");
       }
               
    }
}
