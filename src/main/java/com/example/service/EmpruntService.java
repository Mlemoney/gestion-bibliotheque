package com.example.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Emprunt;
import com.example.entity.ResourceNotFoundException;
import com.example.repository.EmpruntRepository;

@Service
public class EmpruntService {
    
    @Autowired
    private EmpruntRepository empruntRepository;
    
    public Emprunt ajouterEmprunt(Emprunt emprunt) {
        return empruntRepository.save(emprunt);
    }

    public Emprunt rendreLivre(Long id) {
        Emprunt emprunt = empruntRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Emprunt non trouvé"));
        emprunt.setDateRetour(LocalDate.now());
        return empruntRepository.save(emprunt);
    }

    public List<Emprunt> listerEmprunts() {
        return empruntRepository.findAll();
    }
}

