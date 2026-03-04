package com.example;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    public Libro(String titulo, String autor, int paginas) { // Constructor completo
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Libro() { // Constructor vacío
        this.titulo = "Desconocido";
        this.autor = "Anónimo";
        this.paginas = 0;
    }

     public Libro(String titulo, String autor) { // Constructor título y autor
         this.titulo = titulo;
         this.autor = autor;
         this.paginas = 0; // Valor predeterminado para páginas
    }
    public Libro(String titulo) {
        this.titulo = titulo;
        this.autor = "Anónimo"; // Valor predeterminado para autor
        this.paginas = 0; // Valor predeterminado para páginas
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }   
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void mostrarDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
    }



@Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
