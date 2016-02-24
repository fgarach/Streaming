/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.swing;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import streaming.entity.Serie;
import streaming.service.SerieService;

/**
 *
 * @author admin
 */
public class TableModelListSerie extends DefaultTableModel{
    
     private List<Serie> serie = null;
    private int nbSerie = 0;
    SerieService sServ = new SerieService();
    
    public TableModelListSerie(){

        setColumnIdentifiers(new String[]{"ID","Titre de la serie","Pays","Synopsis"});
        serie = sServ.listerTous();
        nbSerie = serie.size();
        
    }
    
    @Override
    public int getRowCount() {
        return nbSerie; 
    }
    
    
    
    @Override
    public Object getValueAt(int row, int column){
        Serie s = serie.get(row);
        if (column==0){
            return s.getId();
        }
        if (column==1){
            return s.getTitre();
        }
        if (column==2){
            return s.getPaysDOrigineDeLaSerie().getNom();
        }
        if (column==3){
            return s.getSynopsis();
        }
        
        return "***ERREUR****";
            
    }
    
}
