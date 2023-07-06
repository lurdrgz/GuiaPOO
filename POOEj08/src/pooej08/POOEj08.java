/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej08;

import Entidades.Cadena;
import Servicio.CadenaServicio;
import static Servicio.CadenaServicio.mostrarMenu;
import java.util.Scanner;

/**
 *
 * @author adminprueba
 */
public class POOEj08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaServicio cs = new CadenaServicio();
        Cadena cadena1 = cs.crearCadena();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cs.mostrarVocales(cadena1);
                    break;
                case 2:
                    cs.invertirFrase(cadena1);
                    break;
                case 3:
                    cs.vecesRepetido(cadena1);
                    break;
                case 4:
                    cs.compararLongitud(cadena1, "");
                    break;
                case 5:
                    cs.unirFrases(cadena1, "");
                    break;
                case 6:
                    cs.reemplazarA(cadena1);
                    break;
                case 7:
                    boolean op7 = cs.contiene(cadena1);
                    System.out.println("Esta presente la letra en la frase?" + op7);
                    break;
                case 8:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida del 1 al 8.");
                    break;
            }
        } while (opcion != 8);
    }
}
