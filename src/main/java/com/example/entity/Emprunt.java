package com.example.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Livre livre;
    
    private String utilisateur;
    
    private LocalDate dateEmprunt;
    
    private LocalDate dateRetour;

	public Emprunt() {
		super();
	}

	public Emprunt(Livre livre, String utilisateur, LocalDate dateEmprunt, LocalDate dateRetour) {
		super();
		this.livre = livre;
		this.utilisateur = utilisateur;
		this.dateEmprunt = dateEmprunt;
		this.dateRetour = dateRetour;
	}

	public Emprunt(Long id, Livre livre, String utilisateur, LocalDate dateEmprunt, LocalDate dateRetour) {
		super();
		this.id = id;
		this.livre = livre;
		this.utilisateur = utilisateur;
		this.dateEmprunt = dateEmprunt;
		this.dateRetour = dateRetour;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Livre getLivre() {
		return livre;
	}

	public void setLivre(Livre livre) {
		this.livre = livre;
	}

	public String getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(String utilisateur) {
		this.utilisateur = utilisateur;
	}

	public LocalDate getDateEmprunt() {
		return dateEmprunt;
	}

	public void setDateEmprunt(LocalDate dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	public LocalDate getDateRetour() {
		return dateRetour;
	}

	public void setDateRetour(LocalDate dateRetour) {
		this.dateRetour = dateRetour;
	}

    
}
