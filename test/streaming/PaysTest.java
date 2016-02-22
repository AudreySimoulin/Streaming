/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import streaming.Exercice.Client;
import streaming.entity.Genre;
import streaming.entity.Pays;
import streaming.entity.Realisateur;

/**
 *
 * @author admin
 */
public class PaysTest {
    
   // @BeforeClass
    public static void avantTout(){
     EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
      
       em.getTransaction().begin(); //Pour commencer la transaction
       
       //On vide toutes les tables sinon ça ne fonctionne pas car impossible de recréer qqch de déjà créé
       em.createQuery("DELETE FROM Genre g").executeUpdate();
       em.createQuery("DELETE FROM Pays p").executeUpdate();
       em.createQuery("DELETE FROM Realisateur r").executeUpdate();
       
       
       //Ajout d'un genre
       Genre g1 = new Genre ();
       g1.setNom("Animation");
       g1.setId(1L);
       
       Genre g2 = new Genre ();
       g2.setNom("Action");
       g2.setId(2L);
       
       Genre g3 = new Genre ();
       g3.setNom("Sciences Fiction");
       g3.setId(3L);
       
//       //Ajout d'un pays
       Pays p1 = new Pays ();
       p1.setNom("France");
       p1.setId(1L);
       
       Pays p2 = new Pays ();
       p2.setNom("USA");
       p2.setId(2L);
       
       Pays p3 = new Pays ();
       p3.setNom("Espagne");
       p3.setId(3L);
       
//       //Ajout d'un réalisateur
       Realisateur r1 = new Realisateur();
       r1.setNom("Tarantino");
       r1.setPrenom("Quentin");
       r1.setId(1L);
       
       Realisateur r2 = new Realisateur();
       r2.setNom("Lucas");
       r2.setPrenom("Georges");
       r2.setId(2L);
       
       Realisateur r3 = new Realisateur();
       r3.setNom("Almodovar");
       r3.setPrenom("Pedro");
       r3.setId(3L);
       
       em.persist(g1); //Génère un insert
       em.persist(g2);
       em.persist(g3);
       em.persist(p1); 
       em.persist(p2);
       em.persist(p3);
       em.persist(r1); 
       em.persist(r2);
       em.persist(r3);
       
       em.getTransaction().commit();

    }
    
                    
  //  @Before
    public void avantTest(){
               EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
      
       em.getTransaction().begin(); //Pour commencer la transaction
       
       //On vide toutes les tables sinon ça ne fonctionne pas car impossible de recréer qqch de déjà créé
       em.createQuery("DELETE FROM Genre g").executeUpdate();
       em.createQuery("DELETE FROM Pays p").executeUpdate();
       em.createQuery("DELETE FROM Realisateur r").executeUpdate();
       
       
       //Ajout d'un genre
       Genre g1 = new Genre ();
       g1.setNom("Animation");
       g1.setId(1L);
       
       Genre g2 = new Genre ();
       g2.setNom("Action");
       g2.setId(2L);
       
       Genre g3 = new Genre ();
       g3.setNom("Sciences Fiction");
       g3.setId(3L);
       
//       //Ajout d'un pays
       Pays p1 = new Pays ();
       p1.setNom("France");
       p1.setId(1L);
       
       Pays p2 = new Pays ();
       p2.setNom("USA");
       p2.setId(2L);
       
       Pays p3 = new Pays ();
       p3.setNom("Espagne");
       p3.setId(3L);
       
//       //Ajout d'un réalisateur
       Realisateur r1 = new Realisateur();
       r1.setNom("Tarantino");
       r1.setPrenom("Quentin");
       r1.setId(1L);
       
       Realisateur r2 = new Realisateur();
       r2.setNom("Lucas");
       r2.setPrenom("Georges");
       r2.setId(2L);
       
       Realisateur r3 = new Realisateur();
       r3.setNom("Almodovar");
       r3.setPrenom("Pedro");
       r3.setId(3L);
       
       em.persist(g1); //Génère un insert
       em.persist(g2);
       em.persist(g3);
       em.persist(p1); 
       em.persist(p2);
       em.persist(p3);
       em.persist(r1); 
       em.persist(r2);
       em.persist(r3);
       
       em.getTransaction().commit();

    }
    
    
   // @Test //Permet d'utiliser le test file et donc d'executer le test
    public void verifNbTotalPaysEgal3(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
       
        int n = em.createQuery("SELECT p FROM Pays p").getResultList().size();
        
       Assert.assertEquals(3,n);
//        Assert.assertTrue("blabla", n==4);
            
 }
   // @Test //Permet d'utiliser le test file et donc d'executer le test
    public void test2(){
       EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
       
       Realisateur r = (Realisateur) em.createQuery("SELECT r FROM Realisateur r WHERE r.nom = 'Tarantino'").getSingleResult();
       
       Assert.assertEquals(1, (long)r.getId());
       
   
    }
    
   // @Test
    public void testClient(){
        Client c = new Client("SIMOULIN", "Audrey", 5000L, "23");
        System.out.println(c);
        
        
    }
    
    @Test
    public void testTab(){
        int[] monTab = new int[10];
        for(int i=0;i<monTab.length; i++){
            monTab[i] = 2*i; 
           System.out.println(monTab[i]);      
        }
        
    }
}

