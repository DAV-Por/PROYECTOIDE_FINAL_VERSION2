import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Libreria {
    //Se crea el HashMap
    private Map<String , Libro> libros = new HashMap<>();
    //Se contruye
    public Libreria() {
        libros = new HashMap<>();
        inventarioInicial();
    }

    private void inventarioInicial() {
        ArrayList<Libro> listaLibros = new ArrayList<>();
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", "978-0-307-26565-7", "Vintage Espanol", 1967, 15.99);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "978-1-59308-141-7", "EDAF", 1605, 12.95);
        Libro libro3 = new Libro("Orgullo y prejuicio", "Jane Austen", "978-0-19-280238-5", "Oxford University Press", 1813, 9.99);
        libros.put(libro1.getTitulo(), libro1);libros.put(libro2.getTitulo(), libro2);libros.put(libro3.getTitulo(), libro3);
    }


    //Metodo para agregar un libro
    public void agregarLibro(String titulo, Libro libro){
        libros.put(titulo, libro);
    }
    //Metodo para Buscar Libros Por Titulo
    public Libro buscarLibroPorTitulo(String titulo) {
        boolean esta = libros.containsKey(titulo);
        return esta ? libros.get(titulo) : null;
    }
    //Metodoo para Buscar Libros por autor
    public Libro buscarLibroPorAutor(String autor) {
        boolean esta = libros.containsKey(autor);
        return esta ? libros.get(autor) : null;
    }
    // Método para imprimir todos los libros del HashMap
    public void imprimirLibros() {
        for (Libro libro : libros.values()) {
            System.out.println("\n"+libro.getTitulo() + " - " + libro.getAutor() + "\nISBN: " + libro.getISBN() +
                    "\nEditorial: " + libro.getEditorial() + "\nAño de publicacion: " + libro.getFecha() + "\nPrecio: " + libro.getPrecio()+"\n");
        }
    }
    public void cambiarEstadoPrestamo(String isbn, boolean nuevoEstado) {
        Libro libro = libros.get(isbn);
        if (libro != null) {
            libro.setPrestamoLibro(nuevoEstado);
        } else {
            System.out.println("No se encontró el libro con el ISBN ingresado.");
        }
    }

}
