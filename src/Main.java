
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libreria libreria = new Libreria();
        int op;



            System.out.println("****************");
            System.out.println("* Bienvenido/a *\n****************\n");
            System.out.println("1. Buscar libro por titulo ");
            System.out.println("2. Buscar libro por autor ");
            System.out.println("3. Mostrar Inventario");
            System.out.println("4. Agregar libro");
            System.out.println("5. Devolver libro");
            System.out.println("6. Salir\n");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = sc.nextLine();
                    Libro libroTitulo = libreria.buscarLibroPorTitulo(titulo);
                    if (libroTitulo != null) {
                        System.out.println(libroTitulo.getTitulo() + " - " + libroTitulo.getAutor() + "\nPrecio: " + libroTitulo.getPrecio());
                    } else {
                        System.out.println("No se encontró ningún libro con el título ingresado.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del autor: ");
                    String autor = sc.next();
                    Libro libroAutor = libreria.buscarLibroPorAutor(autor);
                    if (libroAutor != null) {
                        System.out.println(libroAutor.getTitulo() + " - " + libroAutor.getAutor() + "\nPrecio: " + libroAutor.getPrecio());
                    } else {
                        System.out.println("No se encontró ningún libro del autor ingresado.");
                    }
                    break;
                /*
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
                    int anioPublicacionNuevo = sc.nextInt();
                    System.out.print("Ingrese el precio del libro: ");
                    double precioNuevo = sc.nextDouble();
                    Libro nuevoLibro = new Libro(tituloNuevo, autorNuevo, isbn, editorialNuevo, anioPublicacionNuevo, precioNuevo);
                    libreria.agregarLibro(isbn, nuevoLibro);
                    System.out.println("Libro agregado exitosamente.");
                    break;
                case 4:
                    System.out.println("Este es el inventario");
                    libreria.imprimirLibros();
                case 5:*/
            }

    }
}

