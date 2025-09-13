package Main.Java.singleton;

import Main.Java.factory.Libro;
import java.util.ArrayList;
import java.util.List;

public class Database {

    // 1. Instancia unica (privada y estatica)
    private static Database instance;

    // 2. Lista para almacenar libros
    private List<Libro> libros;

    // 3. Constructor privado para evitar instanciacion externa
    private Database() {
        libros = new ArrayList<>();
    }

    // 4. Metodo publico para obtener la unica instancia
    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    // 5. Metodo para agregar un libro
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // 6. Metodo para listar todos los libros
    public List<Libro> listarLibros() {
        return libros;
    }
}