package com.starterkit.springboot.brs.dto.mapper;

import com.starterkit.springboot.brs.dto.model.bus.FoodOrderHistoryDto;
import com.starterkit.springboot.brs.model.bus.FoodOrderHistory;

public class FoodOrderHistoryMapper {                                                   // sebagai mapper
    public static FoodOrderHistoryDto toOrderHistoryDto(FoodOrderHistory forderhist) {
        return new FoodOrderHistoryDto()                                                // Mengembalikan nilai dari FoodOrderHistoryDto
        .setId(forderhist.getId())
        .setJourney_date(forderhist.getJourney_date())
        .setDest_stop(forderhist.getDest_stop())
        .setSource_stop(forderhist.getSource_stop())
        .setBus_agency_name(forderhist.getBus_agency_name())
        .setFood_package_details(forderhist.getFood_package_details());                 // Menggunakan 6 kolom/row database
    }
}
