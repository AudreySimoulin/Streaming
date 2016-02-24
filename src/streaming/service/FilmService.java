/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.FilmDAO;
import streaming.entity.Film;
import streaming.exception.SynopsisVideException;

/**
 *
 * @author admin
 */

@Service
public class FilmService {

    @Autowired
    FilmDAO fdao;

    public void ajouter(Film f) throws SynopsisVideException {
        if ( f.getSynopsis() == null ||f.getSynopsis().isEmpty()) {
            throw new SynopsisVideException();
        }

        f.setSynopsis(f.getSynopsis().replaceAll("zut", "**Flûte**"));
        f.setTitre(f.getTitre().replaceAll("zut", "**Flûte**"));

        fdao.ajouter(f);
    }

    public Film rechercherParId(Long id) {
        return fdao.rechercherParId(id);
    }

    public List<Film> listerTous() {
        return fdao.listerTous();
    }
    
    public void modifier(Film f) {
        fdao.modifier(f);
    }
    
    public void supprimer(Long id) {
        fdao.supprimer(id);
    }
    
    public List<Film> listerParGenre(Long idGenre){
        return fdao.listerParGenre(idGenre);
    }
    
    public List<Film> listerParPays(Long idPays){
        return fdao.listerParPays(idPays);
    }
    
    public List<Film> listerParTitreOuRealisateur(String string){
        return fdao.listerParTitreOuRealisateur(string);
    }

}
