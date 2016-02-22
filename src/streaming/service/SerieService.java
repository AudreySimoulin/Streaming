/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.SerieDAO;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieService {

    SerieDAO seriedao = new SerieDAO();

    public void ajouter(Serie s) {
        seriedao.ajouter(s);
    }

    public Serie rechercherParId(Long id) {
        return seriedao.rechercherParId(id);
    }

    public List<Serie> listerTous() {
        return seriedao.listerTous();
    }

}
