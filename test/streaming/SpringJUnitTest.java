/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import static java.util.Collections.list;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.entity.Pays;
import streaming.entity.Serie;
import streaming.service.PaysService;
import streaming.service.SerieService;


/**
 *
 * @author admin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:/C:\\Users\\admin\\Documents\\NetBeansProjects\\Streaming\\application-context.xml")
public class SpringJUnitTest {
    @Autowired //Pour que spring instencie lui même notre dao 
    private PaysService pServ;
    @Autowired //Pour que spring instencie lui même notre dao 
    private SerieService sServ;
    
    @Test
    public void TestPays(){
               List<Pays> pays =  pServ.listerTous();
               System.out.println(pays.size());
               Pays p = new Pays();
               pServ.ajouter(p);
               List<Pays> pays2 =  pServ.listerTous();
               System.out.println(pays2.size());
            }
    
    @Test
    public void TestSerie(){
               List<Serie> serie =  sServ.listerTous();
               System.out.println(serie.size());
               Serie s = new Serie();
               sServ.ajouter(s);
               List<Serie> serie2 =  sServ.listerTous();
               System.out.println(serie2.size());
            }
    
    
    
}
