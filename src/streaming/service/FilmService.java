/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.dao.FilmDAO;
import streaming.entity.Film;
import streaming.exception.SynopsisVideException;

/**
 *
 * @author admin
 */
public class FilmService {

    FilmDAO fdao = new FilmDAO();

    public void ajouter(Film f) throws SynopsisVideException {
        if ( f.getSynopsis() == null ||f.getSynopsis().isEmpty()) {
            throw new SynopsisVideException();
        }

        f.setSynopsis(f.getSynopsis().replaceAll("zut", "**Flûte**"));
        f.setTitre(f.getTitre().replaceAll("zut", "**Flûte**"));

        //fdao.ajouter(f);
    }

    public Film rechercherParId(Long id) {
        return fdao.rechercherParId(id);
    }

    public List<Film> listerTous() {
        return fdao.listerTous();
    }
    
//    public List<Film> filmsParGenre(){
//        EntityManager em = Persistence.createEntityManagerFactory("Streamin")
//    }

}
