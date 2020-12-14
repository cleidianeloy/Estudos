/*
Crie um método que receba três números inteiros como parâmetros, representando horas,
minutos e segundos, e os converta em segundos. Exemplo: 2h, 40min e 10s correspondem
a 9.610 segundos.
 */
package lista04;

/**
 *
 * @author Cleid
 */
public class Atividade14 {
    private static double segundos(int horas,int minutos,int segundos){
       
       return ((horas * 60)+ minutos)*60 + segundos;
            
    }
    public static void atividade(){
        double segundos = segundos(2,40,10);
        System.out.println(segundos);
    }
}
