package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Livre;

@Repository
public interface LivreRepository extends JpaRepository<Livre, Long> {
    
}

