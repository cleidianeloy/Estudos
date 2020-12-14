/*
Faça um programa que determine o volume de uma caixa de d’água cilíndrica, sendo que o
raio e a altura devem ser fornecidos pelo usuário. O cálculo do volume da caixa deverá ser
realizado por um método.

volume = pi * raio² * altura
 */
package lista04;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade05 {
    private static double volume(double altura, double raio){
        return Math.PI * Math.pow(raio, 2) * altura;
    }
    public static void atividade(){
        Scanner escreva = new Scanner (System.in);
        System.out.println("Informe o raio do cilindro");
        double raio = escreva.nextDouble();
        System.out.println("informe a altura do cilindro");
        double altura = escreva.nextDouble();
        
        double volume = volume(altura,raio);
        System.out.println("O volume do cilindro é: " + volume);
        
    }
    
    
}
