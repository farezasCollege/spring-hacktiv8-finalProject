package com.starterkit.springboot.brs.model.bus;

import java.util.HashSet;
import java.util.Set;
import com.starterkit.springboot.brs.model.user.User;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(
    name = "food_order_history"
)
public class FoodOrderHistory {
    @Id
    @Column(name = "food_order_hist_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(cascade = CascadeType.ALL ,fetch = FetchType.LAZY)  // Menggunakan relasi Many to One
    @JoinColumn(name = "user")
    private User user;

    private String journey_date;
    private String source_stop;
    private String dest_stop;
    private String trip_date;
    private int trip_fare;
    private String bus_code;
    private String bus_agency_name;
    private String food_package_name;
    private String food_package_details;
}
