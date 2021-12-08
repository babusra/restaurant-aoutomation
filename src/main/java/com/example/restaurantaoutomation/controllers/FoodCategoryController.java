package com.example.restaurantaoutomation.controllers;

import com.example.restaurantaoutomation.model.Firm;
import com.example.restaurantaoutomation.model.FoodCategory;
import com.example.restaurantaoutomation.repositories.FoodCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FoodCategoryController {
    @Autowired
    public FoodCategoryRepository foodCategoryRepository;

    @GetMapping("/api/foodCategory/getAll")
    public Iterable<FoodCategory> getAll(@RequestParam String filter) {
        return foodCategoryRepository.findAllByCategoryNameContaining(filter);
    }

    @PostMapping("/api/foodCategory/saveFoodCategory")
    public long saveFoodCategory(@RequestBody FoodCategory foodCategory) {

        return foodCategoryRepository.save(foodCategory).getId();
    }
}