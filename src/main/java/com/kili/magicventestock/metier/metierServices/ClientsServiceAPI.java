package com.kili.magicventestock.metier.metierServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kili.magicventestock.metier.metierServices.clientsServices.ClientsManager;
import com.kili.magicventestock.metier.model.Client;
import com.kili.magicventestock.metier.model.ClientRequest;

@RestController
@RequestMapping("/clients")
public class ClientsServiceAPI {
    com.kili.magicventestock.metier.metierServices.clientsServices.ClientsManager clientsManager;

    @Autowired
    public ClientsServiceAPI(ClientsManager clientsManager) {
        this.clientsManager = clientsManager;
    }

    @PostMapping("/identification")
    public Client rechercherClientParPseudo(@RequestBody ClientRequest clientRequest) {
        return clientsManager.rechercherClientParPseudo(clientRequest.getPseudo(), clientRequest.getMotDePasse());
    }
}
