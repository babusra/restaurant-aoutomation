package com.example.restaurantaoutomation.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class FoodExtra {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String foodExtraName;
    private boolean isDeleted;

    @ManyToOne
    private Food food;
}
