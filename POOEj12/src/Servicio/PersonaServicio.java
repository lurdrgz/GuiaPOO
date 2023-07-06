/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author adminprueba
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n");
    
    public Persona crearPersona() {
        Persona p1 = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        String nombre = leer.next();
        p1.setNombre(nombre);
        
        System.out.println("Ingrese el dia de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese el anio de nacimiento");
        int anio = leer.nextInt();
        Date nacimiento = new Date(anio-1900, mes-1, dia);
        p1.setNacimiento(nacimiento);
        
        return p1;
    }
    
    public void calcularEdad(Persona p1) {
        
        Date fechaActual = new Date();
        Date fechaNacimiento = p1.getNacimiento();
        
        long miliFechaActual = fechaActual.getTime();
        long miliFechaNacimiento = fechaNacimiento.getTime();
        
        long diferencia = miliFechaActual - miliFechaNacimiento;
        
        long aniosLong = diferencia/31536000000L;
        
        double edad = Math.floor(aniosLong);
        
        System.out.println("La edad de " + p1.getNombre() + " es " + edad + " anios");
        
    }
    
    public boolean menorQue(int edad, Persona p1) {
        boolean resultado = true;
        Date fechaActual = new Date();
        Date fechaNacimiento = p1.getNacimiento();
        
        long miliFechaActual = fechaActual.getTime();
        long miliFechaNacimiento = fechaNacimiento.getTime();
        
        long diferencia = miliFechaActual - miliFechaNacimiento;
        
        long aniosLong = diferencia/31536000000L;
        
        double edadPersona = Math.floor(aniosLong);
        
        if (edadPersona >= edad) {
            resultado = false;
        }
        System.out.println("Es " + p1.getNombre() + " menor que " + edad + "?: " + resultado);
        return resultado;
    }
    
    public void mostrarPersona(Persona p1) {
        System.out.println("El nombre de la persona es " + p1.getNombre() + " y su fecha de nacimiento es " + p1.getNacimiento());
    }
    
}
