package com.Revature.services;

import com.Revature.models.User;
import com.Revature.repositories.UserRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;


@Service
public class UserService{
    private UserRepository userRepo;

    @Autowired
    public UserService(UserRepository userRepo){
        this.userRepo = userRepo;
    }

    //create a new user
    public User registerUser(User user){
        if (user == null || user.getEmail() == null || user.getEmail().isEmpty() || user.getPassword() == null || user.getPassword().isEmpty()){
            return null;
        }
        System.out.println("service user: " + user.getPhoneNumber());
        return userRepo.save(user);
    }

    public User getUserById(int userId){
        if (userId <= 0){
            return null;
        }
        return userRepo.findByUserId(userId);
    }

    public User getUserByEmail(String email){
        if (email == null || email.isEmpty()){
            return null;
        }
        else if(!email.contains("@") || !email.contains(".")){
            return null;
        }
        return userRepo.findByEmail(email);
    }

}