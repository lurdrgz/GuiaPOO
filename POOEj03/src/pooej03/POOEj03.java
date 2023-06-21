/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej03;

/**
 *
 * @author adminprueba
 */
public class POOEj03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Operacion operacion1 = new Operacion();
       
       operacion1.crearOperacion();
       operacion1.sumar();
       operacion1.restar();
       operacion1.multiplicar();
       operacion1.dividir();
    }
    
}
