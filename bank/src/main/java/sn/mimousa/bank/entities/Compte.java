package sn.mimousa.bank.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@DiscriminatorColumn(name = "type")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Compte {
    @Id
    protected String numero;
    protected float solde;
    @JsonFormat(pattern = "yyyy-MM-dd")
    protected Date dateOuverture;
    protected boolean ouvert;

    @ManyToOne
    @JoinColumn(name = "code_client")
    private Titulaire client;

    public Compte(){}

    public Compte(String numero, float solde, Date dateOuverture, boolean ouvert, Titulaire client) {
        this.numero = numero;
        this.solde = solde;
        this.dateOuverture = dateOuverture;
        this.ouvert = ouvert;
        this.client = client;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public Date getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(Date dateOuverture) {
        this.dateOuverture = dateOuverture;
    }

    public boolean isOuvert() {
        return ouvert;
    }

    public void setOuvert(boolean ouvert) {
        this.ouvert = ouvert;
    }

    public Titulaire getClient() {
        return client;
    }

    public void setClient(Titulaire client) {
        this.client = client;
    }
}
