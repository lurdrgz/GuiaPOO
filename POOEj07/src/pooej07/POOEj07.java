/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej07;

/**
 *
 * @author adminprueba
 */
public class POOEj07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", 15, "H", 80, 1.5);
        Persona p2 = new Persona("Ana", 20, "M", 50, 1.7);
        Persona p3 = new Persona("Onix", 14, "O", 60, 1.7);
        Persona p4 = new Persona("Tita", 30, "M", 45, 1.6);

        int imc1 = p1.calcularIMC();
        int imc2 = p2.calcularIMC();
        int imc3 = p3.calcularIMC();
        int imc4 = p4.calcularIMC();

        boolean edad1 = p1.esMayorEdad();
        boolean edad2 = p2.esMayorEdad();
        boolean edad3 = p3.esMayorEdad();
        boolean edad4 = p4.esMayorEdad();
        
        double bajoPesoCont = 0;
        double normoPesoCont = 0;
        double sobrePesoCont = 0;
        
        switch (imc1) {
            case -1:
                bajoPesoCont++;
                break;
            case 0:
                normoPesoCont++;
                break;             
            case 1:
                sobrePesoCont++;
                break;
        }
        switch (imc2) {
            case -1:
                bajoPesoCont++;
                break;
            case 0:
                normoPesoCont++;
                break;             
            case 1:
                sobrePesoCont++;
                break;
        }
        switch (imc3) {
            case -1:
                bajoPesoCont++;
                break;
            case 0:
                normoPesoCont++;
                break;             
            case 1:
                sobrePesoCont++;
                break;
        }
        switch (imc4) {
            case -1:
                bajoPesoCont++;
                break;
            case 0:
                normoPesoCont++;
                break;             
            case 1:
                sobrePesoCont++;
                break;
        }
        
        double porcentajeBajo = bajoPesoCont/4*100;
        double porcentajeNormo = normoPesoCont/4*100;
        double porcentajeSobre = sobrePesoCont/4*100;
        
        System.out.println("El porcentaje de personas con bajo peso es " + porcentajeBajo + "%");
        
        System.out.println("El porcentaje de personas con normopeso es " + porcentajeNormo + "%");
        
        System.out.println("El porcentaje de personas con sobrepeso es " + porcentajeSobre + "%");
        
        double mayorCont = 0;
        double menorCont = 0;
        
        if (edad1) {
            mayorCont++;
        } else {
            menorCont++;              
        }
         
        if (edad2) {
            mayorCont++;
        } else {
            menorCont++;              
        } 
        
        if (edad3) {
            mayorCont++;
        } else {
            menorCont++;              
        }
        
        if (edad4) {
            mayorCont++;
        } else {
            menorCont++;              
        }
        
        double porcentajeMayor = mayorCont/4*100;
        double porcentajeMenor = menorCont/4*100;
        
        System.out.println("El porcentaje de personas mayores de edad es " + porcentajeMayor + "%");
        System.out.println("El porcentaje de personas menores de edad es " + porcentajeMenor + "%");

    }

}
