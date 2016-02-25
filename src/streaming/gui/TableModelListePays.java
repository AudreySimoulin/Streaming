/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.gui;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import streaming.entity.Pays;
import streaming.service.PaysService;

/**
 *
 * @author admin
 */
@Component
public class TableModelListePays extends DefaultTableModel {

    private List<Pays> pays = null;
    private int nbPays = 0;

    @Autowired
    private PaysService pserv;

    public List<Pays> getPays() {
        return pays;
    }

    public void rafraichir() {
        pays = pserv.listerTous();
        nbPays = pays.size();
    }

    public TableModelListePays() {
        setColumnIdentifiers(new String[]{"ID", "Nom"});
    }

    @Override
    public int getRowCount() {
        return nbPays;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Pays p = pays.get(row);

        if (column == 0) {
            return p.getId();
        }

        if (column == 1) {
            return p.getNom();
        }

        return "***ERROR***";
    }

}
