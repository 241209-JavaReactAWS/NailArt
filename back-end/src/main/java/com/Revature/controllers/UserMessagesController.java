package com.Revature.controllers;

import com.Revature.models.UserMessage;
import com.Revature.services.UserMessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/message")
public class UserMessagesController {
    private UserMessagesService userMessagesService;

    @Autowired
    public UserMessagesController(UserMessagesService userMessagesService){
        this.userMessagesService = userMessagesService;
    }

    //create a new message
    @PostMapping("/message")
    public ResponseEntity<UserMessage> createMessage(@RequestBody UserMessage userMessage){
        UserMessage createdMessage = userMessagesService.createMessage(userMessage);
        if (createdMessage == null){
            return ResponseEntity.badRequest().build();
        }
        else {
            return ResponseEntity.ok(createdMessage);
        }


    }

    @GetMapping("/{messageId}")
    public ResponseEntity<Optional<UserMessage>> getMessageById(@PathVariable int messageId){
        Optional<UserMessage> message = userMessagesService.getMessageById(messageId);
        if (message == null){
            return ResponseEntity.notFound().build();
        }
        else {
            return ResponseEntity.ok(message);
        }
    }

}
