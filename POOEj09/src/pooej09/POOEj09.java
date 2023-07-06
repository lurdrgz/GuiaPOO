/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej09;

import Entidades.Matematica;
import Servicio.MatematicaServicio;

/**
 *
 * @author adminprueba
 */
public class POOEj09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatematicaServicio ms = new MatematicaServicio();
        Matematica matematica1 = ms.crearMatematica();
        
        ms.devolverMayor(matematica1);
        ms.calcularPotencia(matematica1);
        ms.calcularRaiz(matematica1);
            
        
    }
    
}
