/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;

import streaming.dao.RealisateurDAO;
import streaming.entity.Realisateur;

/**
 *
 * @author admin
 */

public class RealisateurService {
    

    private RealisateurDAO rDao= new RealisateurDAO();
    
    public void ajouter(Realisateur r) {
        rDao.ajouter(r);
    }

    public void supprimer(Long id) {
        rDao.supprimer(id);
    }

    public void modifier(Realisateur r) {
        rDao.modifier(r);
                
    }

    public Realisateur rechercherParId(Long id) {
       return rDao.rechercherParId(id);
    }

    public List<Realisateur> listerTous() {
        return rDao.listerTous();

    }
    
}
