package com.justeat.justeatapp.controller;


// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

// import com.justeat.justeatapp.model.Admin;
// import com.justeat.justeatapp.repository.AdminRepo;
// import com.justeat.justeatapp.services.AdminService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class AdminController {
  //  @Autowired
    ///private AdminService adminService;
    @GetMapping("/Admin")
    public String adminView() {
        return "Hello, Your are admin ";
    }
    @GetMapping("/loginAdmin/{email}/{password}")
    public ResponseEntity<?> getAllUser(@PathVariable String email, @PathVariable String password) {
        //Admin admin = adminService.findByEmailAndPassword(email, password);

        if (email.equals("admin@gmail.com") && password.equals("admin@111")) {
            return ResponseEntity.ok("Admin Logged In...! Hello, Your are admin ");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Unauthorized access");
        }
    }
}
