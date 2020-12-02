/*
 Faça um programa que receba o valor do salário de uma pessoa e o valor de um
financiamento pretendido. Caso o financiamento seja menor ou igual a 5 vezes o salário da
pessoa, o algoritmo deverá escrever “Financiamento Concedido"; senão, ele deverá
escrever "Financiamento Negado". Independente de conceder ou não o financiamento, o
programa deve mostrar a frase "Obrigado por nos consultar."
 */
package Atividades;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade18 {
    public static void atividade(){
        Scanner escreva = new Scanner (System.in);
        System.out.println("informe o valor do seu salário");
        double salario = escreva.nextDouble();
        System.out.println("informe o valor do financiamento pretendido");
        double financeamento = escreva.nextDouble();
        String resultado = (financeamento<=(salario*5)) ? "Financeamento Concedido" : "Financeamento Negado";
        System.out.println(resultado);
        System.out.println("Obrigado por nos consultar.");
    }
    
}
