/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.gui;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import streaming.entity.Film;
import streaming.entity.Realisateur;
import streaming.service.FilmService;

/**
 *
 * @author admin
 */
public class TableModelListeFilm extends DefaultTableModel {

    private List<Film> film = null;
    private int nbFilm = 0;
    
    @Autowired
    private FilmService fserv;

    public List<Film> getFilm() {
        return film;
    }

    public TableModelListeFilm() {
        setColumnIdentifiers(new String[]{"ID", "Titre", "Année de production", "Pays", "Réalisateur", "Synopsis", "Genre"});
        film = fserv.listerTous();
        nbFilm = film.size();
    }

    @Override
    public int getRowCount() {
        return nbFilm;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Film f = film.get(row);

        if (column == 0) {
            return f.getId();
        }

        if (column == 1) {
            return f.getTitre();
        }

        if (column == 2) {
            return f.getAnnee();
        }

        if (column == 3) {
            return f.getPays().getNom();
        }

        if (column == 4) {
            for (Realisateur r : f.getListeRealisateurs())
            return r.getPrenom()+" "+r.getNom();
        }

        if (column == 5) {
            return f.getSynopsis();
        }

        if (column == 6) {
            return f.getGenre().getNom();
        }

        return "***ERROR***";
    }

}
