/*
Zezinho comprou um microcomputador para controlar o rendimento diário de seu trabalho
como pescador. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo
regulamento de pesca do estado de Santa Catarina (50 quilos) deve pagar uma multa de
R$ 4,00 por quilo excedente. Zezinho precisa que você faça um programa que leia o peso
de peixes e verifique se há excesso. Se houver, mostrar o excesso e o valor da multa que
Zezinho deverá pagar. Caso contrário mostrar uma mensagem que ele não deve pagar
multa.
 */
package Atividades;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */

public class Atividade17 {
    private static double passou(double peso){
        double valor = (peso - 50)*4;
        return valor;
    }
    public static void atividade(){
        Scanner escreva = new Scanner (System.in);
        System.out.println("informe o peso dos peixes: ");
        double peso = escreva.nextInt();
        
        String situacao = (peso>50)? "Deve pagar multa" : "Não deve pagar multa";
        double valorAPagar  = (peso>50)? passou(peso): 0 ;
        
        if(situacao.equals("Deve pagar multa")){
            System.out.println(situacao + "\nvalor da multa:"+ valorAPagar);
        }else if(situacao.equals("Não deve pagar multa")){
            System.out.println(situacao);
        }
        
        
    }
}
