package clases;

//Socio es una subclase  de la superclase Miembros
public class Socio extends Miembros {
    private final int maxItems = 6; //no puede cambiar su valor

    //CONSTRUCTOR DE INSTANCIA
    public Socio(int idMiembro, String nombre, String correo, String telefono) {
        super(idMiembro, nombre, correo, telefono);
    }

    //Uso del método abstracto
    @Override
    public boolean puedeSolicitar() {
        return prestamosActivos.size() < maxItems;
    }
}
