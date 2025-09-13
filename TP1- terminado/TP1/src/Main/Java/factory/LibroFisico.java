package Main.Java.factory;

public class LibroFisico implements Libro {

    private String titulo;

    public LibroFisico(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String getTipo() {
        return "Libro Físico: " + titulo;
    }
}