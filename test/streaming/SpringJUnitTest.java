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
import streaming.entity.Realisateur;
import streaming.entity.Saison;
import streaming.entity.Serie;
import streaming.service.PaysService;
import streaming.service.RealisateurService;
import streaming.service.SaisonService;
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
    @Autowired //Pour que spring instencie lui même notre dao 
    private SaisonService saServ;
    @Autowired //Pour que spring instencie lui même notre dao 
    private RealisateurService rServ;
    
    //@Test
    public void TestPays(){
               List<Pays> pays =  pServ.listerTous();
               System.out.println(pays.size());
               Pays p = new Pays();
               pServ.ajouter(p);
               List<Pays> pays2 =  pServ.listerTous();
               System.out.println(pays2.size());
            }
    
   // @Test
    public void TestSerie(){
               List<Serie> serie =  sServ.listerTous();
               System.out.println(serie.size());
               Serie s = new Serie();
               sServ.ajouter(s);
               List<Serie> serie2 =  sServ.listerTous();
               System.out.println(serie2.size());
            }
    
   // @Test
    public void TestSaison(){
               List<Saison> saison =  saServ.listerTous();
               System.out.println(saison.size());
               Saison s = new Saison();
               saServ.ajouter(s);
               List<Saison> saison2 =  saServ.listerTous();
               System.out.println(saison2.size());
            }
    
        @Test
    public void TestReal(){
               List<Realisateur> real =  rServ.listerTous();
               System.out.println(real.size());
               Realisateur r = new Realisateur();
               rServ.ajouter(r);
               List<Realisateur> real2 =  rServ.listerTous();
               System.out.println(real2.size());
            }
    
    
}
