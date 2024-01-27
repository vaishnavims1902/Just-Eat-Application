package com.justeat.justeatapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.justeat.justeatapp.model.Payment;

public interface PaymentRepo extends JpaRepository<Payment,Integer> {

    
}
