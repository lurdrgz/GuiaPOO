/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej05;

import java.util.Scanner;

/**
 *
 * @author adminprueba
 */
public class CuentaBancaria {

    private int numeroCuenta;
    private long dni;
    private int saldoActual;

    //constructor vacio
    public CuentaBancaria() {
    }

    //constructor que recibe los atributos por parametros
    public CuentaBancaria(int numeroCuenta, long dni, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    //getter
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    //setter
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void crearCuenta() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de cuenta");
        numeroCuenta = leer.nextInt();

        System.out.println("Ingrese el DNI");
        dni = leer.nextLong();

        System.out.println("Ingrese el saldo inicial de la cuenta");
        saldoActual = leer.nextInt();
    }

    public void ingresar(int ingreso) {
        saldoActual = saldoActual + ingreso;
        System.out.println("El saldo final es " + saldoActual);
    }
    
    public void retirar(int retiro) {
        saldoActual = saldoActual - retiro;
        
        if (saldoActual > 0) {
            System.out.println("El saldo actual es " + saldoActual);
        } else {
            saldoActual = 0;
            System.out.println("El saldo actual es " + saldoActual);
        }
    }
    
    public void extraccionRapida() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el monto que desea extraer");
        int monto = leer.nextInt();
        double porcentaje = (monto*100)/saldoActual;
        
        if (porcentaje < 20) {
            saldoActual = saldoActual - monto;
            System.out.println("Extraccion exitosa. El saldo actual es " + saldoActual);
        } else {
            System.out.println("El monto supera el 20% de su saldo actual. No es posible realizar la transaccion");
        }  
    }
    
    public void consultarSaldo() {
        System.out.println("El saldo actual es " + saldoActual);
    } 
    
    public void consultarDatos() {
        System.out.println("El numero de cuenta es " + numeroCuenta);
        System.out.println("El DNI del usuario es " + dni);
        System.out.println("El saldo actual es " + saldoActual);
    }
}
