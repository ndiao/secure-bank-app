package sn.mimousa.bank.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue(value = "CE")
public class CompteEpargne extends Compte {
    private float taux;

    public CompteEpargne(String numero, float solde, Date dateOuverture, boolean ouvert, Titulaire client, float taux) {
        super(numero, solde, dateOuverture, ouvert, client);
        this.taux = taux;
    }

    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }
}
