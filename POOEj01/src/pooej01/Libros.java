/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import java.util.Scanner;

/**
 *
 * @author adminprueba
 */

//atributos
public class Libros {

    public String isbn;
    public String titulo;
    public String autor;
    public int numeroPaginas;

    // constructor vacio
    public Libros() {
    }
    
    //constructor con todos los parametros
    public Libros(String isbn, String titulo, String autor, int numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;               
                
    }
    
    //necesito hacer un metodo que cargue un libro pidiendole los datos al usuario
    public void solicitarAtributos() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el ISBN");
        isbn = leer.nextLine();
        System.out.println("Ingrese el titulo");
        titulo = leer.nextLine();
        System.out.println("Ingrese el autor");
        autor = leer.nextLine();
        System.out.println("Ingrese la cantidad de paginas");
        numeroPaginas = leer.nextInt();
    }
    //metodo que muestra el objeto creado por pantalla
    public void mostrarLibro() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Cantidad de paginas: " + numeroPaginas);
              
    }
}
