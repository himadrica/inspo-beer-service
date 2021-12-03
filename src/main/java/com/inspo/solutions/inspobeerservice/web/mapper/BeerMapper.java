package com.inspo.solutions.inspobeerservice.web.mapper;

import com.inspo.solutions.inspobeerservice.domain.Beer;
import com.inspo.solutions.inspobeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto dto);
    BeerDto beerToBeerDtoWithInventory(Beer beer);
}