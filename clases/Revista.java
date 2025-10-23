package clases;

public class Revista {
    private String editorial;
    private String numeroEdicion;
    private String fechaPublicacion;
    private boolean disponible = true;

    public Revista(String editorial, String numeroEdicion, String fechaPublicacion) {
        this.editorial = editorial;
        this.numeroEdicion = numeroEdicion;
        this.fechaPublicacion = fechaPublicacion;
    }

    public void mostrarInformacion() {
        System.out.println("Revista: " + editorial + " - Edición: " + numeroEdicion);
    }

    public void marcarPrestado() {
        disponible = false;
    }

    public void marcarDisponible() {
        disponible = true;
    }

    public boolean esDisponible() {
        return disponible;
    }
}
