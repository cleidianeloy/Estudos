/*
Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um programa
que calcule peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7*h) – 58
Para mulheres: (62.1*h) – 44.7
Onde h equivale a altura da pessoa.

 */
package Atividades;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade10 {
    public static void atividade(){
        double peso = 0.0;
        Scanner escreva = new Scanner (System.in);
        System.out.println("Informe sua altura");
        double h = escreva.nextDouble();
        System.out.println("Informe seu sexo (masculino ou feminino)");
        String sexo = escreva.next();
        if("masculino".equals(sexo)){
            peso = (72.7 * h) - 58.0 ;
        }else if("feminino".equals(sexo)){
            peso = (62.1*h) - 44.7;
        }
        System.out.println("peso ideal segundo as informações fornecidas: " + peso);
        
    }
}
