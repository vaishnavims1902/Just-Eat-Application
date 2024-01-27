package com.justeat.justeatapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.justeat.justeatapp.model.Delivery;

public interface DeliveryRepo extends JpaRepository<Delivery,Integer>{
    
}
