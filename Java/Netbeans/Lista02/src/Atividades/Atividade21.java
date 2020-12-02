/*
A empresa XYZ decidiu conceder um aumento de salários a seus funcionários de acordo
com a tabela abaixo:
SALÁRIO ATUAL (R$) ÍNDICE DE AUMENTO
0,00 – 400,00           15%
401,00 – 700,00         12%
701,00 – 1000,00        10%
1001,00 – 1800,00       7%
1801,00 – 2500,00       4%
ACIMA DE 2500,00    SEM AUMENTO
Escrever um programa que lê, para cada funcionário, o seu nome e o seu salário
atual. Após receber estes dados, o algoritmo calcula o novo salário e escreve na tela as
seguintes informações:
• nome do funcionário
• % de aumento
• salário atual
• novo salário

 */
package Atividades;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade21 {
    public static void atividade(){
        Scanner escreva = new Scanner (System.in);
        System.out.println("Informe o nome do funcionario");
        String nome = escreva.next();
        System.out.println("Informe o seu salario atual");
        double salario = escreva.nextDouble();
        double novoSalario = 0.0, indice = 0.0;
        if(salario>=0 && salario<=400){
            novoSalario = salario + (salario*0.15);
            indice = 15;
        }else if(salario>=401 && salario<=700){
             novoSalario = salario + (salario*0.12);
             indice = 12;
        }else if(salario>=701 && salario<=1000){
              novoSalario = salario + (salario*0.10);
             indice = 10;
        }else if(salario>=1001 && salario<=1800){
            novoSalario = salario + (salario*0.07);
             indice = 7;
        }else if(salario>=1801 && salario<=2500){ 
            novoSalario = salario + (salario*0.04);
             indice = 4;
        }else if(salario>=2500){
            novoSalario = salario + (salario*0);
            indice = 0;
        }
        
        System.out.println("Nome do funcionario: "+ nome);
        System.out.println("indice de aumento: " + indice);
        System.out.println("salario atual : " + salario);
        System.out.println("novo salario: "+ novoSalario);
        
    }
}
