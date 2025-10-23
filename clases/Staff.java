package clases;

public class Staff extends Miembros {
    private final int maxItems = 12;

    public Staff(int idMiembro, String nombre, String correo, String telefono) {
        super(idMiembro, nombre, correo, telefono);
    }

    @Override
    public boolean puedeSolicitar() {
        return prestamosActivos.size() < maxItems;
    }
}
