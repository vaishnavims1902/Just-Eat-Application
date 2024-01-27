package com.justeat.justeatapp.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.justeat.justeatapp.model.FoodItems;
import com.justeat.justeatapp.services.FoodItemService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;






@RestController
public class FoodItemController {
   @Autowired
   private FoodItemService foodItemService;

   @GetMapping("/getFoodItem")
   public FoodItems getFoodItem() {
       return new FoodItems();
   }

   @GetMapping("/getFoodItems")
   public List<FoodItems> getFoodItems() {
       return foodItemService.getFoodItems();
   }
   @GetMapping("/getFoodItemByName/{name}")
   public Optional<FoodItems> getFoodItemByName(@PathVariable String foodName) {
       return foodItemService.getFoodItemOptionalByName(foodName);
   }
   @GetMapping("/getFoodItemsByCategory/{category}")
   public List<FoodItems> getFoodItemsByCategory(@PathVariable String category) {
       return foodItemService.getFoodItemOptionalByCategory(category);
   }
   
   @GetMapping("/getFoodItemsById/{id}>")
   public Optional<FoodItems> getFoodItemById(@RequestParam int id ){
       return foodItemService.getFoodItemOptional(id);
   }
   
   @PostMapping("/addFoodItem")
   public String addFoodItems(@RequestBody FoodItems foodItems) throws IOException {
       foodItemService.addFoodItem(foodItems);
       return "Food Item Added";
   }
   @PostMapping("/addAllFoodItems")
   public String addAllFoodItems(@RequestBody List<FoodItems> foodItems) {
        foodItemService.addAllFoodItems(foodItems);
       return "All Food Item Added";
   }
   @DeleteMapping("/deleteFoodItemBYId/{deliveryId}")
    public String deleteFoodItem(@PathVariable int id) {
        foodItemService.deleteFoodItem(id);
        return "Food Item Deleted";
    }
   
   

}
