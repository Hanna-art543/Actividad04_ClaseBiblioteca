package clases;
import java.util.*;

public class Biblioteca {
    // ATRIBUTOS 
    private String nombre;
    private String direccion;
    private List<Libro> catalogoLibros;
    private List<Revista> catalogoRevistas;
    private List<Miembros> listaMiembros;

    //CONSTRUCTOR DE INSTANCIA
    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.catalogoLibros = new ArrayList<>();
        this.catalogoRevistas = new ArrayList<>();
        this.listaMiembros = new ArrayList<>();
    }

    // Registrar miembro
    public void registrarMiembro(Miembros miembro) {
        listaMiembros.add(miembro);
    }

    //Eliminar miembro por ID
    public void eliminarMiembro(int idMiembro) {
        listaMiembros.removeIf(m -> m.getIdMiembro() == idMiembro);
    }

    //Mostrar libros del catálogo
    public void mostrarLibros() {
        for (Libro libro : catalogoLibros) {
            libro.mostrarInformacion();
        }
    }

    //Mostrar revistas del catálogo
    public void mostrarRevistas() {
        for (Revista revista : catalogoRevistas) {
            revista.mostrarInformacion();
        }
    }

    //Mostrar información general de la biblioteca
    public void mostrarInformacion() {
        System.out.println("Biblioteca: " + nombre + " - Dirección: " + direccion);
    }

    //Agregar libros y revistas
    public void agregarLibro(Libro libro) {
        catalogoLibros.add(libro);
    }

    public void agregarRevista(Revista revista) {
        catalogoRevistas.add(revista);
    }
}
