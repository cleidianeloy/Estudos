/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author Cleid
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nome1 = "Gustavo";
       String nome2 = "Gustavo";
       String nome3 = new String("Gustavo");
       String res;
       /*res = (nome1 == nome2)?"igual":"diferente";
       //se nome1 for igual a nome 2 a variavel 'res' recebe "igual", senão, "diferente"
*/
       res = (nome1.equals(nome3))?"igual":"diferente"; //por nome 3 ser um objeto "==" não iria funcionar por isso a utilização de .equals
        System.out.println(res); 
        
    }
    
}
