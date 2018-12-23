package sn.mimousa.bank.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "CC")
public class CompteCourant extends Compte {
    private float decouvert;
}
