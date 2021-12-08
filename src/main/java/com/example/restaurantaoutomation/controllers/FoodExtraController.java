package com.example.restaurantaoutomation.controllers;

import com.example.restaurantaoutomation.model.FoodExtra;
import com.example.restaurantaoutomation.repositories.FoodExtraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FoodExtraController {
    @Autowired
    public FoodExtraRepository foodExtraRepository;

    @GetMapping("/api/foodExtra/getAll")
    public Iterable<FoodExtra>getAll(@RequestParam String filter){
        return foodExtraRepository.findAllByFoodExtraNameContaining(filter);
    }

    @PostMapping("")
    public int saveFoodExtra(@RequestBody FoodExtra foodExtra){
        foodExtraRepository.save(foodExtra);
        return saveFoodExtra(foodExtra);
    }
}
