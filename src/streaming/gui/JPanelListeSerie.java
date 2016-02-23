/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.gui;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class JPanelListeSerie extends javax.swing.JPanel {
    
    private TableModelListeSerie tbListeSerie = null;
    
    public void rafraichirJTable(){
        tbListeSerie = new TableModelListeSerie();
        jTableSerie.setModel(tbListeSerie);
        jTableSerie.repaint();
    }


    public JPanelListeSerie() {
        initComponents();
        rafraichirJTable();
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
        jbNewSerie = new javax.swing.JButton();
        jbSupprimer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSerie = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jToolBar1.setRollover(true);

        jbNewSerie.setText("Nouvelle série");
        jbNewSerie.setFocusable(false);
        jbNewSerie.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbNewSerie.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbNewSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNewSerieActionPerformed(evt);
            }
        });
        jToolBar1.add(jbNewSerie);

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

        jTableSerie.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableSerie);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jbNewSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNewSerieActionPerformed
        new JDialogEditSerie(null, true, this).setVisible(true); //Affiche boite de dialogue
    }//GEN-LAST:event_jbNewSerieActionPerformed

    private void jbSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSupprimerActionPerformed
        // Supprimer la serie
        
        int i = jTableSerie.getSelectedRow();
        
        if(i == -1){
            return;
        }
        
        Serie s = tbListeSerie.getSerie().get(i);
        Long serieId = s.getId();
        
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        s = em.find(Serie.class, serieId);
        em.remove(s);
        em.getTransaction().commit();
        
        rafraichirJTable();
       
    }//GEN-LAST:event_jbSupprimerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSerie;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbNewSerie;
    private javax.swing.JButton jbSupprimer;
    // End of variables declaration//GEN-END:variables
}
