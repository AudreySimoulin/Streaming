package streaming.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import streaming.entity.Film;
import streaming.entity.Serie;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-02-25T10:51:00")
@StaticMetamodel(Pays.class)
public class Pays_ { 

    public static volatile ListAttribute<Pays, Serie> listeSeries;
    public static volatile SingularAttribute<Pays, Long> id;
    public static volatile SingularAttribute<Pays, String> nom;
    public static volatile ListAttribute<Pays, Film> listeFilmsParPays;

}