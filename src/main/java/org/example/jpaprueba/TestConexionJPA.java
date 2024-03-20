package org.example.jpaprueba;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestConexionJPA {

    public static void main(String[] args) {
        EntityManagerFactory emf = null;
        EntityManager em = null;

        try {
            // Crea el EntityManagerFactory utilizando el nombre de la unidad de persistencia en persistence.xml
            emf = Persistence.createEntityManagerFactory("MyPersistenceUnit");
            // Crea un EntityManager
            em = emf.createEntityManager();
            // Verifica la conexión imprimiendo un mensaje
            System.out.println("Conexión establecida correctamente!");

        } catch (Exception e) {
            System.err.println("Error al establecer la conexión: " + e.getMessage());
        } finally {
            // Cierra el EntityManager y el EntityManagerFactory al finalizar
            if (em != null) {
                em.close();
            }
            if (emf != null) {
                emf.close();
            }
        }
    }
}
