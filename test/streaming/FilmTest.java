/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import streaming.entity.Episode;
import streaming.entity.Film;
import streaming.entity.Genre;
import streaming.entity.Lien;
import streaming.entity.Pays;
import streaming.entity.Realisateur;
import streaming.entity.Saison;
import streaming.entity.Serie;
import streaming.exception.SynopsisVideOuNullException;
import streaming.service.DBService;
import streaming.service.EpisodeService;
import streaming.service.FilmService;
import streaming.service.GenreService;
import streaming.service.LienService;
import streaming.service.PaysService;
import streaming.service.RealisateurService;
import streaming.service.SaisonService;
import streaming.service.SerieService;

/**
 *
 * @author admin
 *
 */
public class FilmTest {

    @Before
    public void before() throws SynopsisVideOuNullException {
        DBService dServ = new DBService();
        GenreService gServ = new GenreService();
        PaysService pServ = new PaysService();
        RealisateurService rServ = new RealisateurService();
        FilmService fServ = new FilmService();
        SerieService seServ = new SerieService();
        SaisonService saServ = new SaisonService();
        EpisodeService eServ = new EpisodeService();
        LienService lserv = new LienService();

        dServ.supprimerTout();

        {
            Genre g1 = new Genre();
            g1.setId(1L);
            g1.setNom("Action");
            gServ.ajouter(g1);
        }
        {
            Genre g1 = new Genre();
            g1.setId(2L);
            g1.setNom("Fantastique");
            gServ.ajouter(g1);
        }
        {
            Genre g1 = new Genre();
            g1.setId(3L);
            g1.setNom("Policier");
            gServ.ajouter(g1);
        }
        {
            Genre g1 = new Genre();
            g1.setId(4L);
            g1.setNom("Romance");
            gServ.ajouter(g1);
        }
        {
            Genre g1 = new Genre();
            g1.setId(5L);
            g1.setNom("Animation");
            gServ.ajouter(g1);
        }

        {
            Genre g1 = new Genre();
            g1.setId(6L);
            g1.setNom("Comedie");
            gServ.ajouter(g1);
        }

        {
            Pays p1 = new Pays();
            p1.setId(1L);
            p1.setNom("France");
            pServ.ajouter(p1);
        }
        {
            Pays p1 = new Pays();
            p1.setId(2L);
            p1.setNom("USA");
            pServ.ajouter(p1);
        }
        {
            Pays p1 = new Pays();
            p1.setId(3L);
            p1.setNom("UK");
            pServ.ajouter(p1);
        }
        {
            Pays p1 = new Pays();
            p1.setId(4L);
            p1.setNom("Espagne");
            pServ.ajouter(p1);
        }
        {
            Pays p1 = new Pays();
            p1.setId(5L);
            p1.setNom("Nouvelle-Zelande");
            pServ.ajouter(p1);
        }

        {
            Realisateur r1 = new Realisateur();
            r1.setId(1L);
            r1.setNom("Coen");
            r1.setPrenom("Joel");
            rServ.ajouter(r1);
        }
        {
            Realisateur r1 = new Realisateur();
            r1.setId(2L);
            r1.setNom("Coen");
            r1.setPrenom("Ethan");
            rServ.ajouter(r1);
        }
        {
            Realisateur r1 = new Realisateur();
            r1.setId(3L);
            r1.setNom("Jackson");
            r1.setPrenom("Peter");
            rServ.ajouter(r1);
        }
        {
            Realisateur r1 = new Realisateur();
            r1.setId(4L);
            r1.setNom("Tarantino");
            r1.setPrenom("Quentin");
            rServ.ajouter(r1);
        }
        {
            Realisateur r1 = new Realisateur();
            r1.setId(5L);
            r1.setPrenom("Maiwenn");
            rServ.ajouter(r1);
        }

        {
            Genre g = gServ.rechercherParId(1L);
            Pays p = pServ.rechercherParId(2L);
            Realisateur r = rServ.rechercherParId(4L);

            Film f1 = new Film();
            f1.setId(1L);
            f1.setTitre("Django Unchained");
            f1.setAnnee(2012L);
            f1.setSynopsis("e film commence dans le Texas, en 1858, où une file d'esclaves enchaînés avance péniblement sous la garde des frères Ace et Dicky Speck. ");
            f1.setGenreDuFilm(g);// Genre
            g.getFilmDuGenre().add(f1);
            f1.setPaysDOrigineDuFilm(p);// Pays          
            p.getFilmDuPays().add(f1);
            f1.getRealisateurDuFilm().add(r);// Réal
            r.getFilmDeRealisateur().add(f1);

            fServ.ajouter(f1);

        }
        {
            Genre g = gServ.rechercherParId(1L);
            Pays p = pServ.rechercherParId(2L);
            Realisateur r = rServ.rechercherParId(4L);

            Film f1 = new Film();
            f1.setId(2L);
            f1.setTitre("Kill Bill");
            f1.setAnnee(2003L);
            f1.setSynopsis("Dans la petite chapelle de Two Pines perdue au milieu du désert, des assassins surgissent et tirent impitoyablement et sans raison apparente sur toutes les personnes présentes.");
            f1.setGenreDuFilm(g);// Genre
            g.getFilmDuGenre().add(f1);
            f1.setPaysDOrigineDuFilm(p);// Pays          
            p.getFilmDuPays().add(f1);
            f1.getRealisateurDuFilm().add(r);// Réal
            r.getFilmDeRealisateur().add(f1);

            fServ.ajouter(f1);
        }
        {
            Genre g = gServ.rechercherParId(1L);
            Pays p = pServ.rechercherParId(2L);
            Realisateur r = rServ.rechercherParId(4L);

            Film f1 = new Film();
            f1.setId(3L);
            f1.setTitre("Kill Bill 2");
            f1.setAnnee(2004L);
            f1.setSynopsis("Après s'être débarrassée de ses anciennes collègues Vernita Green et O-Ren Ishii, la Mariée poursuit sa quête vengeresse. Il lui reste à régler le sort de Budd puis de Elle Driver avant d'atteindre le but ultime : tuer Bill.");
            f1.setGenreDuFilm(g);// Genre
            g.getFilmDuGenre().add(f1);
            f1.setPaysDOrigineDuFilm(p);// Pays          
            p.getFilmDuPays().add(f1);
            f1.getRealisateurDuFilm().add(r);// Réal
            r.getFilmDeRealisateur().add(f1);

            fServ.ajouter(f1);
        }
        {
            Genre g = gServ.rechercherParId(1L);
            Pays p = pServ.rechercherParId(2L);
            Realisateur r = rServ.rechercherParId(4L);

            Film f1 = new Film();
            f1.setId(4L);
            f1.setTitre("Jackie Brown");
            f1.setAnnee(1997L);
            f1.setSynopsis("Jacqueline « Jackie » Brown (Pam Grier) est une hôtesse de l'air dans une petite compagnie mexicaine. Pour arrondir ses fins de mois, elle sert de passeuse du Mexique aux États-Unis pour un trafiquant d'armes, Ordell Robbie (Samuel L. Jackson).");
            f1.setGenreDuFilm(g);// Genre
            g.getFilmDuGenre().add(f1);
            f1.setPaysDOrigineDuFilm(p);// Pays          
            p.getFilmDuPays().add(f1);
            f1.getRealisateurDuFilm().add(r);// Réal
            r.getFilmDeRealisateur().add(f1);
            fServ.ajouter(f1);
        }
        {
            Genre g = gServ.rechercherParId(2L);
            Pays p = pServ.rechercherParId(2L);
            Realisateur r = rServ.rechercherParId(4L);

            Film f1 = new Film();
            f1.setId(5L);
            f1.setTitre("Sin City");
            f1.setAnnee(2005L);
            f1.setSynopsis("Sin City est une ville infestée de criminels, de flics ripoux et de femmes fatales. Hartigan s'est juré de protéger Nancy, une strip-teaseuse qui l'a fait craquer. ");
            f1.setGenreDuFilm(g);// Genre
            g.getFilmDuGenre().add(f1);
            f1.setPaysDOrigineDuFilm(p);// Pays          
            p.getFilmDuPays().add(f1);
            f1.getRealisateurDuFilm().add(r);// Réal
            r.getFilmDeRealisateur().add(f1);
            fServ.ajouter(f1);
        }
        {
            Genre g = gServ.rechercherParId(2L);
            Pays p = pServ.rechercherParId(5L);
            Realisateur r = rServ.rechercherParId(3L);

            Film f1 = new Film();
            f1.setId(6L);
            f1.setTitre("Bad Taste");
            f1.setAnnee(1987L);
            f1.setSynopsis("Une petite ville côtière de Nouvelle-Zélande est le théâtre d'une invasion extraterrestre : les aliens ont effet décidé d'utiliser les habitants comme viande de première qualité pour leur fast-food spatial...");
            f1.setGenreDuFilm(g);// Genre
            g.getFilmDuGenre().add(f1);
            f1.setPaysDOrigineDuFilm(p);// Pays          
            p.getFilmDuPays().add(f1);
            f1.getRealisateurDuFilm().add(r);// Réal
            r.getFilmDeRealisateur().add(f1);
            fServ.ajouter(f1);
        }
        {
            Genre g = gServ.rechercherParId(2L);
            Pays p = pServ.rechercherParId(5L);
            Realisateur r = rServ.rechercherParId(3L);

            Film f1 = new Film();
            f1.setId(7L);
            f1.setTitre("Brainded");
            f1.setAnnee(1992L);
            f1.setSynopsis("Lionel Cosgrove, un jeune homme timide flanqué d'une mère envahissante fait la connaissance de la belle Paquita, dont il tombe amoureux. Ce qui n'est pas du goût de sa chère maman, bien décidée à gâcher cette relation. ");
            f1.setGenreDuFilm(g);// Genre
            g.getFilmDuGenre().add(f1);
            f1.setPaysDOrigineDuFilm(p);// Pays          
            p.getFilmDuPays().add(f1);
            f1.getRealisateurDuFilm().add(r);// Réal
            r.getFilmDeRealisateur().add(f1);
            fServ.ajouter(f1);
        }
        {
            Genre g = gServ.rechercherParId(2L);
            Pays p = pServ.rechercherParId(5L);
            Realisateur r = rServ.rechercherParId(3L);

            Film f1 = new Film();
            f1.setId(8L);
            f1.setTitre("Le Hobbit");
            f1.setAnnee(2015L);
            f1.setSynopsis("Dans UN VOYAGE INATTENDU, Bilbon Sacquet cherche à reprendre le Royaume perdu des Nains d'Erebor, conquis par le redoutable dragon Smaug.");
            f1.setGenreDuFilm(g);// Genre
            g.getFilmDuGenre().add(f1);
            f1.setPaysDOrigineDuFilm(p);// Pays          
            p.getFilmDuPays().add(f1);
            f1.getRealisateurDuFilm().add(r);// Réal
            r.getFilmDeRealisateur().add(f1);
            fServ.ajouter(f1);
        }
        {
            Genre g = gServ.rechercherParId(3L);
            Pays p = pServ.rechercherParId(1L);
            Realisateur r = rServ.rechercherParId(5L);

            Film f1 = new Film();
            f1.setId(9L);
            f1.setTitre("Polisse");
            f1.setAnnee(2011L);
            f1.setSynopsis("Le quotidien des policiers de la BPM (Brigade de Protection des Mineurs) ce sont les gardes à vue de pédophiles, les arrestations de pickpockets mineurs mais aussi la pause déjeuner où l’on se raconte ses problèmes de couple ;");
            f1.setGenreDuFilm(g);// Genre
            g.getFilmDuGenre().add(f1);
            f1.setPaysDOrigineDuFilm(p);// Pays          
            p.getFilmDuPays().add(f1);
            f1.getRealisateurDuFilm().add(r);// Réal
            r.getFilmDeRealisateur().add(f1);
            fServ.ajouter(f1);
        }
        {
            Genre g = gServ.rechercherParId(6L);
            Pays p = pServ.rechercherParId(2L);
            Realisateur r = rServ.rechercherParId(1L);
            Realisateur r2 = rServ.rechercherParId(2L);

            Film f1 = new Film();
            f1.setId(10L);
            f1.setTitre("Big Lebowski");
            f1.setAnnee(1998L);
            f1.setSynopsis("Jeff Lebowski, prénommé le Duc, est un paresseux qui passe son temps à boire des coups avec son copain Walter et à jouer au bowling, jeu dont il est fanatique. Un jour deux malfrats le passent à tabac.");
            f1.setGenreDuFilm(g);// Genre
            g.getFilmDuGenre().add(f1);
            f1.setPaysDOrigineDuFilm(p);// Pays          
            p.getFilmDuPays().add(f1);
            f1.getRealisateurDuFilm().add(r);// Réal
            r.getFilmDeRealisateur().add(f1);
            f1.getRealisateurDuFilm().add(r2);// Réal
            r2.getFilmDeRealisateur().add(f1);
            fServ.ajouter(f1);
        }
        {
            Genre g = gServ.rechercherParId(6L);
            Pays p = pServ.rechercherParId(2L);
            Realisateur r = rServ.rechercherParId(1L);
            Realisateur r2 = rServ.rechercherParId(2L);

            Film f1 = new Film();
            f1.setId(11L);
            f1.setTitre("Ave Cesar");
            f1.setAnnee(2016L);
            f1.setSynopsis("La folle journée d’Eddie Mannix va nous entraîner dans les coulisses d’un grand studio Hollywoodien.");
            f1.setGenreDuFilm(g);// Genre
            g.getFilmDuGenre().add(f1);
            f1.setPaysDOrigineDuFilm(p);// Pays          
            p.getFilmDuPays().add(f1);
            f1.getRealisateurDuFilm().add(r);// Réal
            r.getFilmDeRealisateur().add(f1);
            f1.getRealisateurDuFilm().add(r2);// Réal
            r2.getFilmDeRealisateur().add(f1);
            fServ.ajouter(f1);
        }
        
        

        {
            Serie s1 = new Serie();
            s1.setTitre("Dexter");
            Pays p = pServ.rechercherParId(2L);
            s1.setPaysDOrigineDeLaSerie(p);
            s1.setId(1L);
            s1.setSynopsis("Expert en médecine légale spécialisé dans l'analyse de traces de sang dans la police le jour, tueur en série la nuit, Dexter Morgan n'est pas exactement un citoyen américain comme les autres");
            seServ.ajouter(s1);

            for (int s = 1; s < 9; s++) {
                long sint = s;
                Saison saison = new Saison();
                saison.setId(sint);
                saison.setNumSaison(sint);
                saison.setAnnee(2000 + sint);
                saison.setSerieDeLaSaison(s1);
                saServ.ajouter(saison);
                for (int e = 1; e <= s; e++) {
                    long eint = e;
                    Episode episode = new Episode();
                    episode.setNumEpisode(eint);
                    episode.setSaisonDeLEpisode(saison);
                    saison.getEpisodeDeLaSaison().add(episode);
                    eServ.ajouter(episode);
                    for (int l = 1; l<=s; l++) {
                        Lien lien = new Lien();
                        lien.setUrl(" " + l);
                        lien.setEpisodeDuLien(episode);
                        episode.getLienDeLEpisode().add(lien);
                        lserv.ajouter(lien);
                    }
                }
            }

        }
    }
 @Test

