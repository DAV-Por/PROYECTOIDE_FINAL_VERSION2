
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libreria libreria = new Libreria();
        int op;
        String nombreUsuario, titulo, autor;
        do {
         System.out.println("****************");
         System.out.println("* Bienvenido/a *\n****************\n");
         System.out.println("1. Buscar libro por titulo ");
         System.out.println("2. Buscar libro por autor ");
         System.out.println("3. Mostrar Inventario");
         System.out.println("4. Agregar libro");
         System.out.println("5. Pedir préstamo");
         System.out.println("6. Devolver préstamo");
         System.out.println("7. Salir\n");

         op = sc.nextInt();
         switch (op) {
             case 1:
                 System.out.print("Ingrese el título del libro: ");
                 titulo = sc.next();
                 Libro busquedaTitulo = libreria.buscarLibroPorTitulo(titulo);
                 if (busquedaTitulo != null) {
                  System.out.println("¡Libro encontrado!¿Deseas prestarlo?");

                 }else
                    System.out.println("NO SISAS\n"+libreria.buscarLibroPorAutor(titulo));
                 break;
             case 2:
                System.out.print("Ingrese el nombre del autor: ");
                autor = sc.next();
                Libro libroAutor = libreria.buscarLibroPorAutor(autor);
                if (libroAutor != null) {
                System.out.println(libroAutor.getTitulo() + " - " + libroAutor.getAutor() +
                "\nPrecio: " + libroAutor.getPrecio());
                } else
                    System.out.println("No se encontró ningún libro del autor ingresado.");
                break;
            case 3:
                System.out.print("Ingrese el ISBN del libro: ");
                String isbn = sc.next();
                System.out.print("Ingrese el título del libro: ");
                String tituloNuevo = sc.next();
                System.out.print("Ingrese el autor del libro: ");
                 String autorNuevo = sc.next();
                System.out.print("Ingrese la editorial del libro: ");
                String editorialNuevo = sc.next();
                System.out.print("Ingrese el año de publicación del libro: ");
                int fechaNuevo = sc.nextInt();
                System.out.print("Ingrese el precio del libro: ");
                double precioNuevo = sc.nextDouble();
                Libro nuevoLibro = new Libro(tituloNuevo, autorNuevo, isbn, editorialNuevo,
                fechaNuevo, precioNuevo);
                libreria.agregarLibro(isbn, nuevoLibro);
                System.out.println("Libro agregado exitosamente.");
                break;
            case 4:
                 System.out.println("Este es el inventario");
                 libreria.imprimirLibros();
                 break;
            case 5:
                System.out.print("Ingrese el Titulo del libro que desea pedir préstamo: ");
                titulo = sc.next();
                Libro libroPrestamo = libreria.buscarLibroPorTitulo(titulo);
                if (libroPrestamo != null && !libroPrestamo.isPrestamoLibro()) {
                System.out.print("Ingrese su nombre de usuario: ");
                nombreUsuario = sc.next();
                System.out.println("Se ha concedido el préstamo del libro '" +
                libroPrestamo.getTitulo() + "' a " + nombreUsuario);
                libroPrestamo.setPrestamoLibro(true);
                } else
                    System.out.println("No se pudo realizar el préstamo. Verifique que el libro esté disponible.");
                break;
            case 6:
                System.out.print("Ingrese el Titulo del libro que desea pedir préstamo: ");
                titulo = sc.next();
                Libro libroDevolucion = libreria.buscarLibroPorTitulo(titulo);
                 if (libroDevolucion != null && libroDevolucion.isPrestamoLibro()) {
                     System.out.println("Se ha devuelto el préstamo del libro '" +
                     libroDevolucion.getTitulo() + "'.");
                     libroDevolucion.setPrestamoLibro(false);
                 }else
                     System.out.println("No se pudo realizar la devolución. Verifique que el libro esté prestado.");
                break;
         }
        }while (op != 5);
    }
}
