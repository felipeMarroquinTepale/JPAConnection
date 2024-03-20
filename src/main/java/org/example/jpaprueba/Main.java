package org.example.jpaprueba;

import org.example.jpaprueba.controller.AlumnoController;
import org.example.jpaprueba.model.Alumno;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) throws ParseException {
        AlumnoController alumnoController = new AlumnoController();
/*
        // Crear dos nuevo alumno
        Alumno nuevoAlumno = new Alumno();
        nuevoAlumno.setNombre("Jhon");
        nuevoAlumno.setApellido("Montebello");
        Date fechaNacimiento = new SimpleDateFormat("yyyy-MM-dd").parse("1990-01-01");
        nuevoAlumno.setFechaNac(fechaNacimiento);

        Alumno nuevoAlumno2 = new Alumno();
        Date fechaNacimiento2 = new SimpleDateFormat("yyyy-MM-dd").parse("2001-04-05");
        nuevoAlumno2.setNombre("Nano");
        nuevoAlumno2.setApellido("Smith");
        nuevoAlumno2.setFechaNac(fechaNacimiento2);

        alumnoController.crearAlumno(nuevoAlumno);
        alumnoController.crearAlumno(nuevoAlumno2);

*/

        // Obtener un alumno por su ID
        System.out.println("Obtener alumno por ID");
        Alumno alumnoObtenido = alumnoController.obtenerAlumnoPorId(10);
        System.out.println("Alumno obtenido: " + alumnoObtenido.getNombre() + " "+ alumnoObtenido.getApellido());


        // Obtener todos los alumnos
        System.out.println("Todos los alumnos:");
        List<Alumno> alumnos = alumnoController.obtenerTodosLosAlumnos();
        for (Alumno alumno : alumnos) {
            System.out.println("ID: " + alumno.getId());
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Apellido: " + alumno.getApellido());
            System.out.println("Fecha de Nacimiento: " + alumno.getFechaNac());
            System.out.println("--------------------------");
        }


        // Actualizar un alumno
        Alumno updateAlumno = new Alumno();
        updateAlumno.setId(10);
        updateAlumno.setNombre("Jhon july");
        updateAlumno.setApellido("Montebello");
        Date fechaNacimiento = new SimpleDateFormat("yyyy-MM-dd").parse("1990-01-01");
        updateAlumno.setFechaNac(fechaNacimiento);
        alumnoController.actualizarAlumno(updateAlumno);


        // Eliminar un alumno por su ID
        alumnoController.eliminarAlumno(10);







    }
}
