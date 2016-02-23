/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.swing;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import streaming.entity.Realisateur;
import streaming.service.RealisateurService;

/**
 *
 * @author admin
 */
public class TableModelListRealisateur extends DefaultTableModel {
    RealisateurService rServ = new RealisateurService();

    private List<Realisateur> realisateurs = null;

    public List<Realisateur> getRealisateurs() {
        return realisateurs;
    }
    private int nbRealisateur = 0;

    public TableModelListRealisateur() {

        setColumnIdentifiers(new String[]{"ID", "Nom du Réalisateur", "Prénom du Réalisateur"});

        realisateurs = rServ.listerTous();

        nbRealisateur = realisateurs.size();
    }

    @Override
    public int getRowCount() {
        return nbRealisateur;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Realisateur r = realisateurs.get(row);

        if (column == 0) {
            return r.getId();
        }
        if (column == 1) {
            return r.getNom();
        }
        if (column == 2) {
            return r.getPrenom();
        }


        return "******* Erreur *******";
    }
   
}
