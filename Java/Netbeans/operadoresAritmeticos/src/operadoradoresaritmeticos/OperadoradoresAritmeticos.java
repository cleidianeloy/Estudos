/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package operadoradoresaritmeticos;

/**
 *
 * @author Cleid
 */
public class OperadoradoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* int n1 = 3;
        int n2 = 5;
        float m = (n1+n2)/2;
        System.out.println("A média é igual a " + m); */
     /*    int numero = 10;
         int valor = 4 + numero++; //faz o incremento depois 
        // int valor = 4 + ++numero; pré incremento
         System.out.println(valor);
         System.out.println(numero); */

        /* int x = 4;
         x += 2; // x = x + 2
         System.out.println(x);   */

      /*  float y = 8.3f;
        int ar = (int) Math.floor(y);
        //int ar = (int) Math.abs(y);
        //int ar = (int) Math.ceil(y);
        //int ar = (int) Math.round(y);    
          System.out.println(ar);*/

      double ale= Math.random();
      //System.out.println(ale);
      int n = (int) (5 + ale * (10-5)); // pra sortear numero entre : menor numero + aleatorio * (maior numero - menor numero)
        System.out.println(n);
                
    }
    
}