    public void testFilmOrdreChrono() {

        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Collection<Film> films = em.createQuery("SELECT f FROM Film f ORDER BY f.annee").getResultList();
        films.size();
        for (Film f : films) {
            System.out.println(f.getTitre());
        }
    }

    //   @Test
    public void testAssert() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Collection<Genre> genres = em.createQuery("SELECT g FROM Genre g").getResultList();
        Assert.assertEquals(6, genres.size());

    }

//    @Test
    public void testAssertNBgenre() {

        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Long nbGenre = (Long) em.createQuery("SELECT COUNT(g) FROM Genre g").getSingleResult();

        Assert.assertTrue(nbGenre == 6L);

    }

    //@Test
    public void testFilmFrancais() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        List<Film> films = em.createQuery("SELECT f FROM Film f JOIN f.pays p WHERE p.nom = 'FRANCE'").getResultList();
        Assert.assertEquals(1, films.size());
    }

    //@Test
    public void testFilmFantasOrdreAlpha() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Collection<Film> films = em.createQuery("SELECT f FROM Film f JOIN f.genreDuFilm g WHERE g.nom = 'Fantastique' ORDER BY f.titre").getResultList();
        for (Film f : films) {
            System.out.println(f.getTitre());
        }
    }
    //  @Test

    public void testSansJoin() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Collection<Film> films = em.createQuery("SELECT f FROM Film f WHERE f.genreDuFilm.nom = 'Fantastique' ORDER BY f.titre").getResultList();
        for (Film f : films) {
            System.out.println(f.getTitre());
        }

    }

    //  @Test
    public void testFilmActionFrereCoen() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Collection<Film> films = em.createQuery("SELECT f FROM Film f JOIN f.realisateurDuFilm r JOIN f.genreDuFilm g WHERE (g.nom = 'Comedie') AND (r.nom = 'Coen') ORDER BY f.annee").getResultList();
        for (Film f : films) {
            System.out.println(f.getTitre());
        }

    }

    // @Test
    public void testFilmAutreACtion() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Collection<Film> films = em.createQuery("SELECT f FROM Film f JOIN f.genreDuFilm g WHERE (g.nom <> 'Action')").getResultList();
        for (Film f : films) {
            System.out.println(f.getTitre());
        }

    }

    //@Test
    public void testNbrFilmNZPasFantastik() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Collection<Film> films = em.createQuery("SELECT f FROM Film f JOIN f.genreDuFilm g JOIN f.paysDOrigineDuFilm p WHERE (p.nom = 'Nouvelle-Zelande') AND (g.nom <> 'Fantastique')").getResultList();

        System.out.println(films.size());

    }

    //@Test
    public void testNbrFilmNZFantastikPeterJackson() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Long l = (Long) em.createQuery("SELECT COUNT (f) FROM Film f JOIN f.genreDuFilm g JOIN f.paysDOrigineDuFilm p JOIN f.realisateurDuFilm r WHERE (p.nom = 'Nouvelle-Zelande') AND (g.nom = 'Fantastique')  AND (r.nom = 'Jackson')").getSingleResult();

        System.out.println(l);

    }

    // @Test
    public void testFilmRéaliséParDeuxFreresCoen10() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();

        Collection<Film> films = em.createQuery("SELECT f FROM Film f JOIN f.realisateurDuFilm r WHERE (r.nom = 'Coen') AND (r.prenom = 'Joel')INTERSECT SELECT f FROM Film f JOIN f.realisateurDuFilm r WHERE (r.nom = 'Coen') AND (r.prenom = 'Ethan')").getResultList();
        for (Film f : films) {
            System.out.println(f.getTitre());
        }

    }

    //@Test
    public void filmsParFreresCoen2() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        List<Film> filmsCoen = em.createQuery("SELECT f FROM Film f WHERE f.id IN (SELECT f.id FROM Film f JOIN f.realisateurDuFilm r WHERE r.prenom = 'Ethan') AND f.id IN (SELECT f.id FROM Film f JOIN f.realisateurDuFilm r WHERE r.prenom = 'Joel') ").getResultList();
        for (Film f : filmsCoen) {
            System.out.println(f.getTitre());
        }
    }

    // @Test
    public void testFilmLeplusancienPeterJackson11() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        List<Film> films = em.createQuery("SELECT f FROM Film f JOIN f.realisateurDuFilm r WHERE (r.nom = 'Jackson') ORDER BY f.annee").getResultList();
        System.out.println(films.get(0).getTitre());

    }

    //@Test
    public void testMoyenneAnnéeProd12() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Double l = (Double) em.createQuery("SELECT AVG (f.annee) FROM Film f").getSingleResult();
        System.out.println(l);

    }

    //@Test
    public void testListPourChaqRealNbrFilmTriéParOR13() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Collection<Object[]> films = em.createQuery("SELECT r, COUNT(f) AS total FROM Realisateur r JOIN r.filmDeRealisateur f GROUP BY r ORDER BY total ").getResultList();
        for (Object[] tabobjet : films) {
            Realisateur r = (Realisateur) tabobjet[0];
            Long nombre = (Long) tabobjet[1];
            System.out.println(r.getNom() + " " + r.getPrenom() + " : " + nombre);

        }

    }

}
