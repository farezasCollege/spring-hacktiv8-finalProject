package com.starterkit.springboot.brs.model.bus;

import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import javax.persistence.ManyToMany;

import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;

import javax.persistence.*;

/**
 * Created by Arpit Khandelwal.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(
        name = "stop",
        indexes = @Index(
                name = "idx_stop_code",
                columnList = "code",
                unique = true
        )
)
public class Stop {
    @Id
    @Column(name = "stop_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String name;

    private String detail;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "food_bev_relation", 
        joinColumns = { @JoinColumn(name="food_stops_id", unique = false) }, 
        inverseJoinColumns = { @JoinColumn(name = "food_package_id", unique = false) }
    )
    Set<FoodAndBevList> foodAndBevSet = new HashSet<>();
}
