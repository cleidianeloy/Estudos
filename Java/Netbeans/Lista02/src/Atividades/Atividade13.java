/*
 Escrever um programa para ler cinco valores inteiros, calcular a sua média, e escrever na
tela os números que são superiores à média.
 */
package Atividades;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade13 {
    public static void atividade(){
        Scanner escreva = new Scanner (System.in);
        int[] valores;
        int soma = 0;
        
        valores = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("escreva o " + (i+1)+ "º valor");
             valores[i] = escreva.nextInt();
            
        }
        for(int auxiliar: valores){
            soma+=auxiliar;
        }
        double media = soma/5;
        System.out.println("Valores superiores a media:");
        for (int auxiliar : valores) {
           if(auxiliar>media){
               System.out.print(auxiliar + " ");
           }
        }
    }
}
