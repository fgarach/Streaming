/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.entity;

import java.io.Serializable;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author admin
 * entité réalisateur
 */
@Entity
public class Realisateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToMany(mappedBy="realisateurDuFilm")
    private List<Film> filmDeRealisateur = new ArrayList<Film>();
    
    private String nom;
    
    private String prenom;

    public List<Film> getFilmDeRealisateur() {
        return filmDeRealisateur;
    }

    public void setFilmDeRealisateur(List<Film> filmDeRealisateur) {
        this.filmDeRealisateur = filmDeRealisateur;
    }
    
        public void setNom(String nom)
    {
        this.nom = nom;
    }
    
     public String getNom()
    {
        return nom;
    }

        public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }
 
    public String getPrenom()
    {
        return prenom;
    }
    
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Realisateur)) {
            return false;
        }
        Realisateur other = (Realisateur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "streaming.entity.Realisateur[ id=" + id + " ]";
    }
    
}
