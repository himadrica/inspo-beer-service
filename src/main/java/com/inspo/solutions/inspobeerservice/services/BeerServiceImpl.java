package com.inspo.solutions.inspobeerservice.services;

import com.inspo.solutions.inspobeerservice.repositories.BeerRepository;
import com.inspo.solutions.inspobeerservice.web.model.BeerDto;
import com.inspo.solutions.inspobeerservice.web.model.BeerPagedList;
import com.inspo.solutions.inspobeerservice.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

    private final BeerRepository beerRepository;

    public BeerServiceImpl(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand) {
        return null;
    }
    @Override
    public BeerDto getById(UUID beerId, Boolean showInventoryOnHand) {
        return BeerDto.builder().build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return null;
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {
        this.beerRepository.findById(beerId).ifPresent(beer -> {
            beer.setBeerName(beerDto.getBeerName());
            beer.setBeerStyle(beerDto.getBeerStyle().toString());
            beer.setPrice(beerDto.getPrice());
            beer.setUpc(beerDto.getUpc());
            beerRepository.save(beer);
        });
        return beerDto;
    }

    @Override
    public BeerDto getByUpc(String upc) {
        return null;
    }
}
