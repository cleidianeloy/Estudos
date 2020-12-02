/*
 Elaborar um programa que efetue a leitura do nome e do sexo de uma pessoa,
apresentando como saída uma das seguintes mensagens: “Ilmo Sr.”, para o sexo
informado como masculino, ou a mensagem “Ilma Sra.”, para o sexo informado como
feminino. Apresente na sequência da mensagem impressa o nome da pessoa.
 */
package Atividades;

import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade09 {
    public static void atividade(){
        Scanner escreva = new Scanner (System.in);
        System.out.println("Informe seu nome: ");
        String nome = escreva.next();
        System.out.println("Informe seu sexo(masculino ou feminino): ");
        String sexo = escreva.next();
        switch(sexo){
            case("masculino"):
                System.out.println("Ilmo Sr. " + nome);
                break;
            case("feminino"):
                System.out.println("Ilma Sra. " + nome );
            default:
                System.out.println("Nenhuma das opções informadas são validas");
        }
    }
}
