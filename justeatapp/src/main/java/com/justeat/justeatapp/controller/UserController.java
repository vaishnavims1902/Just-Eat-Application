package com.justeat.justeatapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.justeat.justeatapp.model.Admin;
import com.justeat.justeatapp.model.User;
import com.justeat.justeatapp.repository.AdminRepo;
import com.justeat.justeatapp.repository.UserRepo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;








@RestController
public class UserController {
    @Autowired
    private final UserRepo user_repo_obj; 
    private final AdminRepo adminRepository;

    public UserController(UserRepo user_repo_obj ,AdminRepo adminRepository) {
        this.user_repo_obj = user_repo_obj;
        this.adminRepository=adminRepository;
    }

    @GetMapping("/")
    public String getMethodName() {
        return "Welcome To Just Eat....! Order your meal..!";
    }
    
    @GetMapping("/user")
    public User getUser() {
        return new User();
    }
     @GetMapping("/getUsers/{email}/{password}")
    public ResponseEntity<?> getAllUser(@PathVariable String email, @PathVariable String password) {
        Admin admin = adminRepository.findByEmailAndPassword(email, password);

        if (admin != null && email.equals(admin.getEmail()) && password.equals(admin.getPassword())) {
            List<User> users = user_repo_obj.findAll();
            return ResponseEntity.ok(users);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Unauthorized access");
        }
    }
    // @GetMapping("/getUsers")
    // public List<User> getAllUser() {

    //     return user_repo_obj.findAll();
    // }

    @GetMapping("/loginUser/{email}/{password}")
    public ResponseEntity<?> getMethodName(@PathVariable String email,@PathVariable String password) {
        User user = user_repo_obj.findByEmailAndPassword(email, password);

        if (user != null && email.equals(user.getEmail()) && password.equals(user.getPassword())) {
            
            return ResponseEntity.ok(" User Logged In");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Unauthorized access");
        }
    }
    
   @PostMapping("/registerUser")
   public String addUser(@RequestBody User user) {
  
       user_repo_obj.save(user);
       return "User Registered";
   }
   @PostMapping("/registerAllUser")
   public String addAllUser(@RequestBody List<User> users) {
  
       user_repo_obj.saveAll(users);
       return "All Users Registered";
   }
   @GetMapping("/getUserById/{userId}")
    public Optional<User> getUserById(@PathVariable int userId) {
        return user_repo_obj.findById(userId);
    }
    @DeleteMapping("/deleteUserById/{userId}")
    public String deleteUser(@PathVariable int userId) {
        user_repo_obj.deleteById(userId);
        return "User Deleted";
    }
}
