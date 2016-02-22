/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.SaisonDAO;
import streaming.entity.Saison;

/**
 *
 * @author admin
 */
public class SaisonService {

    SaisonDAO saisondao = new SaisonDAO();

    public void ajouter(Saison s) {
        saisondao.ajouter(s);
    }

    public Saison rechercherParId(Long id) {
        return saisondao.rechercherParId(id);
    }

    public List<Saison> listerTous() {
        return saisondao.listerTous();
    }

}
