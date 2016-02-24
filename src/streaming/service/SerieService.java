/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.SerieDAO;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
@Service
public class SerieService {
    
    @Autowired
    private SerieDAO sDao;
    
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
    
    public List<Serie> listerParPays(Long idPays) {
        return sDao.listerParPays(idPays);
        
    }
    
    public List<Serie> listerParTitre(String str) {
        return sDao.listerParTitre(str);
        
    }
    
}
