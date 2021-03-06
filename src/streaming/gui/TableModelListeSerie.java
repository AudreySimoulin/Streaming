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
import org.springframework.stereotype.Component;
import streaming.entity.Serie;
import streaming.service.SerieService;

/**
 *
 * @author admin
 */
@Component
public class TableModelListeSerie extends DefaultTableModel {

    private List<Serie> serie = null;
    private int nbSerie = 0;
    
    @Autowired
    private SerieService serieserv ;

    public List<Serie> getSerie() {
        return serie;
    }
    
    public void rafraichir(){
        serie = serieserv.listerTous();
        nbSerie = serie.size();
    }

    public TableModelListeSerie() {

        setColumnIdentifiers(new String[]{"ID", "Titre", "Année de production", "Pays", "Synopsis"});
        

    }

    @Override
    public int getRowCount() {
        return nbSerie;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Serie s = serie.get(row);

        if (column == 0) {
            return s.getId();
        }
        if (column == 1) {
            return s.getTitre();
        }
        if(column == 2){
            return s.getAnnee();
        }
        if(column == 3){
            return s.getPays().getNom();
        }
        if(column == 4){
            return s.getSynopsis();
        }
        return "***ERROR***";
    }

}
