/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej11;

import java.util.Date;
import java.util.Scanner;

public class POOEj11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el dia");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el anio");
        int anio = leer.nextInt();
        
        Date fechaIngresada = new Date(anio-1900, mes-1, dia);
        
        Date fechaActual = new Date();
        
        System.out.println(fechaIngresada);
        System.out.println(fechaActual);
        
        long miliFechaActual = fechaActual.getTime();
        long miliFechaIngresada = fechaIngresada.getTime();
        
        long diferencia = miliFechaActual - miliFechaIngresada;
        
        long aniosLong = diferencia/31536000000L;
        
        double aniosDiferencia = Math.floor(aniosLong);
        
        System.out.println(aniosDiferencia);
        
        
    }

}
