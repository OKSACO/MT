package berger.levrault.Compteur;

import javax.persistence.*;

/**
 * Created by abdelhamid on 26/02/15.
 */


@SuppressWarnings("serial")
@Entity
@Table(name = "compteur")
@NamedQueries({
        @NamedQuery(name = Compteur.FIND_ALL, query = "select a from Compteur a ")
})
public class Compteur {

    public static final String FIND_ALL = "Compteur.findAll";

    @Id
    private long numeroContrat ;
    private String region ;
    @Column(name = "nom_point_du_vente")
    private String nomPointDuVente ;
    @Column(name = "nom_client")
    private String nomClient ;
    @Column(name = "date_abonnement")
    private String dateAbonnement ;
    @Column(name = "charge_abonnemet")
    private int chargeAbonnemet ;
    @Column(name = "charge_transmission_normal")
    private int chargeTransmissionNormal ;
    @Column(name = "secteur_activite")
    private String secteurActivite ;
    @Column(name = "libelle_activite")
    private String libelleActivite ;


    public Compteur() {
    }


    public long getNumeroContrat() {
        return numeroContrat;
    }

    public void setNumeroContrat(long numeroContrat) {
        this.numeroContrat = numeroContrat;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getNomPointDuVente() {
        return nomPointDuVente;
    }

    public void setNomPointDuVente(String nomPointDuVente) {
        this.nomPointDuVente = nomPointDuVente;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getDateAbonnement() {
        return dateAbonnement;
    }

    public void setDateAbonnement(String dateAbonnement) {
        this.dateAbonnement = dateAbonnement;
    }

    public int getChargeAbonnemet() {
        return chargeAbonnemet;
    }

    public void setChargeAbonnemet(int chargeAbonnemet) {
        this.chargeAbonnemet = chargeAbonnemet;
    }

    public int getChargeTransmissionNormal() {
        return chargeTransmissionNormal;
    }

    public void setChargeTransmissionNormal(int chargeTransmissionNormal) {
        this.chargeTransmissionNormal = chargeTransmissionNormal;
    }

    public String getLibelleActivite() {
        return libelleActivite;
    }

    public void setLibelleActivite(String libelleActivite) {
        this.libelleActivite = libelleActivite;
    }
}
