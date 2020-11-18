/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor05;

import java.util.Arrays;

/**
 *
 * @author Cleid
 */
public class Vetor05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[] = new int[20]; //inicia o vetor com 20
        Arrays.fill(v,0); //transforma todos os valores em 0
        for(int valor:v){
            System.out.println(valor + " ");
        }
    }
    
}
