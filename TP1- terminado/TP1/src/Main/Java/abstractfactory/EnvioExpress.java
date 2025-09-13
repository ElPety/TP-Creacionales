package Main.Java.abstractfactory;

// Envio express
public class EnvioExpress implements MetodoEnvio {
    @Override
    public void enviar() {
        System.out.println("Envío Express activado");
    }
}