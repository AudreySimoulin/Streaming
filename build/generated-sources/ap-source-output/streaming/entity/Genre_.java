package streaming.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import streaming.entity.Film;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-02-24T13:55:00")
@StaticMetamodel(Genre.class)
public class Genre_ { 

    public static volatile SingularAttribute<Genre, Long> id;
    public static volatile SingularAttribute<Genre, String> nom;
    public static volatile ListAttribute<Genre, Film> listeFilmsParGenre;

}