package com.example.restaurantaoutomation.repositories;

import com.example.restaurantaoutomation.model.Firm;
import com.example.restaurantaoutomation.model.FoodCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodCategoryRepository extends JpaRepository<FoodCategory,Integer> {
    public Iterable<FoodCategory>findAllByCategoryNameContaining(String filter);
    public Iterable<FoodCategory>findAllByFirm(Firm firm);

}
