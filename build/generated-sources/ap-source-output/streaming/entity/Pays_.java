package streaming.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import streaming.entity.Film;
import streaming.entity.Serie;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-02-24T14:34:32")
@StaticMetamodel(Pays.class)
public class Pays_ { 

    public static volatile ListAttribute<Pays, Serie> serieDuPays;
    public static volatile ListAttribute<Pays, Film> filmDuPays;
    public static volatile SingularAttribute<Pays, Long> id;
    public static volatile SingularAttribute<Pays, String> nom;

}