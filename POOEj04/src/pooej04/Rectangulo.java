/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej04;

import java.util.Scanner;

/**
 *
 * @author adminprueba
 */
public class Rectangulo {
    //atributos
    private double base;
    private double altura;

    //constructor vacio
    public Rectangulo() {
    }

    //constructor que recibe ambos atributos por parametro
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //getters

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    //setters

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //metodo que pide al usuario la base y la altura del rectangulo y los guarda en los atributos
    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
        base = leer.nextDouble();
        
        System.out.println("Ingrese la altura del rectangulo");
        altura = leer.nextDouble();
    }
    
    public double area() {
        double area;
        area = base * altura;
        System.out.println("El area del rectangulo es " + area);
        return area;
    }
    
    public double perimetro() {
        double perimetro;
        perimetro = (2*base) + (2*altura);
        System.out.println("El perimetro del rectangulo es " + perimetro);
        return perimetro;
    }
    
    public void dibujar() {
        int i;
        int j;
        for (i=0; i < altura; i++) {
            for (j=0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
