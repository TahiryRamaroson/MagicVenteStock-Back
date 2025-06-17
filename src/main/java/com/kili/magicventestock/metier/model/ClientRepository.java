package com.kili.magicventestock.metier.model;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, String> {
    Optional<Client> findByPseudoAndMotDePasse(String pseudo, String motDePasse);
}