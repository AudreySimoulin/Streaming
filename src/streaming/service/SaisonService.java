/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.SaisonDAO;
import streaming.entity.Saison;

/**
 *
 * @author admin
 */
@Service
public class SaisonService {

    @Autowired
    SaisonDAO saisondao ;

    public void ajouter(Saison s) {
        saisondao.ajouter(s);
    }

    public Saison rechercherParId(Long id) {
        return saisondao.rechercherParId(id);
    }

    public List<Saison> listerTous() {
        return saisondao.listerTous();
    }
    
    public void modifier(Saison s) {
        saisondao.modifier(s);
    }
    
      public void supprimer(Long id) {
          saisondao.supprimer(id);
      }

}
