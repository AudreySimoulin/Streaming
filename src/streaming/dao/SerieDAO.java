/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieDAO {

    public void ajouter(Serie s) {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();
    }

    public Serie rechercherParId(Long id) {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.find(Serie.class, id);

    }

    public List<Serie> listerTous() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.createQuery("SELECT s FROM Serie s").getResultList();

    } 
    
    public List<Serie> listerParTitre(String titreSerie){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.createQuery("SELECT s FROM Serie s WHERE s.titre LIKE '%"+titreSerie+"%'").getResultList();
    }


}
