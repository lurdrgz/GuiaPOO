package pooej03;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author adminprueba
 */
public class Operacion {
// atributos de la clase
    private int numero1;
    private int numero2;

//constructor que recibe los dos atributos como parametros
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

//constructor vacio
    public Operacion() {
    }

//metodos get
    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

//metodos set
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    //pide por teclado los numeros y los guarda en los atributos
    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el numero 1 (entero)");
        numero1 = leer.nextInt();

        System.out.println("Ingrese el numero 2 (entero)");
        numero2 = leer.nextInt();
    }
//metodo para sumar
    public int sumar() {
        int suma;
        suma = numero1 + numero2;
        System.out.println("El resultado de la suma es " + suma);
        return suma;
    }
//metodo para restar
    public int restar() {
        int resta;
        resta = numero1 - numero2;
        System.out.println("El resultado de la resta es " + resta);
        return resta;
    }
//metodo para multiplicar
    public int multiplicar() {
        int producto;
        producto = numero1 * numero2;
        System.out.println("El resultado de la multiplicacion es " + producto);
        return producto;
    }
//metodo para dividir
    public double dividir() {
        if (numero2 == 0) {
            System.out.println("No es posible dividir entre 0");
            return 0;
        } else {
             double cociente;
             cociente = numero1/numero2;
             System.out.println("El resultado de la division es " + cociente);
             return cociente;
             //el cociente esta dando un resultado truncado, ya que los numeros deberian ser double para poder dar como resultado una division normal
        }
    }
}
