package sn.mimousa.bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.mimousa.bank.entities.CompteCourant;

public interface CompteCourantRepository extends JpaRepository<CompteCourant, String> {
}
