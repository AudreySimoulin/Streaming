/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.gui;

/**
 *
 * @author admin
 */
public class JFramePrincipale extends javax.swing.JFrame {

    /**
     * Creates new form JFramePrincipale
     */
    public JFramePrincipale() {
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
        jbFilm = new javax.swing.JButton();
        jbSerie = new javax.swing.JButton();
        jbPays = new javax.swing.JButton();
        jbReal = new javax.swing.JButton();
        jbGenre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jbFilm.setText("Film");
        jbFilm.setFocusable(false);
        jbFilm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbFilm.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFilmActionPerformed(evt);
            }
        });
        jToolBar1.add(jbFilm);

        jbSerie.setText("Série");
        jbSerie.setFocusable(false);
        jbSerie.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSerie.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jbSerie);

        jbPays.setText("Pays");
        jbPays.setFocusable(false);
        jbPays.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbPays.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jbPays);

        jbReal.setText("Réalisateur");
        jbReal.setFocusable(false);
        jbReal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbReal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jbReal);

        jbGenre.setText("Genre");
        jbGenre.setFocusable(false);
        jbGenre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbGenre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jbGenre);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.NORTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFilmActionPerformed
    
        // TODO add your handling code here:
    }//GEN-LAST:event_jbFilmActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbFilm;
    private javax.swing.JButton jbGenre;
    private javax.swing.JButton jbPays;
    private javax.swing.JButton jbReal;
    private javax.swing.JButton jbSerie;
    // End of variables declaration//GEN-END:variables
}
