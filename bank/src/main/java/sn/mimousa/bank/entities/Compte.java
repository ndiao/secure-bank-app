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

}
