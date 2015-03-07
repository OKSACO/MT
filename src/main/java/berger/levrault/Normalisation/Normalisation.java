package berger.levrault.Normalisation;

import javax.persistence.*;

/**
 * Created by abdelhamid on 27/02/15.
 */

@SuppressWarnings("serial")
@Entity
@Table(name = "normalisation")
public class Normalisation {

    public static final String FIND_ALL = "Account.findAll";


    @Id
    @GeneratedValue
    private int idNormalisation ;

    @Column(name = "libelle_normalisation")
    private String libelleNormalisation ;


    public int getIdNormalisation() {
        return idNormalisation;
    }

    public void setIdNormalisation(int idNormalisation) {
        this.idNormalisation = idNormalisation;
    }

    public String getLibelleNormalisation() {
        return libelleNormalisation;
    }

    public void setLibelleNormalisation(String libelleNormalisation) {
        this.libelleNormalisation = libelleNormalisation;
    }

    public Normalisation() {
    }
}
