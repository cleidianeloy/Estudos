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
        System.out.println("Você pode escolher de testar algumas atividades\nescolha entre as atividades: 2, 3, 4, 5, 6, 7, 8, 9, 10,11\n" 
        + "12, 13, 14, 15, 16, 17, 18, 19, 20, 21");
        System.out.println("Digite o numero correspondente a lista de numeros a cima: ");
        escolha = escreva.nextInt();
        
        switch (escolha) {
            case 2:
                System.out.println("sua escolha foi a atividade 2");
                Atividade02.atividade();
                break;
            case 3:
                System.out.println("sua escolha foi a atividade 3");
                Atividade03.atividade();
                break;
            case 4:
                System.out.println("sua escolha foi a atividade 4");
                Atividade04.atividade();
                break;
            case 5:
                System.out.println("sua escolha foi a atividade 5");
                Atividade05.atividade();
                break;
            case 6:
                System.out.println("sua escolha foi a atividade 6");
                Atividade06.atividade();
                break;
            case 7:
                System.out.println("sua escolha foi a atividade 7");
                Atividade07.atividade();
                break;
            case 8:
                System.out.println("sua escolha foi a atividade 8");
                Atividade08.atividade();
                break;
            case 9:
                System.out.println("sua escolha foi a atividade 9");
                Atividade09.atividade();
                break; 
            case 10:
                System.out.println("sua escolha foi a atividade 10");
                Atividade10.atividade();
                break;
            case 11:
                System.out.println("sua escolha foi a atividade 11");
                Atividade11.atividade();
                break;
            case 12:
                System.out.println("sua escolha foi a atividade 12");
                Atividade12.atividade();
                break;
            case 13:
                System.out.println("sua escolha foi a atividade 13");
                Atividade13.atividade();
                break;
            case 14:
                System.out.println("sua escolha foi a atividade 14");
                Atividade14.atividade();
                break; 
            case 15:
                System.out.println("sua escolha foi a atividade 15");
                Atividade15.atividade();
                break;
            case 16:
                System.out.println("sua escolha foi a atividade 16");
                Atividade16.atividade();
                break;
            case 17:
                System.out.println("sua escolha foi a atividade 17");
                Atividade17.atividade();
                break;
             case 18:
                System.out.println("sua escolha foi a atividade 18");
                Atividade18.atividade();
                break;
             case 19:
                System.out.println("sua escolha foi a atividade 19");
                Atividade19.atividade();
                break;
             case 20:
                System.out.println("sua escolha foi a atividade 20");
                Atividade20.atividade();
                break;
             case 21:
                System.out.println("sua escolha foi a atividade 21");
                Atividade21.atividade();
                break;
            default:
                System.out.println("nenhuma opção valida foi escolhida");
                break;
        }
        
    } 
}
