/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.SaisonDAO;
import streaming.entity.Saison;

/**
 *
 * @author admin
 */
public class SaisonService {
    
    private SaisonDAO sDao = new SaisonDAO();
    
    public void ajouter(Saison s) {
        sDao.ajouter(s);
    }

    public void supprimer(Long id) {
        sDao.supprimer(id);
    }

    public void modifier(Saison s) {
        sDao.modifier(s);
                
    }

    public Saison rechercherParId(Long id) {
       return sDao.rechercherParId(id);
    }

    public List<Saison> listerTous() {
        return sDao.listerTous();

    }
    
}
