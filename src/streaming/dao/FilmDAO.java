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
import streaming.entity.Film;

/**
 *
 * @author admin
 */
@Repository
public class FilmDAO {

    public void ajouter(Film f) {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
    }

    public Film rechercherParId(Long id) {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.find(Film.class, id);

    }

    public List<Film> listerTous() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.createQuery("SELECT f FROM Film f").getResultList();

    }

    public void modifier(Film f) {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.merge(f);
        em.getTransaction().commit();
    }

    public void supprimer(Long id) {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Film f WHERE f.id = " + id).executeUpdate();
        em.getTransaction().commit();
    }

    public List<Film> listerParGenre(Long idGenre) {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return (List<Film>) em.createQuery("SELECT f FROM Film f JOIN f.genre g WHERE g.id = " + idGenre).getResultList();
    }

    public List<Film> listerParPays(Long idPays) {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.createQuery("SELECT f FROM Film f JOIN f.pays p WHERE p.id = " + idPays).getResultList();
    }

    public List<Film> listerParTitreOuRealisateur(String string) {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.createQuery("SELECT DISTINCT f FROM Film f JOIN f.listeRealisateurs r WHERE UPPER(f.titre) LIKE UPPER ('%" + string + "%') OR UPPER(r.prenom) LIKE UPPER ('%" + string + "%') OR UPPER(r.nom) LIKE UPPER ('%" + string + "%')").getResultList();
    }
}
