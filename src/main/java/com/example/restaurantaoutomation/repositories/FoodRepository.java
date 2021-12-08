package com.example.restaurantaoutomation.repositories;

import com.example.restaurantaoutomation.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food,Integer> {
    public Iterable<Food>findAllByFoodNameContaining(String filter);
}
