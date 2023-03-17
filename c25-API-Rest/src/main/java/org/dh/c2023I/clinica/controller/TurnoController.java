package org.dh.c2023I.clinica.controller;

import org.dh.c2023I.clinica.model.Turno;
import org.dh.c2023I.clinica.service.TurnoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TurnoController implements IController<Turno>{

    TurnoService service = new TurnoService();

    @GetMapping("turno-por-paciente")
    public List<Turno> listarTodosLosTurnosDeUnPaciente(@RequestParam Integer idPaciente) {
        return service.listarTodosLosTurnosDeUnPaciente(idPaciente);
    }

    @Override
    public List<Turno> listarTodos() {
        return null;
    }
}
