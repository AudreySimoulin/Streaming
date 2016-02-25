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
import streaming.entity.Realisateur;
import streaming.service.RealisateurService;

/**
 *
 * @author admin
 */
@Component
public class TableModelListeRealisateur extends DefaultTableModel{
    
    private List<Realisateur> realisateur = null;
    private int nbRealisateur = 0;
    @Autowired
    private RealisateurService rserv ;

    public List<Realisateur> getRealisateur() {
        return realisateur;
    }
    
    public TableModelListeRealisateur(){
        setColumnIdentifiers(new String[] {"ID", "Nom", "Prénom"});
        realisateur = rserv.listerTous();
        nbRealisateur = realisateur.size();
    }
    
    @Override
    public int getRowCount(){
        return nbRealisateur;
    }
    
    @Override
    public Object getValueAt(int row, int column){
        Realisateur r = realisateur.get(row);
        
        if(column == 0){
            return r.getId();
        }
        if(column == 1){
            return r.getNom();
        }
        if(column == 2){
            return r.getPrenom();
        }
        return "***ERROR***";
    }
    
}
