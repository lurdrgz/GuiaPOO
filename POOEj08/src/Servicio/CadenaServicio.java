/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author adminprueba
 */
public class CadenaServicio {

    public Cadena crearCadena() {

        Cadena c1 = new Cadena();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase que desee");
        String frase1 = leer.nextLine();
        c1.setFrase(frase1);
        c1.setLongitud(frase1.length());

        return c1;
    }

    public static void mostrarMenu() {
        System.out.println("Menú de opciones:");
        System.out.println("1. Muestra cuantas vocales hay en la frase ingresada");
        System.out.println("2. Invierte la frase ingresada");
        System.out.println("3. Analiza cuantas veces esta una letra que desee");
        System.out.println("4. Compara la longitud de la frase con otra que desee");
        System.out.println("5. Une la frase con otra que desee");
        System.out.println("6. Reemplaza el caracter A por otro que desee");
        System.out.println("7. Compruebe si la frase contiene una letra que usted desee");
        System.out.println("8. Salir");
        System.out.println("Selecciona una opción: ");
    }

    public int mostrarVocales(Cadena c1) {
        int cantidadVocales = 0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            String frase = c1.getFrase();
            char letra = frase.charAt(i);

            switch (Character.toLowerCase(letra)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    cantidadVocales++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("La cantidad de vocales es " + cantidadVocales);
        return cantidadVocales;
    }

    public String invertirFrase(Cadena c1) {
        String frase = c1.getFrase();
        String fraseInvertida = "";

        for (int i = c1.getLongitud() - 1; i >= 0; i--) {
            fraseInvertida += frase.charAt(i);
        }
        System.out.println("La frase invertida es " + fraseInvertida);
        return fraseInvertida;
    }

    public int vecesRepetido(Cadena c1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la letra que desee");
        char letra = leer.next().charAt(0);
        String frase = c1.getFrase();
        int cantidadRepeticiones = 0;

        for (int i = 0; i < c1.getLongitud(); i++) {
            if (frase.charAt(i) == letra) {
                cantidadRepeticiones++;
            }
        }
        System.out.println("La cantidad de repeticiones es " + cantidadRepeticiones);
        return cantidadRepeticiones;
    }

    public void compararLongitud(Cadena c1, String frase) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase que desee");
        frase = leer.nextLine();
        int longitudFrase = frase.length();
        if (longitudFrase == c1.getLongitud()) {
            System.out.println("Las frases tienen la misma longitud");
        } else {
            System.out.println("Las frases no tienen la misma longitud");
        }
    }

    public String unirFrases(Cadena c1, String frase) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase que desee");
        frase = leer.nextLine();
        String fraseOriginal = c1.getFrase();
        String frasesUnidas = fraseOriginal.concat(frase);

        System.out.println("Las frases unidas quedan " + frasesUnidas);
        return frasesUnidas;
    }

    public String reemplazarA(Cadena c1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el caracter por el que va a reemplazar a A");
        String letra = leer.next();
        String frase = c1.getFrase();
        String fraseReemplazada = frase.replaceAll("a", letra);

        System.out.println("La frase con el caracter nuevo es " + fraseReemplazada);
        return fraseReemplazada;
    }

    public boolean contiene(Cadena c1) {
        boolean resultado = false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la letra que desee");
        char letra = leer.next().charAt(0);
        for (int i = 0; i < c1.getLongitud(); i++) {
            resultado = letra == c1.getFrase().charAt(i);
        }
        return resultado;
    }
}
