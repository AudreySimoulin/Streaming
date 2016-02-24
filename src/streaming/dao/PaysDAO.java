/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.springframework.stereotype.Repository;
import streaming.entity.Pays;

/**
 *
 * @author admin
 */
@Repository
public class PaysDAO {

    public void ajouter(Pays p) {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }

    public Pays rechercherParId(Long id) {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.find(Pays.class, id);

    }

    public List<Pays> listerTous() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.createQuery("SELECT p FROM Pays p").getResultList();

    }

}
