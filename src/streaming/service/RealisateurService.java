/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.RealisateurDAO;
import streaming.entity.Realisateur;

/**
 *
 * @author admin
 */
@Service
public class RealisateurService {

    @Autowired
    RealisateurDAO rdao ;

    public void ajouter(Realisateur r) {
        rdao.ajouter(r);
    }

    public Realisateur rechercherParId(Long id) {
        return rdao.rechercherParId(id);
    }

    public List<Realisateur> listerTous() {
        return rdao.listerTous();
    }
    
    public void modifier(Realisateur r) {
        rdao.modifier(r);
    }
    
    public void supprimer(Long id) {
        rdao.supprimer(id);
    }

}
