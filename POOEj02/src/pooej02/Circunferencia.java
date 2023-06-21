/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej02;

import java.util.Scanner;

/**
 *
 * @author adminprueba
 */
public class Circunferencia {
    
    private double radio;

    public Circunferencia() {
    }
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;        
    }
    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia");
        radio = leer.nextDouble();
    }
    
    public double area() {
        double area;
        area =  Math.PI * radio * radio;
        System.out.println("El area de la circunferencia es " + area);
        return area;
    }
    
    public double perimetro() {
        double perimetro;
        perimetro = Math.PI * radio * 2;
        System.out.println("El perimetro de la circunferencia es " + perimetro);
        return perimetro;
    }
}
