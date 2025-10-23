package clases;
import java.util.*;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private List<Libro> catalogoLibros;
    private List<Revista> catalogoRevistas;
    private List<Miembros> listaMiembros;

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.catalogoLibros = new ArrayList<>();
        this.catalogoRevistas = new ArrayList<>();
        this.listaMiembros = new ArrayList<>();
    }

    public void registrarMiembro(Miembros miembro) {
        listaMiembros.add(miembro);
    }

    public void eliminarMiembro(int idMiembro) {
        listaMiembros.removeIf(m -> m.getIdMiembro() == idMiembro);
    }

    public void mostrarLibros() {
        for (Libro libro : catalogoLibros) {
            libro.mostrarInformacion();
        }
    }

    public void mostrarRevistas() {
        for (Revista revista : catalogoRevistas) {
            revista.mostrarInformacion();
        }
    }

    public void mostrarInformacion() {
        System.out.println("Biblioteca: " + nombre + " - Dirección: " + direccion);
    }

    public void agregarLibro(Libro libro) {
        catalogoLibros.add(libro);
    }

    public void agregarRevista(Revista revista) {
        catalogoRevistas.add(revista);
    }
}
