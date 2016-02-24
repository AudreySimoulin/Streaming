/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.gui;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Genre;

/**
 *
 * @author admin
 */
public class JPanelListeGenre extends javax.swing.JPanel {

    private TableModelListeGenre tbListeGenre = null;

    public void rafraichirJTable() {
        tbListeGenre = new TableModelListeGenre();
        jTableGenre.setModel(tbListeGenre);
        jTableGenre.repaint();
    }

    public JPanelListeGenre() {
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
        jbNewGenre = new javax.swing.JButton();
        jbSupprimer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGenre = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jToolBar1.setRollover(true);

        jbNewGenre.setText("Nouveau Genre");
        jbNewGenre.setFocusable(false);
        jbNewGenre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbNewGenre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbNewGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNewGenreActionPerformed(evt);
            }
        });
        jToolBar1.add(jbNewGenre);

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

        jTableGenre.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableGenre);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jbNewGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNewGenreActionPerformed
        // TODO add your handling code here:
        new JDialogEditGenre(null, true, this).setVisible(true);
    }//GEN-LAST:event_jbNewGenreActionPerformed

    private void jbSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSupprimerActionPerformed
        // TODO add your handling code here:
        
        int i = jTableGenre.getSelectedRow();
        if(i == -1){
            return;
        }
        
        Genre g = tbListeGenre.getGenre().get(i);
        Long idGenre = g.getId();
        
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        g = em.find(Genre.class, idGenre);
        em.remove(g);
        em.getTransaction().commit();
        
        rafraichirJTable();
        
    }//GEN-LAST:event_jbSupprimerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableGenre;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbNewGenre;
    private javax.swing.JButton jbSupprimer;
    // End of variables declaration//GEN-END:variables
}