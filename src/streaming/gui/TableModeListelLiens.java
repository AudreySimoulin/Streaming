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
import streaming.entity.Film;
import streaming.entity.Lien;
import streaming.service.FilmService;
import streaming.service.LienService;

/**
 *
 * @author admin
 */

@Component
public class TableModeListelLiens extends DefaultTableModel{
    
   

private Film filmSelect = new Film();

    public Film getFilmSelect() {
        return filmSelect;
    }

    public void setFilmSelect(Film filmSelect) {
        this.filmSelect = filmSelect;
    }
    
     
    private List<Lien> liens = null;   
   
    public List<Lien> getLiens() {
        return liens;
    }
    private int nbLiens = 0;
    
    public TableModeListelLiens(){
        setColumnIdentifiers(new String[]{"ID","URL"});        
        liens=filmSelect.getListeLiens();
        nbLiens = liens.size();
    }
    
     @Override
    public int getRowCount(){
        return nbLiens;
    }
    
     @Override
    public Object getValueAt(int row, int column){
        Lien l = liens.get(row);
        
        if (column==0)
            return l.getId();
        
        if (column==1)
            return l.getUrl();
        
        return "***ERROR***";
    }
    
}
