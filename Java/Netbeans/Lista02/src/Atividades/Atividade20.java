/*
Fazer um programa que escreva o conceito de um aluno, dada a sua nota numérica.
Considere somente notas inteiras. O critério para determinar o conceito é o seguinte:
Nota                Conceito
nota inferiores a 3 conceito E
nota de 3 a 5       conceito D
notas 6 e 7         conceito C
notas 8 e 9         conceito B
nota 10             conceito A 
 */
package Atividades;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade20 {
    public static void atividade(){
         System.out.println("Informe a nota do aluno");
         Scanner escreva = new Scanner (System.in);
         int nota = escreva.nextInt();
         if(nota<3){
             System.out.println("Conceito E");
         }else if(nota>=3 && nota<=5){
             System.out.println("Conceito D");
         }else if(nota>=6 && nota<=7){
             System.out.println("Conceito C");
         }else if(nota>=8 && nota<=9){
             System.out.println("Conceito B");
         }else if(nota==10){
             System.out.println("Conceito A");
         }
    }
    
}
