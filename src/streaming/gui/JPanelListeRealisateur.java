/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.gui;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import streaming.entity.Realisateur;
import streaming.service.RealisateurService;

/**
 *
 * @author admin
 */
@Component
public class JPanelListeRealisateur extends javax.swing.JPanel {

    /**
     * Creates new form JPanelListeRealisateur
     */
    @Autowired
    private JDialogEditRealisateur jDialogEditRealisateur;

    @Autowired
    private TableModelListeRealisateur tbListeReal;

    @Autowired
    private RealisateurService rserv;

    public void rafraichirJTable() {
        jTableReal.setModel(tbListeReal);
        jTableReal.repaint();
    }

    public JPanelListeRealisateur() {
        initComponents();
        
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
        jbNewReal = new javax.swing.JButton();
        jbSupprimer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableReal = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jToolBar1.setRollover(true);

        jbNewReal.setText("Nouveau réalisateur");
        jbNewReal.setFocusable(false);
        jbNewReal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbNewReal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbNewReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNewRealActionPerformed(evt);
            }
        });
        jToolBar1.add(jbNewReal);

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

        jTableReal.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableReal);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jbNewRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNewRealActionPerformed
        // Ajout d'un nouveau réalisateur
             
        jDialogEditRealisateur.rafraichir();
        jDialogEditRealisateur.setJpListeReal(this);        
        jDialogEditRealisateur.setVisible(true);
        
    }//GEN-LAST:event_jbNewRealActionPerformed

    private void jbSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSupprimerActionPerformed
        // Suppression d'un réalisateur
        int i = jTableReal.getSelectedRow();
        if (i == -1) {
            return;
        }

        Realisateur r = tbListeReal.getRealisateur().get(i);
        Long idReal = r.getId();

        rserv.supprimer(idReal);

        rafraichirJTable();

    }//GEN-LAST:event_jbSupprimerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableReal;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbNewReal;
    private javax.swing.JButton jbSupprimer;
    // End of variables declaration//GEN-END:variables
}
