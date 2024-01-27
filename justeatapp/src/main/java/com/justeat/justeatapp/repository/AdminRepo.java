package com.justeat.justeatapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.justeat.justeatapp.model.Admin;


public interface AdminRepo extends JpaRepository<Admin,Integer> {

    Admin findByEmailAndPassword(String email, String password);

}
