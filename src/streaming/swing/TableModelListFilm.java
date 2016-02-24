/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.swing;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import streaming.entity.Film;
import streaming.service.FilmService;
import streaming.service.GenreService;
import streaming.service.PaysService;

/**
 *
 * @author admin
 */
public class TableModelListFilm extends DefaultTableModel {

    @Autowired
    private FilmService fServ;
    @Autowired
    private GenreService gServ;

    private List<Film> film = null;

    public List<Film> getFilm() {
        return film;
    }
    private int nbFilm = 0;

    public TableModelListFilm() {

        setColumnIdentifiers(new String[]{"ID", "Titre du film", "Année de Production", "Pays", "Genre", "Synopsis"});

        film = fServ.listerTous();

        nbFilm = film.size();
    }

    @Override
    public int getRowCount() {
        return nbFilm;
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Film f = film.get(row);

        if (column == 0) {
            return f.getId();
        }
        if (column == 1) {
            return f.getTitre();
        }
        if (column == 2) {
            return f.getAnnee();
        }
        if (column == 3) {
            return f.getPaysDOrigineDuFilm().getNom();
        }
        if (column == 4) {
            return f.getGenreDuFilm().getNom();
        }
        if (column == 5) {
            return f.getSynopsis();
        }

        return "******* Erreur *******";
    }

}
