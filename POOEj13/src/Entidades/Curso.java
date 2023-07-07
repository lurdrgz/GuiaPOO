/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author adminprueba
 */
public class Curso {

    private String nombre;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private int precioHora;
    private String[] alumnos;

    public Curso() {
    }

    public Curso(String nombre, int cantidadHorasPorDia, int cantidadDiasPorSemana, int precioHora, String[] alumnos) {
        this.nombre = nombre;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.precioHora = precioHora;
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public int getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(int precioHora) {
        this.precioHora = precioHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

//    public String[] cargarAlumnos() {
//        Scanner leer = new Scanner(System.in);
//        String alumnos[] = new String[5];
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Escriba el nombre del alumno/a " + (i + 1));
//            alumnos[i] = leer.next();
//        }
//
//        return alumnos;
//    }
}
