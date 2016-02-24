/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.LienDAO;
import streaming.entity.Lien;

/**
 *
 * @author admin
 */
@Service
public class LienService {
    
    @Autowired
    private LienDAO lDao;
    
    public void ajouter(Lien l) {
        lDao.ajouter(l);
    }

    public void supprimer(Long id) {
        lDao.supprimer(id);
    }

    public void modifier(Lien l) {
        lDao.modifier(l);
                
    }

    public Lien rechercherParId(Long id) {
       return lDao.rechercherParId(id);
    }

    public List<Lien> listerTous() {
        return lDao.listerTous();

    }
    
}
