package com.justeat.justeatapp.services;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.justeat.justeatapp.model.Admin;

import com.justeat.justeatapp.repository.AdminRepo;


@Service
public class AdminService {
    private final AdminRepo adminRepo;
   
    
    private AdminService(AdminRepo adminRepo) {
        this.adminRepo = adminRepo;
    }

    public List<Admin> getAdmin() {
        return adminRepo.findAll();
    }

    public Admin addAdmin(Admin admin) throws IOException {
        return adminRepo.save(admin);
    }

    public Optional<Admin> getAdmin(int id) {
        return adminRepo.findById(id);
    }

    public Admin findByEmailAndPassword(String email, String password) {
        return adminRepo.findByEmailAndPassword(email,password);
    }
}
