/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.entity.Episode;
import streaming.entity.Film;
import streaming.entity.Genre;
import streaming.entity.Lien;
import streaming.entity.Pays;
import streaming.entity.Realisateur;
import streaming.exception.SynopsisVideException;
import streaming.entity.Saison;
import streaming.entity.Serie;
import streaming.service.DBService;
import streaming.service.EpisodeService;
import streaming.service.FilmService;
import streaming.service.GenreService;
import streaming.service.LienService;
import streaming.service.PaysService;
import streaming.service.RealisateurService;
import streaming.service.SaisonService;
import streaming.service.SerieService;

/**
 *
 * @author admin
 */

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(locations = "file:/C:\\Users\\admin\\Documents\\NetBeansProjects\\Streaming\\application-context.xml")
    
public class StreamingTest {

   
    @Autowired
    private PaysService pserv ;
    @Autowired
    private RealisateurService rserv ;
    @Autowired
    private SaisonService saisonserv;
    @Autowired
    private SerieService serieserv;
    @Autowired
    private DBService dbs;
    
    @Autowired
    private EpisodeService eserv;
    
    @Autowired
    private FilmService fserv;
    
    @Autowired
    private GenreService gserv;
    
    @Autowired
    private LienService lserv;
    
  
//    @Before
    public void initialisationBaseOK() throws SynopsisVideException {
        dbs.supprimerTous();

        //Ajout des genres
        {
            Genre g1 = new Genre();
            g1.setId(1L);
            g1.setNom("Action");
            gserv.ajouter(g1);
        }
        {
            Genre g1 = new Genre();
            g1.setId(2L);
            g1.setNom("Fantastique");
            gserv.ajouter(g1);
        }
        {
            Genre g1 = new Genre();
            g1.setId(3L);
            g1.setNom("Policier");
            gserv.ajouter(g1);
        }
        {
            Genre g1 = new Genre();
            g1.setId(4L);
            g1.setNom("Romance");
            gserv.ajouter(g1);
        }
        {
            Genre g1 = new Genre();
            g1.setId(5L);
            g1.setNom("Animation");
            gserv.ajouter(g1);
        }
        {
            Genre g1 = new Genre();
            g1.setId(6L);
            g1.setNom("Comédie");
            gserv.ajouter(g1);
        }

        //Ajout des pays
        {
            Pays p1 = new Pays();
            p1.setId(1L);
            p1.setNom("France");
            pserv.ajouter(p1);
        }
        {
            Pays p1 = new Pays();
            p1.setId(2L);
            p1.setNom("USA");
            pserv.ajouter(p1);
        }
        {
            Pays p1 = new Pays();
            p1.setId(3L);
            p1.setNom("UK");
            pserv.ajouter(p1);
        }
        {
            Pays p1 = new Pays();
            p1.setId(4L);
            p1.setNom("Espagne");
            pserv.ajouter(p1);
        }
        {
            Pays p1 = new Pays();
            p1.setId(5L);
            p1.setNom("Nouvelle-Zélande");
            pserv.ajouter(p1);
        }

        //Ajout des réalisateurs
        {
            Realisateur r1 = new Realisateur();
            r1.setId(1L);
            r1.setNom("COEN");
            r1.setPrenom("Joel");
            rserv.ajouter(r1);
        }
        {
            Realisateur r1 = new Realisateur();
            r1.setId(2L);
            r1.setNom("COEN");
            r1.setPrenom("Ethan");
            rserv.ajouter(r1);
        }
        {
            Realisateur r1 = new Realisateur();
            r1.setId(3L);
            r1.setNom("JACKSON");
            r1.setPrenom("Peter");
            rserv.ajouter(r1);
        }
        {
            Realisateur r1 = new Realisateur();
            r1.setId(4L);
            r1.setNom("TARANTINO");
            r1.setPrenom("Quentin");
            rserv.ajouter(r1);
        }
        {
            Realisateur r1 = new Realisateur();
            r1.setId(5L);
            r1.setPrenom("Maïwenn");
            rserv.ajouter(r1);
        }

//        //Ajout des films
        {
            Film f1 = new Film();
            Genre g = gserv.rechercherParId(1L);
            Pays p = pserv.rechercherParId(2L);
            Realisateur r = rserv.rechercherParId(4L);
            f1.setId(1L);
            f1.setAnnee(2012L);
            f1.setTitre("Django Unchained");
            f1.setGenre(g);
            f1.setPays(p);
            f1.setSynopsis("blabla");
            f1.getListeRealisateurs().add(r);
            p.getListeFilmsParPays().add(f1);
            g.getListeFilmsParGenre().add(f1);
            r.getListeFilmsParRealisateur().add(f1);
            fserv.ajouter(f1);

        }
        {
            Film f1 = new Film();
            Genre g = gserv.rechercherParId(1L);
            Pays p = pserv.rechercherParId(2L);
            Realisateur r = rserv.rechercherParId(4L);
            f1.setId(2L);
            f1.setAnnee(2003L);
            f1.setTitre("Kill Bill");
            f1.setGenre(g);
            f1.setPays(p);
            f1.setSynopsis("blabla");
            f1.getListeRealisateurs().add(r);
            p.getListeFilmsParPays().add(f1);
            g.getListeFilmsParGenre().add(f1);
            r.getListeFilmsParRealisateur().add(f1);
            fserv.ajouter(f1);

        }
        {
            Film f1 = new Film();
            Genre g = gserv.rechercherParId(1L);
            Pays p = pserv.rechercherParId(2L);
            Realisateur r = rserv.rechercherParId(4L);
            f1.setId(3L);
            f1.setAnnee(2004L);
            f1.setTitre("Kill Bill 2");
            f1.setGenre(g);
            f1.setPays(p);
            f1.setSynopsis("blabla");
            f1.getListeRealisateurs().add(r);
            p.getListeFilmsParPays().add(f1);
            g.getListeFilmsParGenre().add(f1);
            r.getListeFilmsParRealisateur().add(f1);
            fserv.ajouter(f1);

        }
        {
            Film f1 = new Film();
            Genre g = gserv.rechercherParId(1L);
            Pays p = pserv.rechercherParId(2L);
            Realisateur r = rserv.rechercherParId(4L);
            f1.setId(4L);
            f1.setAnnee(1997L);
            f1.setTitre("Jackie Brown");
            f1.setGenre(g);
            f1.setPays(p);
            f1.setSynopsis("blabla");
            f1.getListeRealisateurs().add(r);
            p.getListeFilmsParPays().add(f1);
            g.getListeFilmsParGenre().add(f1);
            r.getListeFilmsParRealisateur().add(f1);
            fserv.ajouter(f1);

        }
        {
            Film f1 = new Film();
            Genre g = gserv.rechercherParId(2L);
            Pays p = pserv.rechercherParId(2L);
            Realisateur r = rserv.rechercherParId(4L);
            f1.setId(5L);
            f1.setAnnee(2005L);
            f1.setTitre("Sin City");
            f1.setGenre(g);
            f1.setPays(p);
            f1.setSynopsis("blabla");
            f1.getListeRealisateurs().add(r);
            p.getListeFilmsParPays().add(f1);
            g.getListeFilmsParGenre().add(f1);
            r.getListeFilmsParRealisateur().add(f1);
            fserv.ajouter(f1);

        }
        {
            Film f1 = new Film();
            Genre g = gserv.rechercherParId(2L);
            Pays p = pserv.rechercherParId(5L);
            Realisateur r = rserv.rechercherParId(3L);
            f1.setId(6L);
            f1.setAnnee(1987L);
            f1.setTitre("Bad Taste");
            f1.setGenre(g);
            f1.setPays(p);
            f1.setSynopsis("blabla");
            f1.getListeRealisateurs().add(r);
            p.getListeFilmsParPays().add(f1);
            g.getListeFilmsParGenre().add(f1);
            r.getListeFilmsParRealisateur().add(f1);
            fserv.ajouter(f1);

        }
        {
            Film f1 = new Film();
            Genre g = gserv.rechercherParId(2L);
            Pays p = pserv.rechercherParId(5L);
            Realisateur r = rserv.rechercherParId(3L);
            f1.setId(7L);
            f1.setAnnee(1992L);
            f1.setTitre("Braindead");
            f1.setGenre(g);
            f1.setPays(p);
            f1.setSynopsis("blabla");
            f1.getListeRealisateurs().add(r);
            p.getListeFilmsParPays().add(f1);
            g.getListeFilmsParGenre().add(f1);
            r.getListeFilmsParRealisateur().add(f1);
            fserv.ajouter(f1);

        }
        {
            Film f1 = new Film();
            Genre g = gserv.rechercherParId(2L);
            Pays p = pserv.rechercherParId(5L);
            Realisateur r = rserv.rechercherParId(3L);
            f1.setId(8L);
            f1.setAnnee(2015L);
            f1.setTitre("Le Hobbit");
            f1.setGenre(g);
            f1.setPays(p);
            f1.setSynopsis("blabla");
            f1.getListeRealisateurs().add(r);
            p.getListeFilmsParPays().add(f1);
            g.getListeFilmsParGenre().add(f1);
            r.getListeFilmsParRealisateur().add(f1);
            fserv.ajouter(f1);

        }
        {
            Film f1 = new Film();
            Genre g = gserv.rechercherParId(3L);
            Pays p = pserv.rechercherParId(1L);
            Realisateur r = rserv.rechercherParId(5L);
            f1.setId(9L);
            f1.setAnnee(2011L);
            f1.setTitre("Polisse");
            f1.setGenre(g);
            f1.setPays(p);
            f1.setSynopsis("blabla");
            f1.getListeRealisateurs().add(r);
            p.getListeFilmsParPays().add(f1);
            g.getListeFilmsParGenre().add(f1);
            r.getListeFilmsParRealisateur().add(f1);
            fserv.ajouter(f1);

        }
        {
            Film f1 = new Film();
            Genre g = gserv.rechercherParId(6L);
            Pays p = pserv.rechercherParId(2L);
            Realisateur r1 = rserv.rechercherParId(1L);
            Realisateur r2 = rserv.rechercherParId(2L);
            f1.setId(10L);
            f1.setAnnee(1998L);
            f1.setTitre("Big Lebowski");
            f1.setGenre(g);
            f1.setPays(p);
            f1.setSynopsis("blabla");
            f1.getListeRealisateurs().add(r1);
            f1.getListeRealisateurs().add(r2);
            p.getListeFilmsParPays().add(f1);
            g.getListeFilmsParGenre().add(f1);
            r1.getListeFilmsParRealisateur().add(f1);
            r2.getListeFilmsParRealisateur().add(f1);
            fserv.ajouter(f1);

        }
        {
            Film f1 = new Film();
            Genre g = gserv.rechercherParId(6L);
            Pays p = pserv.rechercherParId(2L);
            Realisateur r1 = rserv.rechercherParId(1L);
            Realisateur r2 = rserv.rechercherParId(2L);
            f1.setId(11L);
            f1.setAnnee(2016L);
            f1.setTitre("Ave Cesar");
            f1.setGenre(g);
            f1.setPays(p);
            f1.setSynopsis("blabla");
            f1.getListeRealisateurs().add(rserv.rechercherParId(1L));
            f1.getListeRealisateurs().add(rserv.rechercherParId(2L));
            p.getListeFilmsParPays().add(f1);
            g.getListeFilmsParGenre().add(f1);
            r1.getListeFilmsParRealisateur().add(f1);
            r2.getListeFilmsParRealisateur().add(f1);
            fserv.ajouter(f1);
        }
        // Ajout de la serie Dexter
        Serie s = new Serie();
        s.setId(1L);
        s.setSynopsis("blabla");
        s.setPays(pserv.rechercherParId(2L));
        s.setTitre("Dexter");
        s.setSynopsis("Blabla");
        serieserv.ajouter(s);
        pserv.rechercherParId(2L).getListeSeries().add(s);

        // Ajout de 8 Saisons
        for (long numS = 1; numS <= 8; numS++) {

            Saison sa = new Saison();
            sa.setId(numS);
            sa.setNumeroSaison(numS);
            sa.setSerie(s);
            saisonserv.ajouter(sa);
            s.getListeSaisons().add(sa);

            // Ajout des Episodes
            for (long numE = 1; numE <= numS; numE++) {
                Episode e = new Episode();
//                e.setId(numE);
                e.setSaison(sa);
                sa.getListeEpisodes().add(e);
                eserv.ajouter(e);
                sa.getListeEpisodes().add(e);

                //Ajout des Liens
                for (long numL = 1; numL <= numE; numL++) {
                    Lien l = new Lien();
//                    l.setId(numL);
                    l.setEpisode(e);
                    e.getListeLiens().add(l);
                    lserv.ajouter(l);
                    e.getListeLiens().add(l);
                }
            }

        }

    }

