package clases;

import java.util.*;

public class Libro {
    //ATRIBUTOS
    private String titulo;
    private String autor;
    private String isbn;
    private String fechaPublicacion;
    private List<CopiaLibro> copias;

    //CONSTRUCTOR DE INSTANCIA
    public Libro(String titulo, String autor, String isbn, String fechaPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.fechaPublicacion = fechaPublicacion;
        this.copias = new ArrayList<>();
    }

    //Agregar una copia al libro
    public void agregarCopia(CopiaLibro copia) {
        copias.add(copia);
    }

    //Obtener copias disponibles para préstamo
    public List<CopiaLibro> obtenerCopiasDisponibles() {
        List<CopiaLibro> disponibles = new ArrayList<>();
        for (CopiaLibro c : copias) {
            if (c.esDisponible()) disponibles.add(c);
        }
        return disponibles;
    }

    //Mostrar información del libro
    public void mostrarInformacion() {
        System.out.println("Libro: " + titulo + " - Autor: " + autor + " - ISBN: " + isbn);
    }

    //Marcar una copia como prestado
    public void marcarPrestado(int idCopia) {
        for (CopiaLibro c : copias) {
            if (c.getIdCopia() == idCopia) c.marcarPrestado();
        }
    }

    //Marcar una copia como disponible
    public void marcarDisponible(int idCopia) {
        for (CopiaLibro c : copias) {
            if (c.getIdCopia() == idCopia) c.marcarDisponible();
        }
    }
}
