package sn.mimousa.bank.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "CE")
public class CompteEpargne extends Compte {
    private float taux;
}
