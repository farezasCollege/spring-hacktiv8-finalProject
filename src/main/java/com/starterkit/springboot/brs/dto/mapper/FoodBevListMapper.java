package com.starterkit.springboot.brs.dto.mapper;

import com.starterkit.springboot.brs.dto.model.bus.FoodBevDto;
import com.starterkit.springboot.brs.model.bus.FoodAndBevList;

public class FoodBevListMapper {
    public static FoodBevDto toFoodBevDto(FoodAndBevList fandbevlist) {
        return new FoodBevDto()
        .setId(fandbevlist.getId())
        .setFood_package_name(fandbevlist.getFood_package_name())
        .setFood_package_details(fandbevlist.getFood_package_details())
        .setFood_package_price(fandbevlist.getFood_package_price());
    }
}
