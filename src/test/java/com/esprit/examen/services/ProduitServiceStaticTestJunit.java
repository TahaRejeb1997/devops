package com.esprit.examen.services;

import com.esprit.examen.entities.CategorieProduit;
import com.esprit.examen.entities.Produit;
import com.esprit.examen.repositories.ProduitRepository;
import com.esprit.examen.services.IProduitService;
import com.esprit.examen.services.ProduitServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
@Transactional
public class ProduitServiceStaticTestJunit {
    @Autowired
    private ProduitServiceImpl produitService;

    @Autowired
    private ProduitRepository produitRepository;

    @BeforeEach
    public void setUp() {
        // Add any necessary setup here
        // For example, you can create some sample data for testing

        Produit produit1 = new Produit();
        produit1.setCodeProduit("P1");
        produit1.setLibelleProduit("Product 1");
        produit1.setCategorieProduit(new CategorieProduit());
        produit1.setPrix(100); // Set the price
        produitService.addProduit(produit1);

        Produit produit2 = new Produit();
        produit2.setCodeProduit("P2");
        produit2.setLibelleProduit("Product 2");
        produit2.setCategorieProduit(new CategorieProduit());
        produit2.setPrix(150); // Set the price
        produitService.addProduit(produit2);
    }

    @Test
    public void testRetrieveAllProduits() {
        List<Produit> produits = produitService.retrieveAllProduits();

        // Add assertions to verify the results
        assertNotNull(produits);
        assertEquals(2, produits.size());
    }

    @Test
    public void testAddProduit() {
        Produit produit = new Produit();
        produit.setCodeProduit("P3");
        produit.setLibelleProduit("Product 3");
        produit.setCategorieProduit(new CategorieProduit());
        produit.setPrix(120); // Set the price

        // Call the method you want to test
        Produit addedProduit = produitService.addProduit(produit);

        // Verify that the Produit was saved and returned correctly
        assertNotNull(addedProduit.getIdProduit());
    }

    @Test
    public void testUpdateProduit() {
        Produit produit = produitRepository.findByCodeProduit("P1"); // Assuming a method to find by code exists

        // Modify the Produit object
        produit.setLibelleProduit("Updated Product 1");

        // Call the method you want to test
        Produit updatedProduit = produitService.updateProduit(produit);

        // Verify that the Produit was updated correctly
        assertEquals("Updated Product 1", updatedProduit.getLibelleProduit());
    }

    @Test
    public void testDeleteProduit() {
        Produit produit = produitRepository.findByCodeProduit("P2"); // Assuming a method to find by code exists

        // Call the method you want to test
        produitService.deleteProduit(produit.getIdProduit());

        // Verify that the Produit with the specified ID was deleted
        Produit deletedProduit = produitService.retrieveProduit(produit.getIdProduit());
        assertNull(deletedProduit);
    }

    @Test
    public void testRetrieveProduit() {
        Produit produit = produitRepository.findByCodeProduit("P1"); // Assuming a method to find by code exists

        // Call the method you want to test
        Produit retrievedProduit = produitService.retrieveProduit(produit.getIdProduit());

        // Verify that the correct Produit was retrieved
        assertNotNull(retrievedProduit);
        assertEquals("P1", retrievedProduit.getCodeProduit());
    }
}
