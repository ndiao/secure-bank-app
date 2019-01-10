package sn.mimousa.bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.mimousa.bank.entities.CompteEpargne;

public interface CompteEpargneRepository extends JpaRepository<CompteEpargne, String> {
}
