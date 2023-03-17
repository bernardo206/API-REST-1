package org.dh.c2023I.clinica.service;

import org.dh.c2023I.clinica.model.Paciente;
import org.dh.c2023I.clinica.persistence.dao.IDao;
import org.dh.c2023I.clinica.persistence.dao.impl.PacienteDao;

import java.util.List;

public class PacienteService {

    IDao<Paciente> dao = new PacienteDao();

    public List<Paciente> listarTodos() {
        return dao.findAll();
    }

    public Paciente crear(Paciente p) {
        if(p.getNombre() != null && !p.getNombre().isBlank()){
            return dao.save(p);
        }

        return null;
    }

    public Paciente modificar(Paciente p) {
        if(p.getId() != null){
            if(dao.findById(p.getId()) != null){
                //TODO: agrear los cambios
            }
        }

        return null;
    }
}
