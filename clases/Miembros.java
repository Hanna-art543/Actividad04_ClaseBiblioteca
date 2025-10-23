package clases;

import java.util.*;

//CLASE ABSTRACTA
public abstract class Miembros {
    //ATRIBUTOS
    protected int idMiembro;
    protected String nombre;
    protected String correo;
    protected String telefono;
    protected List<Prestamo> prestamosActivos;

    //CONSTRUCTOR DE INSTANCIA
    public Miembros(int idMiembro, String nombre, String correo, String telefono) {
        this.idMiembro = idMiembro;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.prestamosActivos = new ArrayList<>();
    }

    //Método getter del ID miembro
    public int getIdMiembro() {
        return idMiembro;
    }
    public String getNombre() {
    return nombre;
    }

    //Método abstracto
    public abstract boolean puedeSolicitar();

    //Contar préstamos activos
    public int contarPrestamosActivos() {
        return prestamosActivos.size();
    }

    //Agregar un préstamo a la lista de préstamos activos
    public void agregarPrestamo(Prestamo prestamo) {
        prestamosActivos.add(prestamo);
    }

    //Mostrar información del miembro
    public void mostrarInformacion() {
        System.out.println("Miembro: " + nombre + " - Correo: " + correo);
    }
}
