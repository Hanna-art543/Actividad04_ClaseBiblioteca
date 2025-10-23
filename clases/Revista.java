package clases;

public class Revista {
    //ATRIBUTOS
    private String editorial;
    private String numeroEdicion;
    private String fechaPublicacion;
    private boolean disponible = true; //por defecto

    //CONSTRUCTOR DE INSTANCIA
    public Revista(String editorial, String numeroEdicion, String fechaPublicacion) {
        this.editorial = editorial;
        this.numeroEdicion = numeroEdicion;
        this.fechaPublicacion = fechaPublicacion;
    }

    //Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Revista: " + editorial + " - Edición: " + numeroEdicion);
    }

    //Métodos para controlar las acciones con revista
    public void marcarPrestado() {
        disponible = false;
    }

    public void marcarDisponible() {
        disponible = true;
    }

    //Consultar si está disponible
    public boolean esDisponible() {
        return disponible;
    }
}
