package com.starterkit.springboot.brs.model.bus;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "food_bev_list",
indexes = @Index(
name = "food_bev_code",
columnList = "food_package_id",
unique = true
))
public class FoodAndBevList {
    @Id
    @Column(name = "food_package_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(unique = true)
    private String food_package_name;
    
    private String food_package_details;

    private int food_package_price;
    
    @ManyToMany(mappedBy = "foodAndBevSet")
    private Set<Stop> stops = new HashSet<>();
}
