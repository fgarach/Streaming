/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.swing;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import streaming.entity.Saison;
import streaming.service.SaisonService;

/**
 *
 * @author admin
 */
@Component
public class TableModelListSaison extends DefaultTableModel {

    private List<Saison> saison = null;
    private int nbSaison = 0;

    @Autowired
    private SaisonService sServ;

    public void rafraichir() {
        saison = sServ.listerTous();
        nbSaison = saison.size();
    }

    public TableModelListSaison() {

        setColumnIdentifiers(new String[]{"ID", "Titre de la serie", "Numero de la saison"});

    }

    @Override
    public int getRowCount() {
        return nbSaison;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Saison s = saison.get(row);
        if (column == 0) {
            return s.getId();
        }
        if (column == 1) {
            return s.getSerieDeLaSaison().getTitre();
        }
        if (column == 2) {
            return s.getNumSaison();
        }

        return "***ERREUR****";

    }

}
