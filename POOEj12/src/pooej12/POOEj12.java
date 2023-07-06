/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej12;

import Entidades.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author adminprueba
 */
public class POOEj12 {

    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();

        Persona p1 = ps.crearPersona();

        ps.calcularEdad(p1);
        ps.menorQue(30, p1);
        ps.mostrarPersona(p1);

        Persona p2 = ps.crearPersona();
        ps.calcularEdad(p2);
        ps.menorQue(30, p2);
        ps.mostrarPersona(p2);
    }

}
