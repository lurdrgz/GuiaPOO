/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author adminprueba
 */
public class CursoServicio {
    Scanner leer = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n");
    
    public String[] cargarAlumnos(){
        String alumnos[] = new String[5];
        
        for (int i=0; i<5; i++) {
            System.out.println("Escriba el nombre del alumno/a " + (i+1) );
            alumnos[i] = leer.next();
        }
        
        return alumnos;
    }
    
    public Curso crearCurso() {
        Curso c1 = new Curso();
        System.out.println("Ingrese el nombre del curso");
        c1.setNombre(leer.next());
        System.out.println("Ingrese la cantidad de horas por dia");
        c1.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de dias por semana que se dicta el curso");
        c1.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese el precio por hora");
        c1.setPrecioHora(leer.nextInt());
        
        c1.setAlumnos(this.cargarAlumnos());
        
               
        return c1;
    }
    
    public void calcularGananciaSemanal(Curso c1) {
        int ganancia = c1.getPrecioHora()*c1.getCantidadHorasPorDia()*c1.getCantidadDiasPorSemana()*5;
        
        System.out.println("La ganancia semanal del curso " + c1.getNombre()+ " es de $" + ganancia);
    }
    
}
