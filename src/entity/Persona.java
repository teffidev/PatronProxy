package entity;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private String DNI;
    private String nombreDeVacuna;
    private LocalDate fecha;

    public Persona(String nombre, String apellido, String DNI, String nombreDeVacuna, LocalDate fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.nombreDeVacuna = nombreDeVacuna;
        this.fecha = fecha;
    }

    public Object[] datos() {
        Object[] informacion;
        informacion = new Object[2];
        informacion[0] = DNI;
        informacion[1] = fecha;
        return informacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombreDeVacuna() {
        return nombreDeVacuna;
    }

    public void setNombreDeVacuna(String nombreDeVacuna) {
        this.nombreDeVacuna = nombreDeVacuna;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
