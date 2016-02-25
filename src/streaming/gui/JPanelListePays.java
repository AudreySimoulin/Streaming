/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.gui;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.springframework.beans.factory.annotation.Autowired;
import streaming.entity.Pays;
import streaming.service.PaysService;

/**
 *
 * @author admin
 */
public class JPanelListePays extends javax.swing.JPanel {

    @Autowired
    private PaysService pserv ;
    
    @Autowired
    private JDialogEditPays jdPays;
    
    @Autowired
    private TableModelListePays tModelPays;

    /**
     * Creates new form JPanelListePays
     */
    public JPanelListePays() {
        initComponents();
        
    }

    public void rafraichir() {
        tModelPays.rafraichir();
        jTablePays.setModel(tModelPays);
        jTablePays.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jbNouveau = new javax.swing.JButton();
        jbSupprimer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePays = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jToolBar1.setRollover(true);

        jbNouveau.setText("Nouveau");
        jbNouveau.setFocusable(false);
        jbNouveau.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbNouveau.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbNouveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNouveauActionPerformed(evt);
            }
        });
        jToolBar1.add(jbNouveau);

        jbSupprimer.setText("Supprimer");
        jbSupprimer.setFocusable(false);
        jbSupprimer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSupprimer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSupprimerActionPerformed(evt);
            }
        });
        jToolBar1.add(jbSupprimer);

        add(jToolBar1, java.awt.BorderLayout.NORTH);

        jTablePays.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTablePays);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jbNouveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNouveauActionPerformed

        jdPays.rafraichir();
        jdPays.setJpPays(this);
        jdPays.setVisible(true);
        


    }//GEN-LAST:event_jbNouveauActionPerformed

    private void jbSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSupprimerActionPerformed

        int i = jTablePays.getSelectedRow();
        if (i == -1) {
            return;
        }

        Pays p = tModelPays.getPays().get(i);
        Long paysId = p.getId();

        pserv.supprimer(paysId);

        rafraichir();
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSupprimerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePays;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbNouveau;
    private javax.swing.JButton jbSupprimer;
    // End of variables declaration//GEN-END:variables
}
