package clases;

import java.util.*;

class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private String fechaPublicacion;
    private List<CopiaLibro> copias;

    public Libro(String titulo, String autor, String isbn, String fechaPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.fechaPublicacion = fechaPublicacion;
        this.copias = new ArrayList<>();
    }

    public void agregarCopia(CopiaLibro copia) {
        copias.add(copia);
    }

    public List<CopiaLibro> obtenerCopiasDisponibles() {
        List<CopiaLibro> disponibles = new ArrayList<>();
        for (CopiaLibro c : copias) {
            if (c.esDisponible()) disponibles.add(c);
        }
        return disponibles;
    }

    public void mostrarInformacion() {
        System.out.println("Libro: " + titulo + " - Autor: " + autor + " - ISBN: " + isbn);
    }

    public void marcarPrestado(int idCopia) {
        for (CopiaLibro c : copias) {
            if (c.getIdCopia() == idCopia) c.marcarPrestado();
        }
    }

    public void marcarDisponible(int idCopia) {
        for (CopiaLibro c : copias) {
            if (c.getIdCopia() == idCopia) c.marcarDisponible();
        }
    }
}
