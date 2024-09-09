package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.Livre;
import com.example.service.LivreService;

@Controller
@RequestMapping("api/livres")
public class LivreController {
	@Autowired
	private LivreService livreService;
	
	
	@PostMapping("/addLivre")
	public Livre ajouterLivre(@RequestBody Livre livre) {
	    return livreService.ajouterLivre(livre);
	}

	@PutMapping("/editLivre")
	 public Livre modifierLivre(@PathVariable Long id, @RequestBody Livre livre) {
        return livreService.modifierLivre(id, livre);
    }

	@DeleteMapping("/supprimerLivre")
	public void supprimerLivre(@PathVariable Long id) {
	    livreService.supprimerLivre(id);
	}

	@GetMapping("/listeLivres")
	public List<Livre> listerLivres() {
	    return livreService.listerLivres();
	}

}
