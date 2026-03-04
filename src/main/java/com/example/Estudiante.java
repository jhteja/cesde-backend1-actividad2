package com.example;

public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public Estudiante() {
        this.nombre = "Desconocido";
        this.edad = 0;
        this.promedio = 0.0;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        if (edad <= 0) {
            return 0; // Si la edad es negativa, se devuelve 0
        }   
        return edad;
    }
    public double getPromedio() {
        return promedio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void haAprobado() {
        if (promedio >= 3.0) {
            boolean aprobado = true;
            System.out.println(nombre + " ha aprobado con un promedio de " + promedio);
        } else {
            boolean aprobado = false;
            System.out.println(nombre + " no ha aprobado con un promedio de " + promedio);
        }
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
    }   


    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", promedio=" + promedio +
                '}';
    }

}
