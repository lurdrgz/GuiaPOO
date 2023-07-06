/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej10;

import static java.lang.Math.random;
import java.util.Arrays;

/**
 *
 * @author adminprueba
 */
public class POOEj10 {

    public static void main(String[] args) {

        double arregloA[] = new double[50];

        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = Math.random() * 100 + 1;
        }

        Arrays.sort(arregloA);

        double arregloB[] = Arrays.copyOf(arregloA, 20);

        for (int i = 10; i < 20; i++) {
            arregloB[i] = 0.5;
        }

        imprimirArreglo(arregloA);
        imprimirArreglo(arregloB);
    }

    public static void imprimirArreglo(double arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

}
