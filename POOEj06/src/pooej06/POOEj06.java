/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej06;

/**
 *
 * @author adminprueba
 */
public class POOEj06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafetera cafetera1 = new Cafetera(2000, 500);
        
        cafetera1.llenarCafetara();
        cafetera1.servirTaza(200);
        cafetera1.vaciarCafetera();
        cafetera1.agregarCafe(150);
        cafetera1.servirTaza(200);
        
        
    }
    
}
