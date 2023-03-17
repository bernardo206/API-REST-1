package org.dh.c2023I.clinica.model;

public class Odontologo {
    private Integer id;
    private String nroDeMatricula;
    private String nombre;

    public Odontologo(Integer id, String nroDeMatricula, String nombre) {
        this.id = id;
        this.nroDeMatricula = nroDeMatricula;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNroDeMatricula() {
        return nroDeMatricula;
    }

    public void setNroDeMatricula(String nroDeMatricula) {
        this.nroDeMatricula = nroDeMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Odontologo{" +
                "id=" + id +
                ", nroDeMatricula='" + nroDeMatricula + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
