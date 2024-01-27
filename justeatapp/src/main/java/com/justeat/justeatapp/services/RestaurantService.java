package com.justeat.justeatapp.services;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.justeat.justeatapp.model.Restaurants;
import com.justeat.justeatapp.repository.RestaurantRepo;

@Service
public class RestaurantService {
    private RestaurantRepo restaurantRepo;
    public RestaurantService(RestaurantRepo restaurantRepo) {
        this.restaurantRepo = restaurantRepo;
    }
    public List<Restaurants> getRestaurants() {
        return restaurantRepo.findAll();
    }

    public Restaurants addRestaurant(Restaurants restaurant) throws IOException {
        return restaurantRepo.save(restaurant);
    }

    public Optional<Restaurants> getRestaurantOptional(int id) {
        return restaurantRepo.findById(id);
    }
    public Optional<Restaurants> getRestaurantOptionalByName(String restaurantName) {
        return restaurantRepo.findByrestaurantName(restaurantName);
    }
    public List<Restaurants> getRestaurantByCity(String city) {
        return restaurantRepo.findBycity(city);
    }
    public List<Restaurants> getRestaurantByCuisine(String cuisine) {
        return restaurantRepo.findBycuisine(cuisine);
    }
    public List<Restaurants> getRestaurantByType(String type) {
        return restaurantRepo.findBytype(type);
    }
    public List<Restaurants> addAllRestaurants(List<Restaurants> restaurants){
        return restaurantRepo.saveAll(restaurants);
    }
    public void deleteRestaurant(int restaurantId) {
        restaurantRepo.deleteById(restaurantId);
    }
    
}
