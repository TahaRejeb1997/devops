/*package com.esprit.examen.services;

import com.esprit.examen.entities.Produit;
import com.esprit.examen.repositories.CategorieProduitRepository;
import com.esprit.examen.repositories.ProduitRepository;
import com.esprit.examen.repositories.StockRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
@ContextConfiguration(classes = {ProduitServiceImpl.class})
@ExtendWith(SpringExtension.class)
public class ProduitTest {

    @MockBean
   private CategorieProduitRepository categorieProduitRepository;

    @MockBean
    private ProduitRepository produitRepository;

    @Autowired
    private ProduitServiceImpl produitServiceImpl;

    @MockBean
    private StockRepository stockRepository;
    @Test
    void testRetrieveAllProduits() {
        ArrayList<Produit> produitList = new ArrayList<>();
        when(produitRepository.findAll()).thenReturn(produitList);
        List<Produit> actualRetrieveAllProduitsResult = produitServiceImpl.retrieveAllProduits();
        assertSame(produitList, actualRetrieveAllProduitsResult);
        assertTrue(actualRetrieveAllProduitsResult.isEmpty());
        verify(produitRepository).findAll();
    }

    @Test
    void testDeleteProduit() {
        doNothing().when(produitRepository).deleteById((Long) any());
        produitServiceImpl.deleteProduit(123L);
        verify(produitRepository).deleteById((Long) any());
    }
}
*/
