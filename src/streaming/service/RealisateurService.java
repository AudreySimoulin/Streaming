/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.RealisateurDAO;
import streaming.entity.Realisateur;

/**
 *
 * @author admin
 */
public class RealisateurService {

    RealisateurDAO rdao = new RealisateurDAO();

    public void ajouter(Realisateur r) {
        rdao.ajouter(r);
    }

    public Realisateur rechercherParId(Long id) {
        return rdao.rechercherParId(id);
    }

    public List<Realisateur> listerTous() {
        return rdao.listerTous();
    }

}
