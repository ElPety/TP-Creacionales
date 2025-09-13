package Main.Java.abstractfactory;

// UI para usuarios comunes
public class UsuarioUI implements InterfazUI {
    @Override
    public void mostrar() {
        System.out.println("Mostrando interfaz de Usuario");
    }
}