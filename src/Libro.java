public class  Libro {
    String Titulo;
    String Autor;
    String ISBN;
    String Editorial;
    int Fecha;
    double Precio;
    boolean libroPrestado = false;

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

    public boolean isLibroPrestado() {
        return libroPrestado;
    }

    public void setLibroPrestado(boolean libroPrestado) {
        this.libroPrestado = libroPrestado;
    }
}
