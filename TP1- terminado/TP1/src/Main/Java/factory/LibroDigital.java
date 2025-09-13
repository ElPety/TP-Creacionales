package Main.Java.factory;

public class LibroDigital implements Libro {

    private String titulo;

    public LibroDigital(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String getTipo() {
        return "Libro Digital: " + titulo;
    }
}