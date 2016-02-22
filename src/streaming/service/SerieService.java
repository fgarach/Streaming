/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.SerieDAO;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieService {
    
    private SerieDAO sDao = new SerieDAO();
    
    public void ajouter(Serie s) {
        sDao.ajouter(s);
    }

    public void supprimer(Long id) {
        sDao.supprimer(id);
    }

    public void modifier(Serie s) {
        sDao.modifier(s);
                
    }

    public Serie rechercherParId(Long id) {
       return sDao.rechercherParId(id);
    }

    public List<Serie> listerTous() {
        return sDao.listerTous();

    }
    
}