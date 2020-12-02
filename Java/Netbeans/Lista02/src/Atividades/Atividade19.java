/*
A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
varia de 0 (zero) até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são
intimadas a suspenderem suas atividades, se o índice crescer para 0,4 as indústrias do 1º
e 2º grupo são intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os
grupos devem ser notificados a paralisarem suas atividades. Faça um programa que leia o
índice de poluição medido e emita a notificação adequada aos diferentes grupos de
empresas.
 */
package Atividades;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade19 {
        public static void atividade(){
            Scanner escreva = new Scanner (System.in);
            System.out.println("Escreva o indice de poluiçao das industrias");
            float indice = escreva.nextFloat();
            if(indice>= 0 && indice<=0.25){
                System.out.println("índice de poluição aceitável");
            }else if(indice>0.3 && indice<0.4){
                System.out.println("Primeiro grupo está sendo intimado a suspender suas atividades");
            }else if(indice>=0.4 && indice<0.5){
                System.out.println("Primeiro e o segundo grupo estão sendo intimados a suspenderes suas atividades");
            }else if(indice>=0.5){
                System.out.println("Todos os grupos devem paralizar suas atividades");
            }
            
        }
}
