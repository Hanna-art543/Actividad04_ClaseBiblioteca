package clases;

public class Socio extends Miembros {
    private final int maxItems = 6;

    public Socio(int idMiembro, String nombre, String correo, String telefono) {
        super(idMiembro, nombre, correo, telefono);
    }

    @Override
    public boolean puedeSolicitar() {
        return prestamosActivos.size() < maxItems;
    }
}
