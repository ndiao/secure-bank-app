package sn.mimousa.bank.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "code_user")
    @JsonIgnore
    private User user;

    public Titulaire(){}

    public Titulaire(String prenom, String nom, String email, String tel, String adresse) {
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.tel = tel;
        this.adresse = adresse;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }
}
