/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Matematica;

/**
 *
 * @author adminprueba
 */
public class MatematicaServicio {

    public Matematica crearMatematica() {
        Matematica m1 = new Matematica();
        int min = 1;
        int max = 40;

        m1.setNum1((Math.random() * (max - min + 1)) + min);
        m1.setNum2((Math.random() * (max - min + 1)) + min);

        return m1;
    }

    public void devolverMayor(Matematica m1) {
        if (m1.getNum1() > m1.getNum2()) {
            System.out.println("El numero mayor es " + m1.getNum1());
        } else if (m1.getNum1() < m1.getNum2()) {
            System.out.println("El numero mayor es " + m1.getNum2());
        } else {
            System.out.println("Los numeros son iguales");
        }
    }

    public void calcularPotencia(Matematica m1) {
        double potencia = 0;

        if (m1.getNum1() > m1.getNum2()) {
            potencia = Math.pow(m1.getNum1(), m1.getNum2());
            System.out.println("Elevar " + m1.getNum1() + " a " + m1.getNum2() + " da " + potencia);
        } else if (m1.getNum1() < m1.getNum2()) {
            potencia = Math.pow(m1.getNum2(), m1.getNum1());
            System.out.println("Elevar " + m1.getNum2() + " a " + m1.getNum1() + " da " + potencia);
        } else {
            potencia = Math.pow(m1.getNum2(), m1.getNum1());
            System.out.println("Elevar " + m1.getNum2() + " a " + m1.getNum1() + " da " + potencia);
        }
    }

    public void calcularRaiz(Matematica m1) {
        if (m1.getNum1() > m1.getNum2()) {
            double n = Math.abs(m1.getNum2());
            double raiz = Math.sqrt(n);
            System.out.println("La raiz cuadrada de " + n + " es " + raiz);
        } else if (m1.getNum1() < m1.getNum2()) {
            double n = Math.abs(m1.getNum1());
            double raiz = Math.sqrt(n);
            System.out.println("La raiz cuadrada de " + n + " es " + raiz);
        } else {
            double n = Math.abs(m1.getNum1());
            double raiz = Math.sqrt(n);
            System.out.println("La raiz cuadrada de " + n + " es " + raiz);
        }
    }
}
