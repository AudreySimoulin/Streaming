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
public class Saison implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long numeroSaison;
    private Long anneeSortie;

    @ManyToOne
    @JoinColumn(name = "SERIE_ID")
    private Serie serie;

    @OneToMany(mappedBy = "saison")
    private List<Episode> listeEpisodes = new ArrayList<Episode>();

    public Long getNumeroSaison() {
        return numeroSaison;
    }

    public void setNumeroSaison(Long numeroSaison) {
        this.numeroSaison = numeroSaison;
    }

    public Long getAnneeSortie() {
        return anneeSortie;
    }

    public void setAnneeSortie(Long anneeSortie) {
        this.anneeSortie = anneeSortie;
    }

    public List<Episode> getListeEpisodes() {
        return listeEpisodes;
    }

    public void setListeEpisodes(List<Episode> listeEpisodes) {
        this.listeEpisodes = listeEpisodes;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
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
        if (!(object instanceof Saison)) {
            return false;
        }
        Saison other = (Saison) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "streaming.entity.Saison[ id=" + id + " ]";
    }

}
