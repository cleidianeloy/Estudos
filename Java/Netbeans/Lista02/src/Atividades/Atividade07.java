/*
7. Elabore programas em Java para resolver os seguintes problemas:

 */
package Atividades;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade07 {
     public static void atividade() {
        
        Scanner escreva = new Scanner (System.in);
        System.out.println("escolha entre a,b,c,d,e");
        String escolha = escreva.next();
        switch (escolha){
            case "a":
                a();
                break;
            case "b":
                b();
                break;
            case "c":
                c();
                break;
            case "d":
                d();
                break;
            case "e":
                e();
                break;
            default:
                System.out.println("Nenhuma opção valida foi escolhida");
             
        }
     }
    private static void a(){
        /* a. Efetuar a leitura de três valores (variáveis A, B e C) e apresentar os valores
        dispostos em ordem crescente.*/
        int[] valores;
        int temp;
        valores = new int[3];
        
        Scanner escreva = new Scanner (System.in);
        System.out.println("indique o valor A");
        valores[0] = escreva.nextInt();
        System.out.println("indique o valor B");
        valores[1] = escreva.nextInt();
        System.out.println("indique o valor C");
        valores[2] = escreva.nextInt();
        for (int m = 0; m < valores.length - 1; m++) { 
            
            for (int j = m+1 ; j < valores.length; j++) {
                if(valores[m]>valores[j]){
                    temp = valores[m];
                    valores[m] = valores[j];
                    valores[j] = temp;
                }
            }
        }
        for(int mostra : valores){
            System.out.print(mostra+" ");
            
        }
       
    }
    private static void b(){
        /* b. Ler quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o
    aluno foi aprovado, se o valor da média escolar for maior ou igual a 6. Se o aluno
    não foi aprovado, apresentar uma mensagem informando esta condição. */
        float nota= 0;
         Scanner escreva = new Scanner (System.in);
         
         for (int i = 1; i <= 4; i++) {
            System.out.println("Escreva a " + i +"º nota do aluno");
            float resposta = escreva.nextFloat();
            nota+=resposta;
        }
         nota = nota/4 ;
         String resultado = (nota>=6) ? "aprovado" : "reprovado";
         
         System.out.println("Situação: " + resultado);
        
        
    }
    public static void c(){
        /* c. Apresentar junto com uma das mensagens o valor da média do aluno para
        qualquer condição.*/
         float nota= 0;
         Scanner escreva = new Scanner (System.in);
         
         for (int i = 1; i <= 4; i++) {
            System.out.println("Escreva " + i +"º nota do aluno");
            float resposta = escreva.nextFloat();
            nota+=resposta;
        }
         nota = nota/4 ;
         String resultado = (nota>=6) ? "aprovado" : "reprovado";
         
         System.out.println("Situação: " + resultado + "\n"+ "média: " + nota);
    }
    public static void d(){
        /*d. Ler quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o
      aluno foi aprovado, se o valor da média escolar for maior ou igual a 6. Se o valor
      da média for menor que 6, solicitar a nota da recuperação, somar com o valor da
      média e obter a nova média. Se a nova média for maior ou igual a 6, apresentar a
      mensagem dizendo que o aluno foi aprovado mediante avaliação de recuperação.
      Se o aluno não foi aprovado, indicar uma mensagem informando esta condição.
      Apresentar junto com as mensagens o valor da média do aluno, para qualquer
      condição.*/
         float notas = 0;
         Scanner escreva = new Scanner (System.in);
         for (int i = 1; i <= 4; i++) {
            System.out.println("Escreva " + i +"º nota do aluno");
            float resposta = escreva.nextFloat();
            notas+= resposta;
        }
          float notaFinal = notas/4 ;
         String resultado = (notaFinal>=6) ? "aprovado" : "reprovado";
         if(resultado == "aprovado"){
             System.out.println("Aluno aprovado, com a nota de: " + notaFinal);
         }else{
             System.out.println("informe nota da recuperação: ");
             float resposta = escreva.nextFloat() ;
             notas+=resposta;
             notaFinal = notas/5;
             resultado = (notaFinal>=6) ? "aprovado" : "reprovado";
             System.out.println("Aluno foi:"+ resultado + " com a nota de " + notaFinal);
         }
         
             
    }
    public static void e(){
        /* e. Efetuar a leitura de quatro número inteiros e apresentar os números que são
        divisíveis por 2 e 3.*/
        int[] numeros;
        numeros = new int[4];
        
        Scanner escreva = new Scanner (System.in);
        for (int i = 0; i <4; i++) {
            System.out.println("Escreva " + (i+1) +"º numero");
            numeros[i] = escreva.nextInt();
        }
        System.out.println("numeros divisiveis por 2 e 3:");
        for(int auxiliar : numeros){
           if(auxiliar%2==0 && auxiliar%3==0){
               System.out.print(auxiliar + " ");
           }
        }
        
    }
   
   
       
}

