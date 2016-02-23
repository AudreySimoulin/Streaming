package streaming.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import streaming.entity.Lien;
import streaming.entity.Saison;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-02-23T16:11:22")
@StaticMetamodel(Episode.class)
public class Episode_ { 

    public static volatile SingularAttribute<Episode, Long> numeroSaison;
    public static volatile SingularAttribute<Episode, Saison> saison;
    public static volatile SingularAttribute<Episode, String> titreEpisode;
    public static volatile ListAttribute<Episode, Lien> listeLiens;
    public static volatile SingularAttribute<Episode, Long> id;

}