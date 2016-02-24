/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.EpisodeDAO;
import streaming.entity.Episode;

/**
 *
 * @author admin
 */

@Service
public class EpisodeService {
    
    @Autowired
    EpisodeDAO edao;
    
    public void ajouter(Episode e) {
        edao.ajouter(e);
    }
    
    public Episode rechercherParId(Long id) {
       return edao.rechercherParId(id);
    }
    
    public List<Episode> listerTous() {
        return edao.listerTous();
    }
    
    public void modifier(Episode e){
        edao.modifier(e);
    }
    
    public void supprimer(Long id){
        edao.supprimer(id);
    }
}
