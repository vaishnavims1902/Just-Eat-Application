package com.justeat.justeatapp.repository;



import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.justeat.justeatapp.model.Restaurants;

public interface RestaurantRepo extends JpaRepository<Restaurants,Integer> {

   
 Optional<Restaurants> findByrestaurantName(String restaurantName);

List<Restaurants> findBycuisine(String cuisine);

List<Restaurants> findBycity(String city);

List<Restaurants> findBytype(String type);

    
}
