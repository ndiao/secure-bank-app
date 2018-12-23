package sn.mimousa.bank.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Titulaire implements Serializable {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String prenom;
    private String nom;
    private String email;
    private String tel;
    private String adresse;
    @OneToMany(mappedBy = "client")
    private List<Compte> comptes;
}
