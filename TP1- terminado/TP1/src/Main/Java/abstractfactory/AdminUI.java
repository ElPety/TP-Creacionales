package Main.Java.abstractfactory;

// UI para administradores
public class AdminUI implements InterfazUI {
    @Override
    public void mostrar() {
        System.out.println("Mostrando interfaz de Administrador");
    }
}