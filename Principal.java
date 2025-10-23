import clases.*;
public class Principal {
public static void main (String [] args) {
    //Creamos un objeto Biblioteca
    Biblioteca biblioteca = new Biblioteca("Biblioteca Regional Mario Vargas Llosa", "Calle San Francisco 308");
    biblioteca.mostrarInformacion();

    //Registrar miembros
    Socio socio1 = new Socio (1, "Juan Perez", "juan@gmail.com", "999000888");
    Staff staff1 = new Staff(2, "Maria Rodriguez", "maria123@gmail.com", "980980789");

    biblioteca.registrarMiembro(socio1);
    biblioteca.registrarMiembro(staff1);

    //Crear libros y copias
    Libro libro1 = new Libro ("El Principito", "Antoine de Saint-Exupéry", "12345", "1943");
    CopiaLibro copia1 = new CopiaLibro(101, libro1, false);
    CopiaLibro copia2 = new CopiaLibro(102, libro1, false);
    libro1.agregarCopia(copia1);
    libro1.agregarCopia(copia2);
    biblioteca.agregarLibro(libro1);

     //Crear revista
    Revista revista1 = new Revista("National Geographic", "N° 205", "2025-09");
    biblioteca.agregarRevista(revista1);

    //Mostrar catálogo
    System.out.println("\nCatálogo de libros");
    biblioteca.mostrarLibros();
    System.out.println("\nCatálogo de revistas");
    biblioteca.mostrarRevistas();

    //Préstamo de libro
    System.out.println("\nRealizando préstamo de libro");
    Prestamo prestamo1 = new Prestamo(500, socio1, copia1, 10);

    if (prestamo1.realizarPrestamo()) {
        copia1.marcarPrestado();
        System.out.println("Préstamo realizado con éxito ID: #" + socio1.getIdMiembro());
    } else {
        System.out.println("No se pudo realizar el préstamo. Límite alcanzado.");
    }
}
}