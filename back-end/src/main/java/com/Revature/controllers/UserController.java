package com.Revature.controllers;

import com.Revature.models.User;
import com.Revature.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    //register new user
    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user){
        User newUser = userService.registerUser(user);
        if (newUser == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @GetMapping("/id/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable int userId){
        User user = userService.getUserById(userId);
        if (user == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<User> getUserByEmail(@PathVariable String email){
        User user = userService.getUserByEmail(email);
        if (user == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    //login user
    @PostMapping("/login")
    public ResponseEntity<User> loginUser(@RequestBody User user){
        User newUser = userService.getUserByEmail(user.getEmail());
        if (newUser == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

}