/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.swing;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import streaming.entity.Saison;
import streaming.entity.Serie;
import streaming.service.SaisonService;
import streaming.service.SerieService;

/**
 *
 * @author admin
 */
public class JDialogSaison extends javax.swing.JDialog {
    @Autowired
    private SerieService seServ;
    @Autowired
    private SaisonService saServ;
    private JPanelListSaison jpls;
    private List<Serie> listSerie = new ArrayList<Serie>();
    private List<Saison> listSaison = new ArrayList<Saison>();
    
     public void rafraichirListSerieSaison() {
        listSerie = seServ.listerTous();
        for (Serie s : listSerie) {
            if (s.getTitre().equals(jComboBoxSerie.getSelectedItem())) {
            List<Saison> listSaison = s.getSaisonDeLaSerie();
            }
        }
     }
     
    public void initialiserComboBoxSerie() {

        jComboBoxSerie.removeAllItems();
        for (Serie s : listSerie) {
            jComboBoxSerie.addItem(s.getTitre());
        }
        

    }
    
    public JDialogSaison(java.awt.Frame parent, boolean modal, JPanelListSaison jpls) {
        super(parent, modal);
        initComponents();
        this.jpls=jpls;
        rafraichirListSerieSaison();
        initialiserComboBoxSerie();
        
    }

    /**
     * Creates new form JDialogSaison
     */
    public JDialogSaison(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jComboBoxSerie = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldSaison = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(4, 3));

        jLabel1.setText("Id");
        getContentPane().add(jLabel1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1);

        jLabel2.setText("Serie");
        getContentPane().add(jLabel2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);

        jComboBoxSerie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSerieActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxSerie);

        jLabel3.setText("Saison");
        getContentPane().add(jLabel3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);

        jTextFieldSaison.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSaisonActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSaison);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4);

        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Saison saison = new Saison();
        
        for (Serie s : listSerie) {
            if (s.getTitre().equals(jComboBoxSerie.getSelectedItem())) {
                saison.setSerieDeLaSaison(s);
            }
        }
        
        
        saison.setNumSaison(Long.parseLong(jTextFieldSaison.getText()));
        
        saServ.ajouter(saison);
        
        
        this.jpls.rafraichiJTable();
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldSaisonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSaisonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSaisonActionPerformed

    private void jComboBoxSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSerieActionPerformed
        Saison saison = new Saison();
        Long numMax = 1L;
                
        for (Serie s : listSerie) {
            if (s.getTitre().equals(jComboBoxSerie.getSelectedItem())) {
                List<Saison> listSaison = s.getSaisonDeLaSerie();
                for (int i =0 ; i<listSaison.size() ; i++) {
                    if (numMax<listSaison.get(i).getNumSaison()){
                        numMax = listSaison.get(i).getNumSaison();
                    }
                }
                numMax = numMax+1;
                jTextFieldSaison.setText(numMax.toString());
            }
        }
    }//GEN-LAST:event_jComboBoxSerieActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogSaison.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogSaison.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogSaison.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogSaison.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogSaison dialog = new JDialogSaison(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxSerie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldSaison;
    // End of variables declaration//GEN-END:variables
}
