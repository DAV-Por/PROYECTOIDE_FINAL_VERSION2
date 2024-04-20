public class  Libro {
    private String Titulo;
    private String Autor;
    private String ISBN;
    private String Editorial;
    private int Fecha;
    private double Precio;
    private boolean prestamoLibro;

    public Libro(){

    }

    public Libro(String titulo, String autor, String ISBN, String editorial, int fecha, double precio) {
        Titulo = titulo;
        Autor = autor;
        this.ISBN = ISBN;
        Editorial = editorial;
        Fecha = fecha;
        Precio = precio;
    }


    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        Editorial = editorial;
    }

    public int getFecha() {
        return Fecha;
    }

    public void setFecha(int fecha) {
        Fecha = fecha;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public boolean isPrestamoLibro() {
        return prestamoLibro;
    }

    public void setPrestamoLibro(boolean prestamoLibro) {
        this.prestamoLibro = prestamoLibro;
    }
}
