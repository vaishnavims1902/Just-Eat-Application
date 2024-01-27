package com.justeat.justeatapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.justeat.justeatapp.model.User;

public interface UserRepo extends JpaRepository<User,Integer> {

    User findByEmailAndPassword(String email, String password);

    

    

    
}
