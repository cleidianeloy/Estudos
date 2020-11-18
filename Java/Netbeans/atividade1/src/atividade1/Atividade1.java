
package atividade1;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
       /* a) Declare as variáveis c, estaEhUmaVariavel, q76354 e numero como sendo
        do tipo int.*/
       int c, estaEhUmaVariavel, q76354, numero;
       /*b) Exiba um diálogo que solicita ao usuário para digitar um inteiro*/
       Scanner escreva = new Scanner (System.in);
       
        System.out.println("por favor, digite um numero: ");
        numero = escreva.nextInt();
        System.out.println(numero);
        
       /*c) Converta um String em um inteiro e armazene o valor convertido na
        variável inteira age. Pressuponha que o String seja armazenado em
        stringValue.*/
        int age;
        System.out.println("por favor, digite sua idade");
        String auxiliar = escreva.next();
        age = Integer.parseInt(auxiliar);
        
        /*d) Imprima a mensagem “Este é um programa Java” em uma linha na janela
        de comando.*/
        System.out.println("Este é um programa Java");
       
       /* e) Imprima a mensagem “Este é um programa Java”em duas linhas na janela
        de comando, na qual a segunda linha termina com Java. Utilize apenas uma
        instrução.*/
        System.out.print("Este é um programa\nJava");
        
        
               
       
    }
    
}
