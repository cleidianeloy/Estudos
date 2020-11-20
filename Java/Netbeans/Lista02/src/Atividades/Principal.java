/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        System.out.println("Você pode escolher de testar algumas atividades\nescolha entre: atividade 2, atividade 3");
        System.out.println("Digite o numero correspondente: 2 ou 3");
        escolha = escreva.nextInt();
        
        if(escolha == 2){
            System.out.println("sua escolha foi a atividade 2");
            Atividade02.atividade();
           
        }
        if(escolha == 3){
            System.out.println("sua escolha foi a atividade 3");
            Atividade03.atividade();
           
        }
        
    } 
}
