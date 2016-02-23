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
import streaming.entity.Film;
import streaming.service.FilmService;

/**
 *
 * @author admin
 */
public class TableModelListeFilm extends DefaultTableModel {

    private List<Film> film = null;
    private int nbFilm = 0;
    private FilmService fserv = new FilmService();

    public List<Film> getFilm() {
        return film;
    }

    public TableModelListeFilm() {
        setColumnIdentifiers(new String[]{"ID", "Titre", "Année de production", "Pays", "Réalisateur", "Synopsis"});
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
            return f.getPays();
        }

        if (column == 4) {
            return f.getListeRealisateurs();
        }

        if (column == 5) {
            return f.getSynopsis();
        }

        if (column == 6) {
            return f.getGenre();
        }

        return "***ERROR***";
    }

}
