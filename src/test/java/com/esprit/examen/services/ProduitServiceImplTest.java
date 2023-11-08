//package com.esprit.examen.services;
//
//import com.esprit.examen.entities.Produit;
//import com.esprit.examen.repositories.CategorieProduitRepository;
//import com.esprit.examen.repositories.ProduitRepository;
//import com.esprit.examen.repositories.StockRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@ExtendWith(MockitoExtension.class)
//public class ProduitServiceImplTest {
//
//    @InjectMocks
//    private ProduitServiceImpl produitService;
//
//    @Mock
//    private ProduitRepository produitRepository;
//
//
//    @Mock
//    private CategorieProduitRepository categorieProduitRepository;
//
//
//    @Test
//    public void testRetrieveAllProduits() {
//        // Define the behavior of the mock repository when findAll is called
//        List<Produit> produits = new ArrayList<>();
//        Mockito.when(produitService.retrieveAllProduits()).thenReturn(produits);
//
//        // Now you can call the method you want to test
//        List<Produit> result = produitService.retrieveAllProduits();
//
//        // Add assertions to verify the results
//        assertEquals(produits.size(), result.size());
//    }
//
//    @Test
//    public void testAddProduit() {
//        Produit produit = new Produit(/* provide constructor arguments */);
//
//        // Simulate the behavior of the ProduitRepository when saving
//        Mockito.when(produitRepository.save(produit)).thenReturn(produit);
//
//        // Call the method you want to test
//        Produit addedProduit = produitService.addProduit(produit);
//
//        // Verify that the Produit was saved and returned correctly
//        assertEquals(produit, addedProduit);
//    }
//
//    @Test
//    public void testUpdateProduit() {
//        Produit produit = new Produit(/* provide constructor arguments */);
//
//        // Simulate the behavior of the ProduitRepository when saving
//        Mockito.when(produitRepository.save(produit)).thenReturn(produit);
//
//        // Call the method you want to test
//        Produit updatedProduit = produitService.updateProduit(produit);
//
//        // Verify that the Produit was updated and returned correctly
//        assertEquals(produit, updatedProduit);
//    }
//
//    @Test
//    public void testDeleteProduit() {
//        Long produitId = 1L;
//
//        // Call the method you want to test
//        produitService.deleteProduit(produitId);
//
//        // Verify that the Produit with the specified ID was deleted
//        Mockito.verify(produitRepository).deleteById(produitId);
//    }
//
//    @Test
//    public void testRetrieveProduit() {
//        Long produitId = 1L;
//        Produit expectedProduit = new Produit(/* provide constructor arguments */);
//
//        // Simulate the behavior of the ProduitRepository when finding by ID
//        Mockito.when(produitRepository.findById(produitId)).thenReturn(Optional.of(expectedProduit));
//
//        // Call the method you want to test
//        Produit retrievedProduit = produitService.retrieveProduit(produitId);
//
//        // Verify that the correct Produit was retrieved
//        assertEquals(expectedProduit, retrievedProduit);
//    }
//}
