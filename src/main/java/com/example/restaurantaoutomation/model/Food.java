package com.example.restaurantaoutomation.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class Food {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String foodName;
    private String foodDetails;
    private int price;
    private boolean isDeleted;
    @ManyToOne
    private FoodCategory foodCategory;
    /*
    @OneToMany(targetEntity = FoodExtra.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "foodFoodExt_fk",referencedColumnName = "id")
    private List<FoodExtra> foodExtras;*/
}
