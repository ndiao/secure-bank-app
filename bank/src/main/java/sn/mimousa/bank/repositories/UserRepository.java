package sn.mimousa.bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.mimousa.bank.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    User getById(Long id);
}
