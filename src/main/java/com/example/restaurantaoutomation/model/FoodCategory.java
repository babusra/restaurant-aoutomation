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

public class FoodCategory {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String categoryName;
    private boolean isDeleted;
    @ManyToOne
    private Firm firm;

}
