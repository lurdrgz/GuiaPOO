/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej02;

/**
 *
 * @author adminprueba
 */
public class Pooej02 {

    /**
     * @param args the command line arguments
     */
    /**Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).
    */
    public static void main(String[] args) {
        Circunferencia cefa1 = new Circunferencia();
        
              
        cefa1.crearCircunferencia();
        cefa1.area();
        cefa1.perimetro();
           
        
    }
    
}
