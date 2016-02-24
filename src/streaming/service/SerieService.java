/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.SerieDAO;
import streaming.entity.Serie;
import streaming.exception.SynopsisVideException;

/**
 *
 * @author admin
 */
@Service
public class SerieService {

    @Autowired
    SerieDAO seriedao ;

    public void ajouter(Serie s) throws SynopsisVideException {
        if (s.getSynopsis().equals(null) ||s.getSynopsis().isEmpty()) {
            throw new SynopsisVideException();
        }

        s.setSynopsis(s.getSynopsis().replaceAll("zut", "**Flûte**"));
        s.setTitre(s.getTitre().replaceAll("zut", "**Flûte**"));

        seriedao.ajouter(s);
    }

    public Serie rechercherParId(Long id) {
        return seriedao.rechercherParId(id);
    }

    public List<Serie> listerTous() {
        return seriedao.listerTous();
    }
    
    public List<Serie> listerParPays(Long idPays){
        return new PaysService().rechercherParId(idPays).getListeSeries();
    } 
    
    public List<Serie> listerParTitre(String titreSerie){
        return seriedao.listerParTitre(titreSerie);
    }
    

}
