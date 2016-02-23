/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.swing;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import streaming.entity.Genre;
import streaming.service.GenreService;

/**
 *
 * @author admin
 */
public class TableModelListGenre extends DefaultTableModel{
    
    private List<Genre> genre = null;
    private int nbGenre = 0;
    GenreService gServ = new GenreService();
    
    public TableModelListGenre(){

        setColumnIdentifiers(new String[]{"ID","Genre"});
        genre = gServ.listerTous();
        nbGenre = genre.size();
        
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
