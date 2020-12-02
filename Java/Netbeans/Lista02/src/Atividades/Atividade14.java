/*
Escrever um programa para ler o nome e a quantidade de horas/aula de dois professores e
o valor por hora recebido por cada um. Mostrar na tela qual dos professores tem salário
total maior.
 */
package Atividades;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade14 {
    public static void  atividade(){
        String[] nome;
        nome = new String[2];
        int[] quantidade;
        quantidade = new int[2];
        double[] valorPHora;
        valorPHora = new double[2];
        double[] valorTotal;
        valorTotal = new double[2];
        Scanner escreva = new Scanner(System.in);
        
        
        for(int i = 0; i < 2; i++) {
            System.out.println("por favor informe o nome do professor");
            nome[i] = escreva.next();
            System.out.println("por favor informe a quantidade de horas do professor "+ nome[i] );
            quantidade[i] = escreva.nextInt();
            System.out.println("por favor informe o valor de hora recebido pelo professor "+ nome[i]);
            valorPHora[i] = escreva.nextDouble();
        }
        for(int i = 0; i < 2; i++) {
            valorTotal[i] = valorPHora[i]*quantidade[i];
        }
        if(valorTotal[0]>valorTotal[1]){
            System.out.println("O maior salário é do professor " + nome[0]);
         
        }else
        {
            System.out.println("O maior salário é do professor "+ nome[1]);
        }
        
        
    }
}
