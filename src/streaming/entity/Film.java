/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * je suis passé par la hahahah
 * @author admin
 */
@Entity
//entité gérant les films bla
public class Film implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "GENRE_ID")
    private  Genre genreDuFilm;
    
    @ManyToOne
    @JoinColumn(name = "PAYS_ID")
    private  Pays paysDOrigineDuFilm;
    
    @OneToMany(mappedBy = "filmDuLien")
    private List<Lien> lienDuFilm = new ArrayList<Lien>();
    
    @ManyToMany 
    @JoinTable(name = "FILM_REALISATEUR")
    private List<Realisateur> realisateurDuFilm = new ArrayList<Realisateur>();
    
    private String titre;
    private String synopsis;
    private Long annee;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Long getAnnee() {
        return annee;
    }

    public void setAnnee(Long annee) {
        this.annee = annee;
    }

    public Genre getGenreDuFilm() {
        return genreDuFilm;
    }

    public void setGenreDuFilm(Genre genreDuFilm) {
        this.genreDuFilm = genreDuFilm;
    }

    public Pays getPaysDOrigineDuFilm() {
        return paysDOrigineDuFilm;
    }

    public void setPaysDOrigineDuFilm(Pays paysDOrigineDuFilm) {
        this.paysDOrigineDuFilm = paysDOrigineDuFilm;
    }

    public List<Lien> getLienDuFilm() {
        return lienDuFilm;
    }

    public void setLienDuFilm(List<Lien> lienDuFilm) {
        this.lienDuFilm = lienDuFilm;
    }

    public List<Realisateur> getRealisateurDuFilm() {
        return realisateurDuFilm;
    }

    public void setRealisateurDuFilm(List<Realisateur> realisateurDuFilm) {
        this.realisateurDuFilm = realisateurDuFilm;
    }
   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Film)) {
            return false;
        }
        Film other = (Film) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "streaming.entity.Film[ id=" + id + " ]";
    }
    
}
