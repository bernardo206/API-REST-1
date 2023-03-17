package org.dh.c2023I.clinica.model;

public class Domicilio {
    Integer id;
    String direccion;
    String ciudad;

    public Domicilio(Integer id, String direccion, String ciudad) {
        this.id = id;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
