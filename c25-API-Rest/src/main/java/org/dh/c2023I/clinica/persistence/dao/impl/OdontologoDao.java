package org.dh.c2023I.clinica.persistence.dao.impl;

import org.dh.c2023I.clinica.model.Odontologo;
import org.dh.c2023I.clinica.persistence.dao.IDao;

import java.util.ArrayList;
import java.util.List;

public class OdontologoDao implements IDao<Odontologo> {

    List<Odontologo> odontologos = new ArrayList<>();

    public OdontologoDao() {
        odontologos.add(new Odontologo(1, "123456", "Odontologo 1"));
        odontologos.add(new Odontologo(2, "123457", "Odontologo 2"));
        odontologos.add(new Odontologo(3, "123458", "Odontologo 3"));
    }

    @Override
    public List<Odontologo> findAll() {
        return this.odontologos;
    }

    @Override
    public Odontologo findById(Integer id) {
        return null;
    }

    @Override
    public Odontologo save(Odontologo odontologo) {
        return null;
    }
}
