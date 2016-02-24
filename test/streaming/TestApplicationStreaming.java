/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.dao.FilmDAO;
import streaming.entity.Film;
import streaming.service.FilmService;
import streaming.service.GenreService;
import streaming.swing.JFramePrincipale;

/**
 *
 * @author admin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:/C:\\Users\\admin\\Documents\\NetBeansProjects\\Streaming\\application-context.xml")
public class TestApplicationStreaming {

    private FilmService fServ;
    @Autowired
    private FilmDAO fDAO;
    private GenreService gServ;
    
    @Test
    public void testSpring() {
       List<Film> l =fDAO.listerTous();
        

    }
}
