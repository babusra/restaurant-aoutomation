package com.example.restaurantaoutomation.repositories;

import com.example.restaurantaoutomation.model.FoodExtra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodExtraRepository extends JpaRepository<FoodExtra,Integer> {
    public Iterable<FoodExtra> findAllByFoodExtraNameContaining(String filter);
}
