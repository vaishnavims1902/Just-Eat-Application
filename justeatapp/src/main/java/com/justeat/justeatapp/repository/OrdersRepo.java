package com.justeat.justeatapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.justeat.justeatapp.model.Orders;

public interface OrdersRepo extends JpaRepository<Orders,Integer> {

    
}
