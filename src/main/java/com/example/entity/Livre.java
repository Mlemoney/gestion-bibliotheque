package com.example.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String titre;
    
    private Auteur auteur;
    
    private LocalDate datePublication;
    
    private String isbn;
    
    private String genre;

	public Livre() {
		super();
	}

	public Livre(String titre, Auteur auteur, LocalDate datePublication, String isbn, String genre) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.datePublication = datePublication;
		this.isbn = isbn;
		this.genre = genre;
	}

	public Livre(Long id, String titre, Auteur auteur, LocalDate datePublication, String isbn, String genre) {
		super();
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
		this.datePublication = datePublication;
		this.isbn = isbn;
		this.genre = genre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}

	public LocalDate getDatePublication() {
		return datePublication;
	}

	public void setDatePublication(LocalDate datePublication) {
		this.datePublication = datePublication;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

    
    
}