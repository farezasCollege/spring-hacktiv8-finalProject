package com.starterkit.springboot.brs.repository.bus;

import java.util.*;

import com.starterkit.springboot.brs.model.bus.FoodAndBevList;
import org.springframework.data.repository.CrudRepository;
import com.starterkit.springboot.brs.model.bus.Stop;

public interface FoodBevRelationRepository extends CrudRepository<FoodAndBevList, Long> {
    List<FoodAndBevList> findByStops(Stop code);
}
