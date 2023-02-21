package com.starterkit.springboot.brs.model.bus;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
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
@Table(name = "food_bev_relation"
//, indexes = @Index(
// name = "food_bev_stops_code",
// columnList = "food_stops_id"
// )
)
public class FoodBevAndStopsRelation {
    @Id
    @Column(name = "food_bev_relation_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "food_stops_id")
    private Long stop;

    @Column(name = "food_package_id")
    private Long fAndBevList;
}
