package com.inspo.solutions.inspobeerservice.services;

import com.inspo.solutions.inspobeerservice.web.model.BeerDto;
import com.inspo.solutions.inspobeerservice.web.model.BeerPagedList;
import com.inspo.solutions.inspobeerservice.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand) {
        return null;
    }
    @Override
    public BeerDto getById(UUID beerId, Boolean showInventoryOnHand) {
        return null;
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return null;
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {
        return null;
    }

    @Override
    public BeerDto getByUpc(String upc) {
        return null;
    }
}
