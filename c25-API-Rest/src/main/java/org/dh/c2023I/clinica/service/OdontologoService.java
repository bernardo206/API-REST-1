package org.dh.c2023I.clinica.service;

import org.dh.c2023I.clinica.model.Odontologo;
import org.dh.c2023I.clinica.persistence.dao.IDao;
import org.dh.c2023I.clinica.persistence.dao.impl.OdontologoDao;

import java.util.List;

public class OdontologoService {

    IDao<Odontologo> odontologoDao = new OdontologoDao();

    public List<Odontologo> listarTodos(){
        return odontologoDao.findAll();
    }
}
