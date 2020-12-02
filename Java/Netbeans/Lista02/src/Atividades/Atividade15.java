/*
 Escrever um programa que leia valores inteiros em duas variáveis distintas.
* Se o resto da divisão da primeira pela segunda for 1 mostre a soma dessas variáveis
mais o resto da divisão;
* Se for 2 escreva se o primeiro e o segundo valor são pares ou ímpares;
* Se for igual a 3 multiplique a soma dos valores lidos pelo primeiro;
* Se for igual a 4 divida a soma dos números lidos pelo segundo, se este for diferente
de zero.
* Em qualquer outra situação mostre o quadrado dos números lidos.

 */
package Atividades;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade15 {
    public static void atividade(){
         Scanner escreva = new Scanner(System.in);
         System.out.println("informe o primeiro valor");
         int n1 = escreva.nextInt();
         System.out.println("informe o primeiro valor");
         int n2 = escreva.nextInt();
         
        switch (n1%n2) {
            case 1:
                System.out.println("resto:"+ (n1%n2) + "\n"+ "soma:" + (n1+n2));
                break;
            case 2:
                if(n1%2==0){
                    System.out.println(n1 + "é par");
                }else
                {
                    System.out.println(n1 + "é impar");
                }
                if(n2%2==0){
                    System.out.println(n2 + "é par");
                }else
                {
                    System.out.println(n2 + "é impar");
                }  break;
            case 3:
                System.out.println("multiplicação da soma dos valores lidos pelo primeiro"+ (n1+n2)*n1);
                break;
            case 4:
                if(n2!=0){
                    System.out.println((n1+n2)/n2);
                }else{
                    System.out.println("segundo numero informado é zero");
                }
                break;
            default:
                System.out.println("quadrado do numero" + n1 + " é igual a " + Math.pow(n1, 2));
                System.out.println("quadrado do numero" + n2 + " é igual a " + Math.pow(n2, 2));
                break;
        }
    }
}