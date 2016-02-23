/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import streaming.entity.Genre;
import streaming.entity.Pays;
import streaming.entity.Realisateur;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        
//        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
//        
//        Query query1 = em.createQuery("SELECT r FROM Realisateur r WHERE r.prenom='Quentin'"); //cree une requete type sql
//        Query query2 = em.createQuery("SELECT g FROM Genre g WHERE g.nom<>'animé'"); //cree une requete type sql
//        List<Realisateur>liste = query1.getResultList(); // renvoi une liste de réalisateur
//        List<Genre>liste2 = query2.getResultList();
//        
//        for(int i=0; i<liste.size(); i++){
//            Realisateur r = liste.get(i);
//            System.out.println(r.getPrenom());                
//            }
//        
//        
//        for(int j=0; j<liste2.size(); j++){
//            Genre g = liste2.get(j);
//            System.out.println(g.getNom());                
//            }
//        }
//}
        
//        int i=0;
//        do{
//            Pays p = liste.get(i);
//            System.out.println(p.getNom());
//            i++;
//        }while (i<liste.size());
        
        
//        int j=0;
//        while (j<liste.size()){
//            Pays p = (Pays) liste.get(j);
//            j++;
//            System.out.println(p.getNom());
//        }
        
        
//        for(Pays p : liste){
//            
//            System.out.println(p.getNom());
//        } //pour tous les pays dans l afficher le nom
        
//        
//        // ajouter un nouveau pays
//        Genre g1 = new Genre();
//        Genre g2 = new Genre();
//        Genre g3 = new Genre();
//        
//        Pays p1 = new Pays();
//        Pays p2 = new Pays();
//        Pays p3 = new Pays();
//        
//        Realisateur r1 = new Realisateur();
//        Realisateur r2 = new Realisateur();
//        Realisateur r3 = new Realisateur();
//        
//        p1.setNom("France");
//        p1.setId(1L);
//        p2.setNom("USA");
//        p2.setId(2L);
//        p3.setNom("Espagne");
//        p3.setId(3L);
//        
//        g1.setNom("animé");
//        g1.setId(1L);
//        g2.setNom("action");
//        g2.setId(2L);
//        g3.setNom("science fiction");
//        g3.setId(3L);
//
//        r1.setNom("Tarantino");
//        r1.setPrenom("Quentin");
//        r1.setId(1L);
//        r2.setNom("Lucas");
//        r2.setPrenom("Georges");
//        r2.setId(2L);
//        r3.setNom("Almodovor");
//        r3.setPrenom("Pedro");
//        r3.setId(3L);        
//        
//        
//        
//        em.getTransaction().begin(); // on commence des transactions
//        em.persist(p1); //genere un insert en base de donnée
//        em.persist(p2);
//        em.persist(p3);
//        em.persist(g1);
//        em.persist(g2);
//        em.persist(g3);
//        em.persist(r1);
//        em.persist(r2);
//        em.persist(r3);
//
//        em.getTransaction().commit(); // valide l'insert

    }}