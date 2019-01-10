package sn.mimousa.bank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import sn.mimousa.bank.entities.User;
import sn.mimousa.bank.exceptions.UsernameAlreadyExistException;
import sn.mimousa.bank.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public User saveUser(User newUser){
        try {
            newUser.setPassword(bCryptPasswordEncoder.encode(newUser.getPassword()));
            //S'assurer que le username est unique
            //S'assurer que le mot de passe et celui de confirmation sont identique
            newUser.setConfirmPassword("");
            return userRepository.save(newUser);
        }
        catch (Exception ex){
            throw new UsernameAlreadyExistException("Login "+newUser.getUsername()+" existe déja !!!");
        }
    }
}
