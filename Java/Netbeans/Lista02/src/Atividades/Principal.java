/*

 */
package Atividades;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Principal {
    public static void main(String[] args) {
        Scanner escreva = new Scanner (System.in);
        int escolha;
        System.out.println("Você pode escolher de testar algumas atividades\nescolha entre: atividade 2, atividade 3, atividade 4, atividade 5");
        System.out.println("Digite o numero correspondente: 2, 3, 4 ou 5");
        escolha = escreva.nextInt();
        
        if(escolha == 2){
            System.out.println("sua escolha foi a atividade 2");
            Atividade02.atividade();
           
        }
        if(escolha == 3){
            System.out.println("sua escolha foi a atividade 3");
            Atividade03.atividade();
           
        }
        if(escolha == 4){
            System.out.println("sua escolha foi a atividade 4");
            Atividade04.atividade();
        }
        if(escolha == 5){
            System.out.println("sua escolha foi a atividade 5");
            Atividade05.atividade();
        }
        
    } 
}
