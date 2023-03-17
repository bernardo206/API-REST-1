package org.dh.c2023I.clinica.service;

import org.apache.log4j.Logger;
import org.dh.c2023I.clinica.model.Turno;
import org.dh.c2023I.clinica.persistence.dao.impl.TurnoDao;

import java.util.List;

public class TurnoService {

    Logger logger = Logger.getLogger(TurnoService.class);

    private TurnoDao dao = new TurnoDao();
    public List<Turno> listarTodosLosTurnosDeUnPaciente(Integer idPaciente) {
        if(idPaciente >= 1) {
            logger.info("El id es válido :D");
            return dao.findByPaciente(idPaciente);
        }

        return null;
    }
}
