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
import streaming.entity.Genre;
import streaming.service.GenreService;

/**
 *
 * @author admin
 */
@Component
public class TableModelListeGenre extends DefaultTableModel{
    
    private List<Genre> genre = null;
    private int nbGenre = 0;
    
    @Autowired
    private GenreService gserv;

    public List<Genre> getGenre() {
        return genre;
    }
    
    public TableModelListeGenre(){
        setColumnIdentifiers(new String[] {"ID", "Nom"});
//        genre = gserv.listerTous();
//        nbGenre = genre.size();
    }
    
    @Override
    public int getRowCount(){
        return nbGenre;
    }
    
    public Object getValueAt(int row, int column){
        Genre g = genre.get(row);
        
        if(column == 0){
            return g.getId();
        }
        if(column == 1){
            return g.getNom();
        }
        return "***ERROR***";
    }
    }
    

