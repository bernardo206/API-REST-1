package org.dh.c2023I.clinica.controller;

import java.util.List;

public interface IController<E> {
    List<E> listarTodos();
}
