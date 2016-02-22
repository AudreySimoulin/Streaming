/*
Je suis passée par ici ^^ 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Entité gérant les films 
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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author admin
 */
@Entity
public class Film implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String titre;
    private Long annee;
    private String synopsis;

    @ManyToOne
    @JoinColumn(name = "GENRE_ID")
    private Genre genre;

    @ManyToOne
    @JoinColumn(name = "PAYS_ID")
    private Pays pays;

    @ManyToMany
    @JoinTable(name = "FILM_REAL")
    private List<Realisateur> listeRealisateurs = new ArrayList<Realisateur>();

    @OneToMany(mappedBy = "film")
    private List<Lien> listeLiens = new ArrayList<Lien>();

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public List<Realisateur> getListeRealisateurs() {
        return listeRealisateurs;
    }

    public void setListeRealisateurs(List<Realisateur> listeRealisateurs) {
        this.listeRealisateurs = listeRealisateurs;
    }

    public List<Lien> getListeLiens() {
        return listeLiens;
    }

    public void setListeLiens(List<Lien> listeLiens) {
        this.listeLiens = listeLiens;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Long getAnnee() {
        return annee;
    }

    public void setAnnee(Long annee) {
        this.annee = annee;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
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
