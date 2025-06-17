package com.kili.magicventestock.metier.metierServices.produitsServices;

import org.springframework.stereotype.Service;

import com.kili.magicventestock.metier.model.Produit;
import com.kili.magicventestock.metier.model.ProduitRepository;

@Service
public class ProduitsManagerImpl implements ProduitsManager {

    private final ProduitRepository produitRepository;

    public ProduitsManagerImpl(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @Override
    public Produit rechercherProduitDujour() {
        return produitRepository.findByestDuJourTrue().orElse(null);    
    } 
    
}
