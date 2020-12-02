/*
 Elaborar um programa em Java que efetue a leitura de um valor que esteja entre a faixa de
1 a 9. Após a leitura do valor fornecido pelo usuário, o programa deverá indicar uma de
duas mensagens: “O valor está na faixa permitida”, caso o usuário forneça o valor nesta
faixa, ou a mensagem “O valor está fora da faixa permitida”, caso o usuário forneça valores
menores que 1 ou maiores que 9.
 */
package Atividades;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade08 {
    public static void atividade(){
        Scanner escreva = new Scanner (System.in);
        System.out.println("Escreva um numero entre 1 a 9 ");
        int escolha = escreva.nextInt();
        String resposta = (escolha>= 1 && escolha<=9) ? "O valor está na faixa permitida" : "O valor está fora da faixa permitida";
        System.out.println(resposta);
    }
}
