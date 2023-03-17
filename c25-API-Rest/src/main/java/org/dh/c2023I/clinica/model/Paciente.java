package org.dh.c2023I.clinica.model;

public class Paciente {
    private Integer id;

    private String documentoDeIdentidad;
    private String nombre;

    private Domicilio domicilio;

    public Paciente(Integer id, String documentoDeIdentidad, String nombre, Domicilio domicilio) {
        this.setId(id);
        this.setDocumentoDeIdentidad(documentoDeIdentidad);
        this.setNombre(nombre);
        this.setDomicilio(domicilio);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + getId() +
                ", documentoDeIdentidad='" + getDocumentoDeIdentidad() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", domicilio=" + getDomicilio() +
                '}';
    }

    public String getDocumentoDeIdentidad() {
        return documentoDeIdentidad;
    }

    public void setDocumentoDeIdentidad(String documentoDeIdentidad) {
        this.documentoDeIdentidad = documentoDeIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
}
