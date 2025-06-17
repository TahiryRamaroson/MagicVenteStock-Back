package com.kili.magicventestock.metier.metierServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kili.magicventestock.metier.metierServices.produitsServices.ProduitsManager;
import com.kili.magicventestock.metier.model.Produit;

@RestController
@RequestMapping("/produits")
public class ProduitsServiceAPI {
    ProduitsManager produitsManager;

    @Autowired
    public ProduitsServiceAPI(ProduitsManager produitsManager) {
        this.produitsManager = produitsManager;
    }

    @GetMapping("/du-jour")
    public Produit rechercherProduitDujour() {
        return produitsManager.rechercherProduitDujour();
    }
}
