/*
 Um estacionamento cobra uma taxa mínima de R$ 2,00 para estacionar por até três horas.
Um adicional de R$ 0,50 por hora não necessariamente inteira é cobrado após as três
primeiras horas. A taxa máxima para qualquer dado período de 24 horas é R$ 10,00.
Pressuponha que nenhum carro fica estacionado por mais de 24 horas por vez. Escreva um
programa que calcula e exibe a taxa de estacionamento para cada cliente. O programa deve
exibir a cobrança para o cliente atual e calcular e exibir o total dos recibos. O programa deve
utilizar o método calcularTaxa para determinar a taxa para cada cliente. 
 */
package lista04;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade08 {
    private static double calcularTaxa(int horas){
        double taxa = 2.00;
        if (horas >=24){
            taxa = 10.00;
        }else if(horas>3){
            horas-=3;
            taxa+= horas*0.5;
        }
        return taxa;
    }
    public static void atividade(){
        Scanner escreva = new Scanner (System.in);
        System.out.println("Escreva quantas horas você passou no estacionamento");
        int horas = escreva.nextInt();
        double taxa = calcularTaxa(horas);
        System.out.println("a taxa a pagar: " + taxa + "\nhoras no estacionamento: " + horas );
    }
}
