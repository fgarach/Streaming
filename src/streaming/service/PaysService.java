/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import streaming.dao.PaysDAO;
import streaming.entity.Pays;

/**
 *
 * @author admin
 */

@Service
public class PaysService {
    
    private PaysDAO pDao = new PaysDAO();
    
    public void ajouter(Pays p) {
        pDao.ajouter(p);
    }

    public void supprimer(Long id) {
        pDao.supprimer(id);
    }

    public void modifier(Pays p) {
        pDao.modifier(p);
                
    }

    public Pays rechercherParId(Long id) {
       return pDao.rechercherParId(id);
    }

    public List<Pays> listerTous() {
        return pDao.listerTous();

    }
    
}
