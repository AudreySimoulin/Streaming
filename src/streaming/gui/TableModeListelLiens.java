/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.gui;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import streaming.entity.Lien;
import streaming.service.LienService;

/**
 *
 * @author admin
 */
public class TableModeListelLiens extends DefaultTableModel{
    
    private List<Lien> liens = null;

    public List<Lien> getLiens() {
        return liens;
    }
    private int nbliens = 0;
    private LienService lserv = new LienService();
    
}