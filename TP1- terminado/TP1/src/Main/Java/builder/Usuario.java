package Main.Java.builder;

import java.time.LocalDate;

public class Usuario {

    // Atributos opcionales
    private final String nombre;
    private final String email;
    private final String direccion;
    private final String telefono;
    private final LocalDate fechaNacimiento;

    public String getNombre() {
        return nombre;
    }

    // Constructor privado
    private Usuario(Builder builder) {
        this.nombre = builder.nombre;
        this.email = builder.email;
        this.direccion = builder.direccion;
        this.telefono = builder.telefono;
        this.fechaNacimiento = builder.fechaNacimiento;
    }

    // funcion para mostrar informacion
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("---------------------------");
    }


    // Builder estatico
    public static class Builder {
        private String nombre;
        private String email;
        private String direccion;
        private String telefono;
        private LocalDate fechaNacimiento;

        public Builder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setDireccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Builder setTelefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Builder setFechaNacimiento(LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public Usuario build() {
            return new Usuario(this);
        }
    }
}