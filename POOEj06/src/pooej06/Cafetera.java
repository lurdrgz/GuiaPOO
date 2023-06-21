/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej06;

import java.util.Scanner;

/**
 *
 * @author adminprueba
 */
public class Cafetera {
    public int capacidadMaxima;
    public int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetara() {
        cantidadActual = capacidadMaxima;
        System.out.println("La cafetera esta llena. Cantidad de cafe: " + cantidadActual + "ml");
    }
     
    public void servirTaza(int taza) {
        int diferencia = cantidadActual - taza;
        
        if (diferencia >= 0) {
            System.out.println("Taza llena");
        } else {
            int tazaHasta = taza + diferencia;
            System.out.println("La taza se lleno parcialmente: " + tazaHasta + "ml." );
        }
    }
    
    public void vaciarCafetera() {
        cantidadActual = 0;
        System.out.println("La cafetera esta vacia. Cantidad de cafe actual: " + cantidadActual);
    }
    
    public void agregarCafe(int cafe) {
        System.out.println("Ingrese la cantidad de cafe que va a agregar en ml");
        Scanner leer = new Scanner(System.in);
        cafe = leer.nextInt();
        cantidadActual = cantidadActual + cafe;
        System.out.println("La cantidad de cafe actual es " + cantidadActual + "ml");
    }
}
