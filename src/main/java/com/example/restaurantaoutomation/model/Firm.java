package com.example.restaurantaoutomation.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Firm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firmName;
    private String email;
    private String passwordHash;
    private boolean isDeleted;
   /*
    @OneToMany(targetEntity = FoodCategory.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "firmFoodCat_fk",referencedColumnName = "id")
    private List<FoodCategory> foodCategories;*/
}

