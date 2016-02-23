package streaming.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import streaming.entity.Episode;
import streaming.entity.Film;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-02-23T16:11:22")
@StaticMetamodel(Lien.class)
public class Lien_ { 

    public static volatile SingularAttribute<Lien, Episode> episode;
    public static volatile SingularAttribute<Lien, Long> id;
    public static volatile SingularAttribute<Lien, Film> film;
    public static volatile SingularAttribute<Lien, String> url;

}