package sn.mimousa.bank.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue(value = "CC")
public class CompteCourant extends Compte {
    private float decouvert;

    public CompteCourant(String numero, float solde, Date dateOuverture, boolean ouvert, Titulaire client, float decouvert) {
        super(numero, solde, dateOuverture, ouvert, client);
        this.decouvert = decouvert;
    }

    public float getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(float decouvert) {
        this.decouvert = decouvert;
    }
}
