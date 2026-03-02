public class Libro {

    // atributos de la clase
    private int id;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro(int id, String titulo, String autor, int numPaginas) { // parametros del metodo
        int numHojas; // variable del metodo

        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;

        numHojas = numPaginas/2;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}