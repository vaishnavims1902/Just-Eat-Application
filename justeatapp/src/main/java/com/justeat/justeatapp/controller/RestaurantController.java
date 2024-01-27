package com.justeat.justeatapp.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


import com.justeat.justeatapp.model.Restaurants;
import com.justeat.justeatapp.services.RestaurantService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;
    @GetMapping("/restaurant")
    public Restaurants getRestaurant() {
        return new Restaurants();
    }
    @GetMapping("/getRestaurants")
    public List<Restaurants> getRestaurants() {
        return restaurantService.getRestaurants();
    }
    @GetMapping("/getRestaurantById/{id}")
    public Optional<Restaurants> getRestaurantOptional(@PathVariable int id) {
        return restaurantService.getRestaurantOptional(id);
    }
    @GetMapping("/getRestaurantByName/{name}")
    public Optional<Restaurants> getRestaurantyName(@PathVariable String name) {
        return restaurantService.getRestaurantOptionalByName(name);
    }
    @GetMapping("/getRestaurantByCity/{city}")
    public List<Restaurants> getRestaurantByCity(@PathVariable String city) {
        return restaurantService.getRestaurantByCity(city);
    }
    @GetMapping("/getRestaurantByCuisine/{cuisine}")
    public List<Restaurants> getRestaurantByCuisine(@PathVariable String cuisine) {
        return restaurantService.getRestaurantByCuisine(cuisine);
    }@GetMapping("/getRestaurantByType/{type}")
    public List<Restaurants> getRestaurantByType(@PathVariable String type) {
        return restaurantService.getRestaurantByType(type);
    }

    @PostMapping("/addRestaurant/{email}/{password}")
    public ResponseEntity<?> addRestaurant(@RequestBody Restaurants restaurant,@PathVariable String email, @PathVariable String password) throws IOException {
        //Admin admin = adminService.findByEmailAndPassword(email, password);

         if (email.equals("admin@gmail.com") && password.equals("admin@111")) {
            restaurantService.addRestaurant(restaurant);
            return ResponseEntity.ok("Restaurant Added!");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Unauthorized access");
        }
    }
    @PostMapping("/addRestaurants/{email}/{password}")
    public ResponseEntity<?> addAllRestaurants(@RequestBody List<Restaurants> Restaurants,@PathVariable String email, @PathVariable String password) {
        //Admin admin = adminService.findByEmailAndPassword(email, password);

        if (email.equals("admin@gmail.com") && password.equals("admin@111")) {
            restaurantService.addAllRestaurants(Restaurants);
            return ResponseEntity.ok("All Restaurants Added!");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Unauthorized access");
        }
    }
    // @PostMapping("/addRestaurants")
    // public String addAllRestro(@RequestBody List<Restaurants> Restaurants) {
    //      restaurantService.addAllRestaurants(Restaurants);
        
    //     return "Added";
    // }
    @DeleteMapping("/deleteRestaurantById/{deliveryId}")
    public String deleteRestaurant(@PathVariable int id) {
        restaurantService.deleteRestaurant(id);
        return "Restaurant Deleted";
    }
        
    
}
