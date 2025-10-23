package clases;

public class CopiaLibro {
    private int idCopia;
    private String estado; 
    private Libro libro;
    private boolean prestamoCorto;

    public CopiaLibro(int idCopia, Libro libro, boolean prestamoCorto) {
        this.idCopia = idCopia;
        this.libro = libro;
        this.estado = "disponible";
        this.prestamoCorto = prestamoCorto;
    }

    public int getIdCopia() {
        return idCopia;
    }

    public boolean esDisponible() {
        return estado.equals("disponible");
    }

    public void marcarPrestado() {
        estado = "prestado";
    }

    public void marcarDisponible() {
        estado = "disponible";
    }

    public boolean esPrestamoCorto() {
        return prestamoCorto;
    }
}
