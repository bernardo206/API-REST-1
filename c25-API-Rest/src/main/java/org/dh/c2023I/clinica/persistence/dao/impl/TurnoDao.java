package org.dh.c2023I.clinica.persistence.dao.impl;

import org.dh.c2023I.clinica.model.Odontologo;
import org.dh.c2023I.clinica.model.Paciente;
import org.dh.c2023I.clinica.model.Turno;
import org.dh.c2023I.clinica.persistence.dao.IDao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TurnoDao implements IDao<Turno> {

    List<Turno> turnos = new ArrayList<>();

    public TurnoDao() {
        Paciente p = new Paciente(1, "001", "Paciente 1", null);
        Paciente p2 = new Paciente(2, "002", "Paciente 2", null);
        Odontologo o1 = new Odontologo(1, "123456", "Odontologo 1");
        Odontologo o2 = new Odontologo(2, "123457", "Odontologo 2");

        turnos.add(new Turno(p, o1, LocalDate.now()));
        turnos.add(new Turno(p, o2, LocalDate.of(2023, 3, 15)));
        turnos.add(new Turno(p2, o1, LocalDate.of(2023, 3, 15)));
    }

    @Override
    public List<Turno> findAll() {
        return null;
    }

    @Override
    public Turno findById(Integer id) {
        return null;
    }

    @Override
    public Turno save(Turno turno) {
        return null;
    }

    public List<Turno> findByPaciente(Integer idPaciente){
        List<Turno> resultado = new ArrayList<>();

        for (Turno t : this.turnos) {
            if(t.getPaciente().getId().equals(idPaciente)){
                resultado.add(t);
            }
        }

        return resultado;
    }
}
