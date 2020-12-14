/*
 Escreva um método potenciaInteiro(base,expoente) que retorna o valor de
base(expoente)
Por exemplo potenciaInteiro(3,4) = 3 * 3 * 3 * 3. Pressuponha que expoente é um inteiro
diferente de zero positivo e base é um inteiro. O método potenciaInteiro deve utilizar for ou 
while para controlar o cálculo. Não utilize nenhum método da biblioteca de matemática
 */
package lista04;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade09 {
    private static int potenciaInteiro(int base, int expoente){
        int resultado = base;
        for (int i = 0; i < expoente-1; i++) {
           
           resultado*=base;
        }
       
        return resultado;
    }
    public static void atividade(){
        Scanner escreva = new Scanner (System.in);
        System.out.println("escreva a base de um numero");
        int base = escreva.nextInt();
        System.out.println("escreva o expoente de um numero");
        int expoente = escreva.nextInt();
        int resultado = potenciaInteiro(base,expoente);
        System.out.println("resultado: " + resultado);
    }
    
}
