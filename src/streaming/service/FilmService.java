/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.FilmDAO;
import streaming.entity.Film;
import streaming.exception.SynopsisVideOuNullException;

/**
 *
 * @author admin
 */
public class FilmService {

    private FilmDAO fDao = new FilmDAO();

    private boolean SynopsysEstNulOuVide(Film f) {

        boolean videOuNull = false;

        if (f.getSynopsis() == null || f.getSynopsis().isEmpty()) {
            videOuNull = true;
        }

        return videOuNull;
    }

    public void ajouter(Film f) throws SynopsisVideOuNullException {
        if (SynopsysEstNulOuVide(f)) {
            throw new SynopsisVideOuNullException();
        }

        f.setTitre(f.getTitre().replaceAll("zut", "flute"));

        f.setSynopsis(f.getSynopsis().replaceAll("zut", "flute"));

        //fDao.ajouter(f);
    }

    public void supprimer(Long id) {
        fDao.supprimer(id);
    }

    public void modifier(Film f) {
        fDao.modifier(f);

    }

    public Film rechercherParId(Long id) {
        return fDao.rechercherParId(id);
    }

    public List<Film> listerTous() {
        return fDao.listerTous();

    }

    public List<Film> listerParGenre(Long idGenre) {
        return fDao.listerParGenre(idGenre);
    }

    public List<Film> listerParPays(Long idPpays) {
        return fDao.listerParPays(idPpays);
    }

    public List<Film> listerParTitreOuReal(String str) {
        return fDao.listerParTitreOuReal(str);
    }

}
