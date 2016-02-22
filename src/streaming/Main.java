/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import java.util.List; //JAVA
import javax.persistence.EntityManager; //JAVA JPA
import javax.persistence.Persistence; //JAVA JPA
import javax.persistence.Query; //JAVA JPA (javax.persistence)
import streaming.entity.Genre;
import streaming.entity.Pays;
import streaming.entity.Realisateur;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
      
       em.getTransaction().begin(); //Pour commencer la transaction
             
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
//
////       Pays p = em.find(Pays.class, 1L); //Pour récupérer l'objet voulu puis p.setNom pour le changer
////       
////        em.remove(p);
//        
//       em.getTransaction().commit(); //Pour valider la transaction "insérer un genre"
//      
       
//        Query query = em.createQuery("SELECT p FROM Pays p");
//        List<Pays> l = query.getResultList();
        
//        //Méthode boucle for
//        for(Pays p : l){
//            System.out.println(p.getNom());
//        }

        //Méthode boucle while
//        int j = 0;
//        while(j<l.size()){ //Contrairement à VBA avec JAVA ça commence à 0
//            Pays p = l.get(j); //Si on ne définit pas la liste avant (list<Pays>) il faut convertir en mettant des () avant ((Pays) l.get(j))
//            j++;
//        }

//        //Méthode boucle do ... while
//        int i = 0;
//        do{
//            System.out.println(l.get(i).getNom());
//            i++;
//        } while (i <l.size());

//        //Méthode autre pour la boucle for
//        for(int i = 0; i<l.size(); i++){
//            System.out.println(l.get(i).getNom());
//        }
        
      Query query1 = em.createQuery("SELECT r FROM Realisateur r WHERE r.prenom = 'Quentin'");
      List<Realisateur> lr = query1.getResultList();  
      
      for(Realisateur r : lr){
      System.out.println(r.getNom() + " " + r.getPrenom());
      }
     
      Query query2 = em.createQuery("SELECT g FROM Genre g WHERE g.nom <> 'Sciences Fiction'");
      List<Genre> lg = query2.getResultList(); 
      
      for(Genre g : lg){
      System.out.println(g.getNom());
      }
 
    }
    
}
