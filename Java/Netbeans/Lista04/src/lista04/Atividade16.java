/*
Escreva um programa que solicita o total gasto pelo cliente de uma loja, imprime as opções
de pagamento, solicita a opção desejada e imprime o valor total das parcelas (quando
houverem).
Opções:
1) a vista com 10% de desconto
2) em duas vezes (preço da etiqueta)
3) de 3 até 10 vezes com 3% de juros ao mês (somente para compras
acima de R$ 100,00).
OBS: Fazer um método que imprime o menu de opções e solicita a opção desejada. Este
método deverá retornar a opção escolhida e, a partir dela, o programa principal deve verificala (por meio de uma instrução switch) para então ativar o método correspondente (um
método para cada opção) para calcular o valor do produto e parcelas.
 */
package lista04;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade16 {
    private static int verificaOpcao(double gasto){
        Scanner escreva = new Scanner (System.in);
        System.out.println("Defina a opção de pagamento:\n" +
                            "1) a vista com 10% de desconto\n" +
                            "2) em duas vezes (preço da etiqueta)\n" +
                            "3) de 3 até 10 vezes com 3% de juros ao mês (somente para compras acima de R$ 100,00)\n"+
                            "Escolha uma das opções de pagamento digitando 1, 2 ou 3");
       int escolha = escreva.nextInt();
        do {
                if (escolha==1){
                     escolha = 1;
                }else
                if(escolha==2){
                    escolha = 2;
                }else
                if(escolha==3){
                    if (gasto < 100) {
                        System.out.println("Desculpe, essa opção é apenas para compras acima de 100 reais, escolha outra opção");
                        escolha = escreva.nextInt();
                    } else {
                         escolha = 3;
                     }

                }else{
                    System.out.println("Você escolheu uma opção fora do permitido, escolha entre 1, 2 ou 3");
                    escolha = escreva.nextInt();
                }
                    
        } while ((escolha<1 || escolha>3) || (gasto<100 && escolha==3));
            return escolha;
       
    }
    public static void atividade(){
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner escreva = new Scanner (System.in);
        System.out.println("qual foi seu total gasto na loja?");
        double gasto = escreva.nextDouble();
        
        switch(verificaOpcao(gasto)){
             case 1:
             double pagamento = gasto - (gasto*0.10);
             System.out.println("Total gasto: " + gasto);
             System.out.println("Escolhido para pagar a vista \ntotal do pagamento: R$ " + df.format(pagamento) );
             break;
             case 2:
             pagamento = gasto/2;
             System.out.println("Total gasto: " + gasto);
             System.out.println("Escolhido para pagar em duas vezes" +
                                "\nParcela 1: R$" + df.format(pagamento) +
                                "\nParcela 2: R$" + df.format(pagamento));
             break;
             case 3:
             System.out.println("Você escolheu a opção 3, por favor, escolha entre 3 a 10 parcelas:");
             int escolha = escreva.nextInt();
             boolean ok = false;
             do{
                     System.out.println("Escolha entre 3 a 10 parcelas, por favor");
                     escolha = escreva.nextInt();
                     
             }while(escolha < 3 || escolha>10);
             pagamento = (gasto/escolha);
             System.out.println("Total gasto: " + gasto);
             for (int i = 0; i < escolha; i++) {
                 pagamento += pagamento * 0.03;
                 System.out.println("Parcela " + (i+1) + ": R$ " + df.format(pagamento));
                 
             }
                 
             
        }
    }
    
}
