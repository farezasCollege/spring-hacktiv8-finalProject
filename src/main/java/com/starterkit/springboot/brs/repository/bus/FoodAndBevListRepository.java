package com.starterkit.springboot.brs.repository.bus;

import com.starterkit.springboot.brs.model.bus.FoodAndBevList;

import org.springframework.data.repository.CrudRepository;

public interface FoodAndBevListRepository extends CrudRepository<FoodAndBevList, Long> {
    
}
