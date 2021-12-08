package com.example.restaurantaoutomation.controllers;

import com.example.restaurantaoutomation.model.Food;
import com.example.restaurantaoutomation.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FoodController {
    @Autowired
    public FoodRepository foodRepository;

    @GetMapping("/api/food/getAll")
    public Iterable<Food>getAll(@RequestParam String filter){
        return foodRepository.findAllByFoodNameContaining(filter);
    }

    @PostMapping("/api/food/saveFood")
    public int saveFood(@RequestBody Food food){
        foodRepository.save(food);
        return saveFood(food);
    }

}
