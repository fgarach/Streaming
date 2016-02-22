/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import streaming.entity.Genre;
import streaming.entity.Pays;
import streaming.entity.Realisateur;


/**
 *
 * @author admin
 */
public class PaysTest {
    
    @Test
    public void testTab(){
        
        Object[] monTab = new Object[10];
        
        for(int i=0 ; i < monTab.length ; i++ ){
            monTab[i]= 2*(i+1);
            System.out.print(monTab[i]);

        }
   
    }
    @BeforeClass
    public static void AvantClasss(){
        System.out.println("avantChaqueTest"); 
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        
        em.getTransaction().begin(); // on commence des transactions
        
        //vides toutes les tables
        em.createQuery("DELETE FROM Genre g").executeUpdate();
        em.createQuery("DELETE FROM Pays p").executeUpdate();
        em.createQuery("DELETE FROM Realisateur r").executeUpdate();
        
        Genre g1 = new Genre();
        Genre g2 = new Genre();
        Genre g3 = new Genre();
        
        Pays p1 = new Pays();
        Pays p2 = new Pays();
        Pays p3 = new Pays();
        
        Realisateur r1 = new Realisateur();
        Realisateur r2 = new Realisateur();
        Realisateur r3 = new Realisateur();
        
        p1.setNom("France");
        p1.setId(1L);
        p2.setNom("USA");
        p2.setId(2L);
        p3.setNom("Espagne");
        p3.setId(3L);
        
        g1.setNom("animé");
        g1.setId(1L);
        g2.setNom("action");
        g2.setId(2L);
        g3.setNom("science fiction");
        g3.setId(3L);

        r1.setNom("Tarantino");
        r1.setPrenom("Quentin");
        r1.setId(1L);
        r2.setNom("Lucas");
        r2.setPrenom("Georges");
        r2.setId(2L);
        r3.setNom("Almodovor");
        r3.setPrenom("Pedro");
        r3.setId(3L);        
        
        em.persist(p1); //genere un insert en base de donnée
        em.persist(p2);
        em.persist(p3);
        em.persist(g1);
        em.persist(g2);
        em.persist(g3);
        em.persist(r1);
        em.persist(r2);
        em.persist(r3);

        em.getTransaction().commit(); // valide l'insert
    }
    

    @Test
    public void test2(){
        System.out.println("test2");      
        
    }
    
     @Test
    public void verifNbTotalPaysEgale3(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        
        
        int n = em.createQuery("SELECT p FROM Pays p").getResultList().size();
        
//        Assert.assertEquals(3, n);
          Assert.assertTrue("BLA",n==3);
        
        System.out.println("test2");      
        
    }
    
    @Test
    public void testNull(){

        
        
        
    
}
    
    @Test
    public void test1(){
        System.out.println("test1");      
        
    }

    private void assertArrayEquals(int i, int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Test
    
    public void verifTarantinonoId1(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        
        Realisateur r =(Realisateur) em.createQuery("SELECT r FROM Realisateur r WHERE r.nom='Tarantino'").getSingleResult();
        Assert.assertEquals(1, (long)r.getId());
    }
    

    
    
}
//deprecated