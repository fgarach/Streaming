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
import streaming.entity.Genre;
import streaming.service.GenreService;

/**
 *
 * @author admin
 */
@Component
public class TableModelListGenre extends DefaultTableModel{
    
    private List<Genre> genre = null;
    private int nbGenre = 0;
    
    @Autowired
    private GenreService gServ;
    
     public void rafraichir(){
    
        genre = gServ.listerTous();
        nbGenre = genre.size();
       
    }
    
    public TableModelListGenre(){

        setColumnIdentifiers(new String[]{"ID","Genre"});

        
    }
    
    @Override
    public int getRowCount() {
        return nbGenre; 
    }
    
    
    
    @Override
    public Object getValueAt(int row, int column){
        Genre g = genre.get(row);
        if (column==0){
            return g.getId();
        }
        if (column==1){
            return g.getNom();
        }
        return "***ERREUR****";
            
    }
    
}
