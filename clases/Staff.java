package clases;

//Staff es una subclase de la superclase Miembros
public class Staff extends Miembros {
    private final int maxItems = 12; //no puede cambiar su valor

    //CONSTRUCTOR DE INSTANCIA
    public Staff(int idMiembro, String nombre, String correo, String telefono) {
        super(idMiembro, nombre, correo, telefono);
    }

    //Uso del método abstracto
    @Override
    public boolean puedeSolicitar() {
        return prestamosActivos.size() < maxItems;
    }
}
