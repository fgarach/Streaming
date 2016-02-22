/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author admin
 */
@Entity
public class Serie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @OneToMany(mappedBy = "serieDeLaSaison")
    private List<Saison> saisonDeLaSerie = new ArrayList<Saison>();
    
    @ManyToOne
    @JoinColumn(name = "PAYS_ID")
    private  Pays paysDOrigineDeLaSerie;
    
    private String titre;
    private String synopsis;

    public List<Saison> getSaisonDeLaSerie() {
        return saisonDeLaSerie;
    }

    public void setSaisonDeLaSerie(List<Saison> saisonDeLaSerie) {
        this.saisonDeLaSerie = saisonDeLaSerie;
    }

    public Pays getPaysDOrigineDeLaSerie() {
        return paysDOrigineDeLaSerie;
    }

    public void setPaysDOrigineDeLaSerie(Pays paysDOrigineDeLaSerie) {
        this.paysDOrigineDeLaSerie = paysDOrigineDeLaSerie;
    }

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
        if (!(object instanceof Serie)) {
            return false;
        }
        Serie other = (Serie) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "streaming.entity.Serie[ id=" + id + " ]";
    }
    
}
