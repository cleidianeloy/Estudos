/*
Propósito: fazer um método que invoca outros métodos
Escreva um método que receba 3 notas de um aluno e uma letra. Se a letra for A, este
método chama outro para calcular a média aritmética das notas do aluno. Se a letra for P,
chama um método para calcular a média ponderada (considerando os pesos: 5, 3 e 2). Caso
a letra for H, então será invocado o método para calcular a média harmônica. Após calcular
a média (seja qual for), o método deverá retornar a média calculada para que possa ser
mostrada ao usuário por um método de impressão de resultado.
Observação: faça um menu de opções para chamar cada um dos métodos para o cálculo
da média. O programa deverá executar o menu de opções por n vezes. A condição de parada
do programa será o valor S.
 */
package lista04;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade17 {
    private static double A(double[] notas){
        double media = (notas[0]+ notas[1]+ notas[2]) / 3;
        return media;
    }
    private static double P(double[] notas){
        double media = (notas[0]*5 + notas[1]*3+ notas[2]*2) / 10;
        return media;
    }
    private static double H(double[] notas){
        double media = 3/(1/notas[0]+ 1/notas[1]+ 1/notas[2]);
        return media;
    }
    private static void resultado(String escolha, double[] notas){
        double media = 0.0;
        if(null != escolha)switch (escolha) {
            case "A":
                media = A(notas);
                break;
            case "P":
                media = P(notas);
                break;
            case "H":
                media = H(notas);
                break;
            default:
                break;
                  
        }
        System.out.println("Resultado da escolha " + escolha + ": " + media);
    }
    public static void atividade(){
        Scanner escreva = new Scanner(System.in);
        double[] notas;
        notas = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Escreva a " + (i+1) + "º nota do aluno");
            notas[i] = escreva.nextDouble();
        }
        String resposta = "S";
        String escolha="";
        do{
            do {
            System.out.println("Escolha uma das opções:\n"+
                               "A = calcular a média aritmética das notas \n"+
                               "P = calcular a média ponderada (considerando os pesos: 5, 3 e 2) \n" +
                               "H = calcular a média harmônica");
            escolha = escreva.next().toUpperCase();
            }while(!"A".equals(escolha) && !"P".equals(escolha) && !"H".equals(escolha));

            resultado(escolha, notas);
            System.out.println("Quer tentar outro método? responda 'S' para sim e  'N' para não");
            resposta = escreva.next().toUpperCase();
            
            do{
                    switch (resposta) {
                    case "N":
                        System.out.println("Okay, finalizando o programa");
                        break;
                    case "S":
                        System.out.println("Sua resposta foi Sim, vamos de novo!");
                        break;
                    default:
                        System.out.println("Nenhuma opção valida foi informada responda S ou N");
                        resposta = escreva.next().toUpperCase();
                        break;
                }
                
            }while(!"N".equals(resposta) && !"S".equals(resposta));
            
        }while("S".equals(resposta));
        
        
    }
}
