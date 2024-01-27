package com.justeat.justeatapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.justeat.justeatapp.model.FoodItems;
public interface FoodItemRepo extends JpaRepository <FoodItems,Integer>{


    Optional<FoodItems> findByfoodName(String foodName);

    List<FoodItems> findBycategory(String category);

    
}
