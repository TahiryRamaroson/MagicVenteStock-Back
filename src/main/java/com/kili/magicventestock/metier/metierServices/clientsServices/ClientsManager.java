package com.kili.magicventestock.metier.metierServices.clientsServices;

import com.kili.magicventestock.metier.model.Client;

public interface ClientsManager { 
    Client rechercherClientParPseudo(String pseudo, String motDePasse);
}
