package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Livre;
import com.example.repository.LivreRepository;

@Service
public class LivreService {
    
    @Autowired
    private LivreRepository livreRepository;
    
    public Livre ajouterLivre(Livre livre) {
        return livreRepository.save(livre);
    }

    public Livre modifierLivre(Long id, Livre livre) {  
        Livre livreExistant = livreRepository.findById(id).orElseThrow(() -> new RuntimeException("Livre non trouvé"));  

        livreExistant.setTitre(livre.getTitre());
        livreExistant.setAuteur(livre.getAuteur());
        livreExistant.setDatePublication(livre.getDatePublication());
        livreExistant.setIsbn(livre.getIsbn());
        livreExistant.setGenre(livre.getGenre());

        return livreRepository.save(livreExistant);  
    }

    public void supprimerLivre(Long id) {
        livreRepository.deleteById(id);
    }

    public List<Livre> listerLivres() {
        return livreRepository.findAll();
    }
}

