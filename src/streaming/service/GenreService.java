/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.GenreDAO;
import streaming.entity.Genre;

/**
 *
 * @author admin
 */
public class GenreService {
    
    private GenreDAO gDao = new GenreDAO();
    
    public void ajouter(Genre g) {
        gDao.ajouter(g);
    }

    public void supprimer(Long id) {
        gDao.supprimer(id);
    }

    public void modifier(Genre g) {
        gDao.modifier(g);
                
    }

    public Genre rechercherParId(Long id) {
       return gDao.rechercherParId(id);
    }

    public List<Genre> listerTous() {
        return gDao.listerTous();

    }
    
}
