package streaming.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import streaming.entity.Film;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-02-22T09:56:45")
@StaticMetamodel(Realisateur.class)
public class Realisateur_ { 

    public static volatile ListAttribute<Realisateur, Film> listeFilmsParRealisateur;
    public static volatile SingularAttribute<Realisateur, Long> id;
    public static volatile SingularAttribute<Realisateur, String> nom;
    public static volatile SingularAttribute<Realisateur, String> prenom;

}