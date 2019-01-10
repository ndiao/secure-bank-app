package sn.mimousa.bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sn.mimousa.bank.entities.Compte;

import java.util.List;

public interface CompteRepository extends JpaRepository<Compte, String> {

}
