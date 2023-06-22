/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej07;

import java.util.Scanner;

/**
 *
 * @author adminprueba
 */
public class Persona {

    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearPersona() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        nombre = leer.nextLine();
        System.out.println("Ingrese la edad");
        edad = leer.nextInt();
        sexo = "H";
        System.out.println("Ingrese el sexo");
        sexo = leer.nextLine();
        
        while (!"H".equals(sexo) && !"M".equals(sexo) && !"O".equals(sexo)) {
            System.out.println("Debe ingresar una opcion valida");
            sexo = leer.nextLine();
        }
        System.out.println("Ingrese la altura en metros");
        altura = leer.nextDouble();
        System.out.println("Ingrese el peso en kg");
        peso = leer.nextDouble();
    }
    
    public int calcularIMC() {
        double imc = peso/(altura*altura);
        if (imc < 20) {
            System.out.println("Bajo peso");
            return -1;
        } else if (imc >= 20 && imc < 25) {
            System.out.println("Normopeso");
            return 0;
        } else {
            System.out.println("Sobrepeso");
            return 1;
        }
    }
    
    public boolean esMayorEdad() {
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
            return true;
        } else {
            System.out.println("Es menor de edad");
            return false;
        }
    }
}
