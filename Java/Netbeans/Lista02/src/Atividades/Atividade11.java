/*
Fazer um programa para ler o ano de nascimento de uma pessoa, calcular e mostrar sua
idade e, também, verificar e mostrar se ela já tem idade para votar (16 anos ou mais) e
para conseguir a Carteira de Habilitação (18 anos ou mais).

 */
package Atividades;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade11 {
    
    public static void atividade(){
       /*
       int day = cal.get(Calendar.DATE);
       int month = cal.get(Calendar.MONTH) + 1;
       int year = cal.get(Calendar.YEAR);
       int dow = cal.get(Calendar.DAY_OF_WEEK);
       int dom = cal.get(Calendar.DAY_OF_MONTH);
       int doy = cal.get(Calendar.DAY_OF_YEAR);*/
       Scanner escreva = new Scanner (System.in);
       Calendar cal = Calendar.getInstance();
       int anoAgora = cal.get(Calendar.YEAR);
       System.out.println("informe o ano de nascimento: ");
       int anoNascimento = escreva.nextInt();
       int idade = anoAgora - anoNascimento;
       if(idade<16){
           System.out.println("idade: "+ idade);
           System.out.println("Não pode votar nem tirar a carteira de habilitação");
       }else if (idade>=16 && idade >18 ){
           System.out.println("idade: "+ idade);
           System.out.println( "Pode votar e tirar a carteira de habilitação");
       }else{
           System.out.println("idade: "+ idade);
           System.out.println("Pode votar mas não pode tirar a carteira de habilitação");
       }
       
}
       
}
