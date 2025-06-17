package com.kili.magicventestock.metier.model;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ProduitRepository extends JpaRepository<Produit, String> {
    Optional<Produit> findByestDuJourTrue(); 
}