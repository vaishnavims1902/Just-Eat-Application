package com.justeat.justeatapp.services;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.justeat.justeatapp.model.FoodItems;
import com.justeat.justeatapp.repository.FoodItemRepo;


@Service
public class FoodItemService {
    private FoodItemRepo foodItemRepo;
    public FoodItemService(FoodItemRepo foodItemRepo) {
        this.foodItemRepo = foodItemRepo;
    }
    public List<FoodItems> getFoodItems() {
        return foodItemRepo.findAll();
    }

    public FoodItems addFoodItem(FoodItems foodItems) throws IOException {
        return foodItemRepo.save(foodItems);
    }

    public Optional<FoodItems> getFoodItemOptional(int id) {
        return foodItemRepo.findById(id);
    }
    public List<FoodItems> getFoodItemOptionalByCategory(String category) {
        return foodItemRepo.findBycategory(category);
    }
    public Optional<FoodItems> getFoodItemOptionalByName(String foodName) {
        return foodItemRepo.findByfoodName(foodName);
    }
    public List<FoodItems> addAllFoodItems(List<FoodItems> foodItems){
        return foodItemRepo.saveAll(foodItems);
    
    }
    public void deleteFoodItem(int foodItemId) {
        foodItemRepo.deleteById(foodItemId);
    }
}
