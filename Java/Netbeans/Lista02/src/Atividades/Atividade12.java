/*
   Fazer um programa para ler o código de um determinado produto e mostrar a sua 
classificação. Utilize a seguinte tabela como referência:
        Código                  Classificação
        1                       Alimento não-perecível
        2, 3 ou 4               Alimento perecível
        5 ou 6                  Vestuário
        7                       Higiene Pessoal
        8 até 15                Limpeza e Utensílios domésticos
        Qualquer outro código   Inválido 
 */
package Atividades;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade12 {
    public static void atividade(){
     Scanner escreva = new Scanner (System.in);
     System.out.println("Escreva o codigo do produto:");
     int codigo = escreva.nextInt();
     
     if(codigo==1){
         System.out.println("Alimento não-perecível");
     }else if(codigo>=2 && codigo<=4){
         System.out.println("Alimento perecível");
     }else if(codigo>=5 && codigo<=6){
         System.out.println("Vestuário");
     }else if(codigo == 7){
         System.out.println("Higiene Pessoal");
     }else if(codigo>= 8 && codigo<=15){
         System.out.println("Limpeza e Utensílios domésticos");
     }else
     {
         System.out.println("Inválido");
     }
    } 
    
}
