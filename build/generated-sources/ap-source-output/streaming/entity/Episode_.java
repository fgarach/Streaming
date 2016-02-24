package streaming.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import streaming.entity.Lien;
import streaming.entity.Saison;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-02-24T16:41:16")
@StaticMetamodel(Episode.class)
public class Episode_ { 

    public static volatile SingularAttribute<Episode, String> titre;
    public static volatile ListAttribute<Episode, Lien> lienDeLEpisode;
    public static volatile SingularAttribute<Episode, Saison> saisonDeLEpisode;
    public static volatile SingularAttribute<Episode, Long> numEpisode;
    public static volatile SingularAttribute<Episode, Long> id;

}