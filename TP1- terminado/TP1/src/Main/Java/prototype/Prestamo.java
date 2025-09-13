package Main.Java.prototype;

import Main.Java.factory.Libro;
import Main.Java.builder.Usuario;

import java.time.LocalDate;

public class Prestamo implements Cloneable {

    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Prestamo(Libro libro, Usuario usuario, LocalDate fechaInicio, LocalDate fechaFin) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // Getters y setters
    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    // implementacion de clone
    @Override
    public Prestamo clone() {
        try {
            return (Prestamo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    // funcion para mostrar informacion
    public void mostrarInfo() {
        System.out.println("Libro: " + libro.getTipo());
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Fecha Inicio: " + fechaInicio);
        System.out.println("Fecha Fin: " + fechaFin);
        System.out.println("--------------------------");
    }
}