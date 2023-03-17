package org.dh.c2023I.clinica.persistence.dao.impl;

import org.dh.c2023I.clinica.model.Paciente;
import org.dh.c2023I.clinica.persistence.dao.IDao;

import java.util.ArrayList;
import java.util.List;

public class PacienteDao implements IDao<Paciente> {

    List<Paciente> pacientes = new ArrayList<>();

    public PacienteDao() {
        this.pacientes.add(new Paciente(1, "001", "Paciente 1", null));
        this.pacientes.add(new Paciente(2, "002", "Paciente 2", null));
        this.pacientes.add(new Paciente(3, "003", "Paciente 3", null));
    }

    @Override
    public List<Paciente> findAll() {
        return this.pacientes;
    }

    @Override
    public Paciente findById(Integer id) {
        for(Paciente p : pacientes){
            if(p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }

    @Override
    public Paciente save(Paciente paciente) {
        this.pacientes.add(paciente);
        return paciente;
    }
}
