package streaming.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import streaming.entity.Genre;
import streaming.entity.Lien;
import streaming.entity.Pays;
import streaming.entity.Realisateur;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-02-23T16:11:22")
@StaticMetamodel(Film.class)
public class Film_ { 

    public static volatile ListAttribute<Film, Realisateur> listeRealisateurs;
    public static volatile SingularAttribute<Film, String> titre;
    public static volatile ListAttribute<Film, Lien> listeLiens;
    public static volatile SingularAttribute<Film, Genre> genre;
    public static volatile SingularAttribute<Film, Long> id;
    public static volatile SingularAttribute<Film, Long> annee;
    public static volatile SingularAttribute<Film, String> synopsis;
    public static volatile SingularAttribute<Film, Pays> pays;

}