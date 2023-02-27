package com.starterkit.springboot.brs.repository.bus;

import org.springframework.data.repository.CrudRepository;

import com.starterkit.springboot.brs.model.bus.FoodOrderHistory;

import java.util.List;

public interface FoodOrderHistoryRepository extends CrudRepository<FoodOrderHistory, Long> {
}
