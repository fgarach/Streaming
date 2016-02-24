/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.swing;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import streaming.entity.Saison;
import streaming.service.SaisonService;

/**
 *
 * @author admin
 */
public class TableModelListSaison extends DefaultTableModel{
    
    private List<Saison> saison = null;
    private int nbSaison = 0;
    SaisonService sServ = new SaisonService();
    
    public TableModelListSaison(){

        setColumnIdentifiers(new String[]{"ID","Titre de la serie","Numero de la saison"});
        saison = sServ.listerTous();
        nbSaison = saison.size();
        
    }
    
    @Override
    public int getRowCount() {
        return nbSaison; 
    }
    
    
    
    @Override
    public Object getValueAt(int row, int column){
        Saison s = saison.get(row);
        if (column==0){
            return s.getId();
        }
        if (column==1){
            return s.getSerieDeLaSaison().getTitre();
        }
        if (column==2){
            return s.getNumSaison();
        }
        
        return "***ERREUR****";
            
    }
    
}
