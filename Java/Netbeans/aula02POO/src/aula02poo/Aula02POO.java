/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02poo;

/**
 *
 * @author Cleid
 */
public class Aula02POO {

    public static void main(String[] args) {
     
        Caneta c1 = new Caneta();
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
        //c1.ponta=0.5;
        c1.carga = 80 ;
       // c1.tampada = true;
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
    }
    
}
