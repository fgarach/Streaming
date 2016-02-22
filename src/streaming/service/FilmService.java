/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.FilmDAO;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public class FilmService {
    
    private FilmDAO fDao = new FilmDAO();
    
    public void ajouter(Film f) {
        fDao.ajouter(f);
    }

    public void supprimer(Long id) {
        fDao.supprimer(id);
    }

    public void modifier(Film f) {
        fDao.modifier(f);
                
    }

    public Film rechercherParId(Long id) {
       return fDao.rechercherParId(id);
    }

    public List<Film> listerTous() {
        return fDao.listerTous();

    }
    
}
