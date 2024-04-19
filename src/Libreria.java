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
        libros.put("Cien años de soledad", new Libro("Cien años de soledad", "Gabriel Garcia Marquez", "978-0-307-26565-7", "Vintage Espanol", 1967, 15.99));
        libros.put("Don Quijote de la Mancha", new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "978-1-59308-141-7", "EDAF", 1605, 12.95));
        libros.put("Orgullo y prejuicio", new Libro("Orgullo y prejuicio", "Jane Austen", "978-0-19-280238-5", "Oxford University Press", 1813, 9.99));
        libros.put("1984",new Libro("1984", "George Orwell", "978-0-452-28423-4", "Signet Classic", 1949, 8.99));
        libros.put("El principito", new Libro("El principito", "Antoine de Saint-Exupery", "978-84-96739-42-1", "Editorial Salamandra", 1943, 7.50));
        libros.put("Matar a un ruiseñor", new Libro("Matar a un ruiseñor", "Harper Lee", "978-0-06-112008-4", "Harper Perennial Modern Classics", 1960, 11.99));
        libros.put("Los miserables", new Libro("Los miserables", "Victor Hugo", "978-1-59308-151-6", "EDAF", 1862, 14.95));
        libros.put("El gran Gatsby", new Libro("El gran Gatsby", "F. Scott Fitzgerald", "978-0-7432-7356-5", "Scribner", 1925, 10.00));
        libros.put("La metamorfosis", new Libro("La metamorfosis", "Franz Kafka", "978-0-553-21177-6", "Bantam Classics", 1915, 6.99));
        libros.put("Crimen y castigo", new Libro("Crimen y castigo", "Fyodor Dostoevsky", "978-1-59308-027-4", "EDAF", 1866, 13.99));
        libros.put("El guardian entre el centeno", new Libro("El guardian entre el centeno", "J.D. Salinger", "978-0-316-76948-4", "Little, Brown and Company", 1951, 9.95));
        libros.put("Rayuela", new Libro("Rayuela", "Julio Cortazar", "978-84-204-7875-4", "Alfaguara", 1963, 16.00));
        libros.put("Anna Karenina", new Libro("Anna Karenina", "Leo Tolstoy", "978-0-14-303500-8", "Penguin Classics", 1877, 11.99));
        libros.put("Moby Dick", new Libro("Moby Dick", "Herman Melville", "978-0-553-21241-4", "Bantam Classics", 1851, 10.95));
        libros.put("Ulises", new Libro("Ulises", "James Joyce", "978-0-14-028279-7", "Penguin Classics", 1922, 13.50));
        libros.put("Viaje al centro de la Tierra", new Libro("Viaje al centro de la Tierra", "Julio Verne", "978-0-553-21234-6", "Bantam Classics", 1864, 8.99));
        libros.put("El retrato de Dorian Gray", new Libro("El retrato de Dorian Gray", "Oscar Wilde", "978-0-486-29074-8", "Dover Publications", 1890, 5.00));
        libros.put("Los viajes de Gulliver", new Libro("Los viajes de Gulliver", "Jonathan Swift", "978-0-553-21135-6", "Bantam Classics", 1726, 6.50));
        libros.put("Cronica de una muerte anunciada", new Libro("Cronica de una muerte anunciada", "Gabriel Garcia Marquez", "978-1-4000-3476-2", "Vintage Espanol", 1981, 11.99));

    }


    //Metodo para agregar un libro
    public void agregarLibro(String titulo, Libro libro){
        libros.put(titulo, libro);
    }

    //Metodo para Buscar Libros Por Titulo
    public Libro buscarLibroPorTitulo(String titulo) {
        for (Map.Entry<String, Libro> entry : libros.entrySet()) {
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                return entry.getValue();
            }
        }
        return null;
    }
    //Metodoo para Buscar Libros por autor
    public Libro buscarLibroPorAutor(String autor) {
        for (Map.Entry<String, Libro> entry : libros.entrySet()) {
            if (entry.getValue().getAutor().equalsIgnoreCase(autor)) {
                return entry.getValue();
            }
        }
        return null;
    }
    // Método para imprimir todos los libros del HashMap
    public void imprimirLibros() {
        for (Libro libro : libros.values()) {
            System.out.println("\n"+libro.getTitulo() + " - " + libro.getAutor() + "\nISBN: " + libro.getISBN() +
                    "\nEditorial: " + libro.getEditorial() + "\nAño de publicacion: " + libro.getFecha() + "\nPrecio: " + libro.getPrecio()+"\n");
        }
    }

}
