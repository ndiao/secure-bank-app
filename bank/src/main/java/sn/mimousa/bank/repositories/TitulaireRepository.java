package sn.mimousa.bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.mimousa.bank.entities.Titulaire;

public interface TitulaireRepository extends JpaRepository<Titulaire, Long> {
}
