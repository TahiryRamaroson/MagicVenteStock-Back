package com.kili.magicventestock.metier.metierServices.clientsServices;

import org.springframework.stereotype.Service;

import com.kili.magicventestock.metier.model.Client;
import com.kili.magicventestock.metier.model.ClientRepository;

@Service
public class ClientsManagerImpl implements ClientsManager {

    private final ClientRepository clientsRepository;

    public ClientsManagerImpl(ClientRepository clientsRepository) {
        this.clientsRepository = clientsRepository;
    }

    @Override
    public Client rechercherClientParPseudo(String pseudo, String motDePasse) {
        return clientsRepository.findByPseudoAndMotDePasse(pseudo, motDePasse).orElse(null);    
    } 
    
}
