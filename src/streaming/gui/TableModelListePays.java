/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.gui;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import streaming.entity.Pays;
import streaming.service.PaysService;

/**
 *
 * @author admin
 */
public class TableModelListePays extends DefaultTableModel {

    private List<Pays> pays = null;
    private int nbPays = 0;
    private PaysService pserv = new PaysService();

    public List<Pays> getPays() {
        return pays;
    }

    public TableModelListePays() {
        setColumnIdentifiers(new String[]{"ID", "Nom"});
        pays = pserv.listerTous();
        nbPays = pays.size();
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