    @Test
    public void testSpringOK() {

        System.out.println(saisonserv.rechercherParId(1L).getSerie().getTitre());

    }

//    @Test
    
//@Test
    public void craetionSerieOK() {
        Persistence.createEntityManagerFactory("StreamingPU");
    }

    //@Test
    public void listerSeriesParTitreTestOK() {
        List<Serie> l = serieserv.listerParTitre("Dext");
        for (Serie s : l) {
            System.out.println(s.getTitre());
        }
    }

//@Test
    public void listerSeriesParPaysTestOK() {
        List<Serie> l = serieserv.listerParPays(2L);
        for (Serie s : l) {
            System.out.println(s.getTitre());
        }

    }

//@Test
    public void listerFilmParGenreOK() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        for (Film f : em.find(Genre.class, 1L).getListeFilmsParGenre()) {
            System.out.println(f.getTitre());
        }
    }

    //@Test
    public void trierParOrdreChronologique() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Collection<Film> film = em.createQuery("SELECT f FROM Film f ORDER BY f.annee").getResultList();
        for (Film f : film) {
            System.out.println(f.getTitre());
        }

    }

    //@Test
    public void verifNbGenreEgal6() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
//        Collection<Genre> genre = em.createQuery("SELECT g FROM Genre g").getResultList();
//        Assert.assertEquals(6, genre.size());

        //2eme méthode : 
        Long nbGenre = (Long) em.createQuery("SELECT COUNT(g) FROM Genre g").getSingleResult();
        Assert.assertTrue(nbGenre == 6L);

    }

    //@Test
    public void listeFilmsFrancais() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        List<Film> film = em.createQuery("SELECT f FROM Film f JOIN f.pays p WHERE p.nom = 'France'").getResultList();
        Assert.assertTrue(film.size() == 1L);
    }

    //@Test
    public void filmFantastiqueOrdreAlpha() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        List<Film> films = em.createQuery("SELECT f FROM Film  f JOIN f.genre g WHERE g.nom = 'Fantastique' ORDER BY f.titre ASC").getResultList();
        for (Film f : films) {
            System.out.println(f.getTitre());
        }

    }

    //@Test
    public void filmFantastiqueOrdreAlphaSansJoin() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        List<Film> filmsFantastiques = em.createQuery("SELECT f FROM Film f WHERE f.genre.nom = 'Fantastique' ORDER BY f.titre ASC").getResultList();
        for (Film f : filmsFantastiques) {
            System.out.println(f.getTitre());
        }

    }

    // @Test
    public void filmsActionFrereCoenParAnneeProd() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        List<Film> filmsAction = em.createQuery("SELECT f FROM Film f JOIN f.listeRealisateurs r JOIN f.genre g WHERE (g.nom = 'Comédie') and (r.prenom = 'Ethan') ORDER BY f.annee ASC").getResultList();
        for (Film f : filmsAction) {
            System.out.println(f.getTitre());
        }
    }

    //@Test
    public void filmsAutresQueAction() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        List<Film> filmsPasAction = em.createQuery("SELECT f FROM Film f JOIN f.genre g WHERE g.nom <> 'Action'").getResultList();
        for (Film f : filmsPasAction) {
            System.out.println(f.getTitre());
        }
    }

    //@Test
    public void filmsNeoZelandaisSaufFantastique() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        List<Film> filmsPasAction = em.createQuery("SELECT f FROM Film f JOIN f.genre g JOIN f.pays p WHERE g.nom <> 'Fantastique' AND p.nom = 'Nouvelle-Zélande'").getResultList();
        System.out.println(filmsPasAction.size());

    }

    //@Test
    public void filmsNeoZelandaisFantastiquesPeterJackson() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Long filmsFantastiquePeter = (Long) em.createQuery("SELECT COUNT (f) FROM Film f JOIN f.genre g JOIN f.pays p JOIN f.listeRealisateurs r WHERE g.nom = 'Fantastique' AND p.nom = 'Nouvelle-Zélande' AND r.prenom = 'Peter'").getSingleResult();
        System.out.println(filmsFantastiquePeter);

    }

    //@Test
    public void filmsFantastique() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Long filmsFantastique = (Long) em.createQuery("SELECT COUNT (f) FROM Film f JOIN f.genre g WHERE g.nom = 'Fantastique'").getSingleResult();
        System.out.println(filmsFantastique);
    }

    //@Test
    public void filmsParFreresCoen() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        List<Film> filmsCoen = em.createQuery("SELECT f FROM Film f JOIN f.listeRealisateurs r WHERE r.prenom = 'Ethan' INTERSECT SELECT f FROM Film f JOIN f.listeRealisateurs r WHERE r.prenom = 'Joel'").getResultList();
        for (Film f : filmsCoen) {
            System.out.println(f.getTitre());
        }
    }

    // @Test
    public void filmsParFreresCoen2() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        List<Film> filmsCoen = em.createQuery("SELECT f FROM Film f WHERE f.id IN (SELECT f.id FROM Film f JOIN f.listeRealisateurs r WHERE r.prenom = 'Ethan') AND f.id IN (SELECT f.id FROM Film f JOIN f.listeRealisateurs r WHERE r.prenom = 'Joel') ").getResultList();
        for (Film f : filmsCoen) {
            System.out.println(f.getTitre());
        }
    }

    //@Test
    public void filmPlusAncienJackson() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        List<String> filmAncien = em.createQuery("SELECT f.titre FROM Film f WHERE f.annee IN (SELECT MIN(f.annee) FROM Film f JOIN f.listeRealisateurs r WHERE r.nom = 'JACKSON') ").getResultList();
        for (String titre : filmAncien) {
            System.out.println(titre);
        }
    }

    // @Test
    public void moyenneAnneeProd() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Double moyenneAnnee = (Double) em.createQuery("SELECT AVG(f.annee) FROM Film f").getSingleResult();
        System.out.println(moyenneAnnee);
    }

    //@Test
    public void filmsParRealisateur() {

        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Collection<Object[]> nbFilmParRealisateur = em.createQuery("SELECT COUNT (f) AS total, r FROM Realisateur r JOIN r.listeFilmsParRealisateur f GROUP BY r ORDER BY total").getResultList();

        for (Object[] r : nbFilmParRealisateur) {

            long total = (long) r[0];
            Realisateur real = (Realisateur) r[1];

            System.out.println(real.getNom() + " " + real.getPrenom() + " " + total);
        }
    }

    //@Test
    public void listerFilmsParGenre() {
        List<Film> filmsParGenre = fserv.listerParGenre(1L);
        //System.out.println(filmsParGenre.size());
        for (Film f : filmsParGenre) {
            System.out.println(f.getTitre());
        }
    }

    //@Test
    public void listerFilmsParPays() {
        List<Film> filmsParPays = fserv.listerParPays(2L);
        //System.out.println(filmsParGenre.size());
        for (Film f : filmsParPays) {
            System.out.println(f.getTitre());
        }
    }

    //@Test
    public void listerFilmsParTitreOuReal() {
        List<Film> filmsParTitreOuReal = fserv.listerParTitreOuRealisateur("tar");
        //System.out.println(filmsParGenre.size());
        for (Film f : filmsParTitreOuReal) {
            System.out.println(f.getTitre());
        }
    }
    
    @Test
    public void testSpringGenre(){
        System.out.println(gserv.rechercherParId(1L).getNom());
    }
}
