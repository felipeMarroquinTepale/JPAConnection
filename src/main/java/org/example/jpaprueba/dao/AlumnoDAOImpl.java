package org.example.jpaprueba.dao;

import org.example.jpaprueba.model.Alumno;
import org.example.jpaprueba.util.JPAUtil;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;


public class AlumnoDAOImpl implements AlumnoDAO {

    @Override
    public void crearAlumno(Alumno alumno) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            em.persist(alumno);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    @Override
    public Alumno obtenerAlumnoPorId(int id) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        Alumno alumno = em.find(Alumno.class, id);
        em.close();
        return alumno;
    }

    @Override
    public List<Alumno> obtenerTodosLosAlumnos() {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        TypedQuery<Alumno> query = em.createQuery("SELECT a FROM Alumno a", Alumno.class);
        List<Alumno> alumnos = query.getResultList();
        em.close();
        return alumnos;
    }

    @Override
    public void actualizarAlumno(Alumno alumno) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            em.merge(alumno);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    @Override
    public void eliminarAlumno(int id) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            Alumno alumno = em.find(Alumno.class, id);
            if (alumno != null) {
                em.remove(alumno);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}