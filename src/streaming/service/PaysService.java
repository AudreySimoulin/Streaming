/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.PaysDAO;
import streaming.entity.Pays;

/**
 *
 * @author admin
 */
@Service
public class PaysService {

    @Autowired
    PaysDAO pdao ;

    public void ajouter(Pays p) {
        pdao.ajouter(p);
    }

    public Pays rechercherParId(Long id) {
        return pdao.rechercherParId(id);
    }

    public List<Pays> listerTous() {
        return pdao.listerTous();
    }
    
     public void modifier(Pays p) {
         pdao.modifier(p);
     }
     
     public void supprimer(Long id) {
         pdao.supprimer(id);
     }

}
