/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.LienDAO;
import streaming.entity.Lien;

/**
 *
 * @author admin
 */
@Service
public class LienService {

    @Autowired
    LienDAO ldao;

    public void ajouter(Lien l) {
        ldao.ajouter(l);
    }

    public Lien rechercherParId(Long id) {
        return ldao.rechercherParId(id);
    }

    public List<Lien> listerTous() {
        return ldao.listerTous();
    }

}
