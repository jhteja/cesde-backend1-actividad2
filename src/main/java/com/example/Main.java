package com.example;

public class Main {
    public static void main(String[] args) {
        // constructor vacío
        Libro l1 = new Libro();
        
        // Constructor con parámetros
        Libro l2 = new Libro("Harry Potter", "J.K. Rowling");

        // Constructor completo
        Libro l3 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200);

        // Imprimiendo los libros
        System.out.println(l1);
        System.out.println(l2); 
        System.err.println(l3);
        
        // Método para mostrar información cuenta bancaria
        
        CuentaBancaria cuenta = new CuentaBancaria("Maria", 500);
        cuenta.depositar(200); // Depositar dinero
        System.out.println(cuenta.getSaldo()); // Debería mostrar 700
        cuenta.retirar(1000);
        System.out.println(cuenta.getSaldo());  // Debería mostrar error de fondos insuficientes



        //Métodos para mostrar información del estudiante
        Estudiante estudiante1 = new Estudiante("Pedro", 21, 2.5);
        estudiante1.mostrarInfo();
        estudiante1.haAprobado();

        Estudiante estudiante2 = new Estudiante("Ana", 19, 3.5);
        estudiante2.mostrarInfo();
        estudiante2.haAprobado();
    }



}