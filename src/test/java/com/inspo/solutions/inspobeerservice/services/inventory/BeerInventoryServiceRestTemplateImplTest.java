package com.inspo.solutions.inspobeerservice.services.inventory;

import com.inspo.solutions.inspobeerservice.bootstrap.BeerLoader;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BeerInventoryServiceRestTemplateImplTest {

    @Autowired
    BeerInventoryService beerInventoryService;

    @Test
    void getOnhandInventory() {
        //TODO
        //Integer qoh = beerInventoryService.getOnhandInventory(UUID.randomUUID());
        //System.out.println(qoh);
    }
}