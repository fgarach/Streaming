/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.swing;


import org.springframework.beans.factory.annotation.Autowired;
import streaming.entity.Realisateur;
import streaming.service.RealisateurService;

/**
 *
 * @author admin
 */
public class JPanelListRealisateur extends javax.swing.JPanel {

    private TableModelListRealisateur tmListeRealisateur = null;
    
    @Autowired
    private RealisateurService rServ;

    public void rafraichitJTable() {
        tmListeRealisateur = new TableModelListRealisateur();
        jTableRealisateur.setModel(tmListeRealisateur);
        jTableRealisateur.repaint();
    }

    /**
     * Creates new form JPanelListRealisateur
     */
    public JPanelListRealisateur() {
        initComponents();
        rafraichitJTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBarRealisateur = new javax.swing.JToolBar();
        jButtonAjouter = new javax.swing.JButton();
        jButtonSupprimer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRealisateur = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jToolBarRealisateur.setRollover(true);

        jButtonAjouter.setText("Nouveau Réalisateur");
        jButtonAjouter.setFocusable(false);
        jButtonAjouter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAjouter.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjouterActionPerformed(evt);
            }
        });
        jToolBarRealisateur.add(jButtonAjouter);

        jButtonSupprimer.setText("Supprimer");
        jButtonSupprimer.setFocusable(false);
        jButtonSupprimer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSupprimer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSupprimerActionPerformed(evt);
            }
        });
        jToolBarRealisateur.add(jButtonSupprimer);

        add(jToolBarRealisateur, java.awt.BorderLayout.NORTH);

        jTableRealisateur.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableRealisateur);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerActionPerformed
        int i = jTableRealisateur.getSelectedRow();
        if (i == -1) {
            return;
        }

        Realisateur r = tmListeRealisateur.getRealisateurs().get(i);
        rServ.supprimer(r.getId());

        rafraichitJTable();
    }//GEN-LAST:event_jButtonSupprimerActionPerformed

    private void jButtonAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjouterActionPerformed
        JDialogEditRealisateur jdg = new JDialogEditRealisateur(null, true,this);
        jdg.setVisible(true);
    }//GEN-LAST:event_jButtonAjouterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAjouter;
    private javax.swing.JButton jButtonSupprimer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRealisateur;
    private javax.swing.JToolBar jToolBarRealisateur;
    // End of variables declaration//GEN-END:variables
}
