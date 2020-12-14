/*
 Escrever um programa que lê 3 valores (a, b e c) e calcula:
a) A área do trapézio que tem a como base maior, b como base menor e c como altura.
area do trapezio = ((basemaior + basemenor)/2 )∗ altura
b) A área do quadrado que tem o valor da variável b como lado
area do quadrado = lado²
c) A área da superfície de um cubo que tem c por aresta
área do cubo = 6 ∗ aresta²

 */
package lista04;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade04 {
    private static void trapezio(double a, double b , double c ){
        System.out.println("area do trapezio: " + ((a+b)/2)*c); 
    }
    private static void quadrado( double b ){
        System.out.println("area do quadrado: " + b*b);
        
    }
     private static void cubo(double c ){
         System.out.println("area da superficie do cubo: " + 6 * c);
    }
     
    public static void atividade(){
        String[] opcoes = {"a","b","c"};
        double[] valores;
        valores = new double[3];
        Scanner escreva = new Scanner (System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("por favor informe o valor " + opcoes[i] );
            valores[i] = escreva.nextDouble();
            
        }
        trapezio(valores[0],valores[1],valores[2]);
        quadrado(valores[1]);
        cubo(valores[2]);
        
    }
    
}
