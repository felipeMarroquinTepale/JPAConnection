package org.example.jpaprueba.controller;


import org.example.jpaprueba.dao.AlumnoDAO;
import org.example.jpaprueba.dao.AlumnoDAOImpl;
import org.example.jpaprueba.model.Alumno;

import java.util.List;

public class AlumnoController {

    private AlumnoDAO alumnoDAO;

    public AlumnoController() {
        this.alumnoDAO = new AlumnoDAOImpl();
    }

    public void crearAlumno(Alumno alumno) {
        alumnoDAO.crearAlumno(alumno);
    }

    public Alumno obtenerAlumnoPorId(int id) {
        return alumnoDAO.obtenerAlumnoPorId(id);
    }

    public List<Alumno> obtenerTodosLosAlumnos() {
        return alumnoDAO.obtenerTodosLosAlumnos();
    }

    public void actualizarAlumno(Alumno alumno) {
        alumnoDAO.actualizarAlumno(alumno);
    }

    public void eliminarAlumno(int id) {
        alumnoDAO.eliminarAlumno(id);
    }
}
