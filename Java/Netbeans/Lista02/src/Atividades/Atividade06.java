/*
 Faça um programa em Java que permite ler três valores para os lados de um triângulo,
considerando lados como: A, B e C. Verificar se os lados fornecidos formam um realmente
um triângulo, e se for esta condição verdadeira, deverá ser indicado qual tipo de triângulo
foi formado: isósceles, escaleno ou equilátero.
Para se estabelecer este algoritmo é necessário, em primeiro lugar, saber o que
realmente é um triângulo. Se você não souber o que é um triângulo, consequentemente
não conseguirá resolver o problema. Triângulo é uma forma geométrica (polígono)
composta por três lados, onde cada lado é menor que a soma dos outros dois lados.
Perceba que isto é uma regra (uma condição) e deverá ser considerada. É um triângulo
quando A < B + C, quando B < A + C e quando C < A + B.
Tendo certeza de que os valores informados para os três lados formam um
triângulo, serão então analisados os valores para se estabelecer qual tipo de triângulo será
formado: isósceles, escaleno ou equilátero.
Um triângulo é isósceles quando possui dois lados iguais e um diferente, isto é, A =
B ou A = C ou B = C.
É escaleno quando possui todos os lados diferentes, ou seja, A <> B e B <> C.
O triângulo é considerado equilátero quando possui todos os lados iguais, isto é,
quando A = B e B = C.
 */
package Atividades;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade06 {
    
    public static void atividade() {
    String tipo = "";
    Scanner escreva = new Scanner (System.in);
    System.out.println("Vamos formar um triangulo");
    System.out.println("digite o lado A");
    int A = escreva.nextInt();
    System.out.println("digite o lado B");
    int B = escreva.nextInt();
    System.out.println("digite o lado C");
    int C = escreva.nextInt();
    if((A < B + C) && (B < A + C) && (C < A + B)){
        if(A == B && A == C && B == C){
        tipo = "isosceles";
         }else if(A != B && B != C ){
        tipo = "escaleno";
        }else if(A == B || A == C || B == C)
        {
        tipo = "equilatero";
        }
    
         System.out.println("é um triangulo " + tipo);
    }else
    {
        System.out.println("os tamanhos informados não são de um triangulo");
    }
    

    }
    
    
}
