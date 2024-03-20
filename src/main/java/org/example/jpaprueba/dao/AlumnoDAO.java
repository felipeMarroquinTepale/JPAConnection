package org.example.jpaprueba.dao;

import org.example.jpaprueba.model.Alumno;
import java.util.List;

public interface AlumnoDAO {
    void crearAlumno(Alumno alumno);
    Alumno obtenerAlumnoPorId(int id);
    List<Alumno> obtenerTodosLosAlumnos();
    void actualizarAlumno(Alumno alumno);
    void eliminarAlumno(int id);
}