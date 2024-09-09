package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Auteur;
import com.example.repository.AuteurRepository;

@Service
public class AuteurService {
    
    @Autowired
    private AuteurRepository auteurRepository;
    
    public Auteur ajouterAuteur(Auteur auteur) {
        return auteurRepository.save(auteur);
    }

    public Auteur modifierAuteur(Auteur auteur) {
        return auteurRepository.save(auteur);
    }

    public void supprimerAuteur(Long id) {
        auteurRepository.deleteById(id);
    }

    public List<Auteur> listerAuteurs() {
        return auteurRepository.findAll();
    }
}

