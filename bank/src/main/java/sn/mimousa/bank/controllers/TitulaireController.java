package sn.mimousa.bank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sn.mimousa.bank.entities.Titulaire;
import sn.mimousa.bank.repositories.TitulaireRepository;

import java.util.Collection;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class TitulaireController {

    @Autowired
    private TitulaireRepository titulaireRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/titulaires")
    public ResponseEntity<Collection<Titulaire>> getAllTitulaires(){
        return new ResponseEntity<Collection<Titulaire>>(titulaireRepository.findAll(), HttpStatus.OK);
    }
}
