package clases;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Prestamo {
    //ATRIBUTOS
    private int idPrestamo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Miembros miembro;
    private Object itemPrestado; // Libro o Revista
    private boolean devuelto;
    private int maxDias = 21;

    //CONSTRUCTOR DE INSTANCIA
    public Prestamo(int idPrestamo, Miembros miembro, Object itemPrestado, int maxDias) {
        this.idPrestamo = idPrestamo;
        this.miembro = miembro;
        this.itemPrestado = itemPrestado;
        this.fechaInicio = LocalDate.now();
        this.fechaFin = fechaInicio.plusDays(maxDias);
        this.maxDias = maxDias;
        this.devuelto = false;
    }

    //Realizar préstamo (validar)
    public boolean realizarPrestamo() {
        if (miembro.puedeSolicitar()) {
            miembro.agregarPrestamo(this);
            return true;
        }
        return false;
    }

    //Marcar el ítem como devuelto
    public void devolverItem() {
        this.devuelto = true;
    }

    //Verificar si el préstamo está vencido
    public boolean estaVencido() {
        return LocalDate.now().isAfter(fechaFin);
    }

    //Calcular días restantes
    public int calcularDiasRestantes() {
        return (int) ChronoUnit.DAYS.between(LocalDate.now(), fechaFin);
    }
}
