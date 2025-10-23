package clases;

import java.util.*;

public abstract class Miembros {
    protected int idMiembro;
    protected String nombre;
    protected String correo;
    protected String telefono;
    protected List<Prestamo> prestamosActivos;

    public Miembros(int idMiembro, String nombre, String correo, String telefono) {
        this.idMiembro = idMiembro;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.prestamosActivos = new ArrayList<>();
    }

    public int getIdMiembro() {
        return idMiembro;
    }

    public abstract boolean puedeSolicitar();

    public int contarPrestamosActivos() {
        return prestamosActivos.size();
    }

    public void agregarPrestamo(Prestamo prestamo) {
        prestamosActivos.add(prestamo);
    }

    public void mostrarInformacion() {
        System.out.println("Miembro: " + nombre + " - Correo: " + correo);
    }
}
