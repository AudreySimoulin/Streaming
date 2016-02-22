/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.EpisodeDAO;
import streaming.entity.Episode;

/**
 *
 * @author admin
 */
public class EpisodeService {
    EpisodeDAO edao = new EpisodeDAO();
    
    public void ajouter(Episode e) {
        edao.ajouter(e);
    }
    
    public Episode rechercherParId(Long id) {
       return edao.rechercherParId(id);
    }
    
    public List<Episode> listerTous() {
        return edao.listerTous();
    }
    
}
