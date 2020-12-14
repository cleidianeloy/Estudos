/*
Implemente os seguintes métodos inteiros:
a) O método celsius retorna o equivalente em Celsius de uma temperatura em
Fahrenheit utilizando o cálculo C = 5.0 / 9.0 * (F – 32);
b) O método fahrenheit retorna o equivalente em Fahrenheit de uma temperatura em
Celsius. F = 9.0/5.0 * C + 32.
 */
package lista04;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade11 {
    private static double celsius(double f ){
        double c = 5.0 / 9.0 * (f - 32);
        
        return c;
    }
    private static double fahrenheit(double c){
        double f = 9.0 / 5.0 * c + 32;
        return f;
    }
    
    public static void atividade(){
        Scanner escreva = new Scanner (System.in);
        System.out.println("Escreva uma temperatura em Cº");
        double c = escreva.nextInt();
        double f = fahrenheit(c);
        System.out.println("Temperatura "+ c + "Cº é o mesmo que " + f + "Fº");
        System.out.println("Agora Escreva uma temperatura em Fº");
        f = escreva.nextDouble();
        c = celsius(f);
        System.out.println("Temperatura "+ f + "Fº é o mesmo que " + c + "Cº");        
        
    }
}
