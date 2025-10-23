package clases;

public class CopiaLibro {
    //ATRIBUTOS
    private int idCopia;
    private String estado; 
    private Libro libro;
    private boolean prestamoCorto;

    //CONSTRUCTOR DE INSTANCIA
    public CopiaLibro(int idCopia, Libro libro, boolean prestamoCorto) {
        this.idCopia = idCopia;
        this.libro = libro;
        this.estado = "disponible";
        this.prestamoCorto = prestamoCorto;
    }

    //Método getter del identificador
    public int getIdCopia() {
        return idCopia;
    }

    //Verificar si está disponible
    public boolean esDisponible() {
        return estado.equals("disponible");
    }

    //Marcar copia como prestada
    public void marcarPrestado() {
        estado = "prestado";
    }

    //Marcar copia como disponible
    public void marcarDisponible() {
        estado = "disponible";
    }

    //Verificar si el préstamo es corto
    public boolean esPrestamoCorto() {
        return prestamoCorto;
    }
}
