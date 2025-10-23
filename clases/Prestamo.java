package clases;

import java.time.LocalDate;
import java.util.*;

public class Prestamo {
    private int idPrestamo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Miembros miembro;
    private Object itemPrestado; // Libro o Revista
    private boolean devuelto;
    private int maxDias = 21;

    public Prestamo(int idPrestamo, Miembros miembro, Object itemPrestado, int maxDias) {
        this.idPrestamo = idPrestamo;
        this.miembro = miembro;
        this.itemPrestado = itemPrestado;
        this.fechaInicio = LocalDate.now();
        this.fechaFin = fechaInicio.plusDays(maxDias);
        this.maxDias = maxDias;
        this.devuelto = false;
    }

    public boolean realizarPrestamo() {
        if (miembro.puedeSolicitar()) {
            miembro.agregarPrestamo(this);
            return true;
        }
        return false;
    }

    public void devolverItem() {
        this.devuelto = true;
    }

    public boolean estaVencido() {
        return LocalDate.now().isAfter(fechaFin);
    }

    public int calcularDiasRestantes() {
        return (int) ChronoUnit.DAYS.between(LocalDate.now(), fechaFin);
    }
}
