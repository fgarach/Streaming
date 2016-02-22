/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import org.junit.Test;
import static org.junit.Assert.*;
import streaming.entity.Film;
import streaming.exception.SynopsisVideOuNullException;
import streaming.service.FilmService;

/**
 *
 * @author admin
 */
public class TestModeration {
    
    FilmService fs = new FilmService();
    
    @Test
    public void testAjoutFilm() throws SynopsisVideOuNullException{
        Film f = new Film();
        f.setId(1L);
        f.setTitre("coucou zut");
        f.setSynopsis("synop zut");

        fs.ajouter(f);
     
    }

}
