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
    @Column(updatable = true, unique = true)
    private String email;
    @Column(updatable = true, unique = true)
    private String tel;
    private String adresse;
    @OneToMany(mappedBy = "client")
    private List<Compte> comptes;
}
