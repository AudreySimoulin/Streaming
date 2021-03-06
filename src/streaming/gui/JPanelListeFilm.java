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
import streaming.entity.Film;
import streaming.service.FilmService;

/**
 *
 * @author admin
 */

@Component
public class JPanelListeFilm extends javax.swing.JPanel {

    @Autowired
    private JDialogAfficheLiens jdLiens;

    @Autowired
    private FilmService fserv;
    
    @Autowired
    private TableModelListeFilm tModelListeFilm;
    
    @Autowired
    private JDialogEditFilm jDialogueEditFilm;
         
    private JFramePrincipale jFrameP;

    public void setjFrameP(JFramePrincipale jFrameP) {
        this.jFrameP = jFrameP;
    }
    
    /**
     * Rafraichit le tableau avec l'état actuel en BD
     */
    
    
    public void rafraichir() {
        tModelListeFilm.rafraichir();
        
        jTableFilm.setModel(tModelListeFilm);
        jTableFilm.revalidate();
        jTableFilm.repaint();
        
        jFrameP.repaint();

    }

    public JPanelListeFilm() {
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
        jbNouveauFilm = new javax.swing.JButton();
        jbSupprimerFilm = new javax.swing.JButton();
        jbLiens = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFilm = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jToolBar1.setRollover(true);

        jbNouveauFilm.setText("Nouveau");
        jbNouveauFilm.setFocusable(false);
        jbNouveauFilm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbNouveauFilm.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbNouveauFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNouveauFilmActionPerformed(evt);
            }
        });
        jToolBar1.add(jbNouveauFilm);

        jbSupprimerFilm.setText("Supprimer");
        jbSupprimerFilm.setFocusable(false);
        jbSupprimerFilm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSupprimerFilm.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbSupprimerFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSupprimerFilmActionPerformed(evt);
            }
        });
        jToolBar1.add(jbSupprimerFilm);

        jbLiens.setText("Afficher Liens");
        jbLiens.setFocusable(false);
        jbLiens.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbLiens.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbLiens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLiensActionPerformed(evt);
            }
        });
        jToolBar1.add(jbLiens);

        add(jToolBar1, java.awt.BorderLayout.NORTH);

        jTableFilm.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableFilm);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSupprimerFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSupprimerFilmActionPerformed
        int i = jTableFilm.getSelectedRow();
        if (i == -1) {
            return;
        }
        Film f = tModelListeFilm.getFilm().get(i);
        Long filmId = f.getId();

        fserv.supprimer(filmId);
        rafraichir();

        // TODO add your handling code here:
    }//GEN-LAST:event_jbSupprimerFilmActionPerformed


    private void jbNouveauFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNouveauFilmActionPerformed
        
        jDialogueEditFilm.rafraichir();
        jDialogueEditFilm.setjPanelListeFilm(this);
        jDialogueEditFilm.setVisible(true);//Affiche boite de dialogue
        

    }//GEN-LAST:event_jbNouveauFilmActionPerformed

    private void jbLiensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLiensActionPerformed

        int i = jTableFilm.getSelectedRow();
        if (i == -1) {
            return;
        }
        Film f = tModelListeFilm.getFilm().get(i);

        jdLiens.rafraichirJTable();
        jdLiens.setVisible(true);
        jdLiens.setFilmSelect(f);

        // TODO add your handling code here:
    }//GEN-LAST:event_jbLiensActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFilm;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbLiens;
    private javax.swing.JButton jbNouveauFilm;
    private javax.swing.JButton jbSupprimerFilm;
    // End of variables declaration//GEN-END:variables
}
