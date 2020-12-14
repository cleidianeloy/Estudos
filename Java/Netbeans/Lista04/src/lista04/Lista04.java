/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista04;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Lista04 {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner escreva = new Scanner (System.in);
        System.out.println("Escolha a atividade que queira iniciar");
        System.out.println("4, 5, 8, 9, 11, 14 ou 16, 17");
        int escolha = escreva.nextInt();
        switch (escolha){
            case 4:
                System.out.println("Você escolheu a atividade 4");
                Atividade04.atividade();
                break;
            case 5:
                System.out.println("Você escolheu a atividade 5");
                Atividade05.atividade();
                break;
            case 8:
                System.out.println("Você escolheu a atividade 8");
                Atividade08.atividade();
                break;
            case 9:
                System.out.println("Você escolheu a atividade 9");
                Atividade09.atividade();
                break;
            case 11:
                System.out.println("Você escolheu a atividade 11");
                Atividade11.atividade();
                break;
            case 14:
                System.out.println("Você escolheu a atividade 14");
                Atividade14.atividade();
                break;
            case 16:
                System.out.println("Você escolheu a atividade 16");
                Atividade16.atividade();
                break;
            case 17:
                System.out.println("Você escolheu a atividade 17");
                Atividade17.atividade();
                break;
            default:
                System.out.println("Não existe essa atividade");
        }
     
    }
    
}
