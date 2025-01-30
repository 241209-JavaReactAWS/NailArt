package com.Revature.services;

import com.Revature.models.UserMessage;
import com.Revature.repositories.UserMessagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import java.util.List;
import java.util.Optional;

@Service
public class UserMessagesService {
    private UserMessagesRepository userMessagesRepo;

    @Autowired
    public UserMessagesService(UserMessagesRepository userMessagesRepo){
        this.userMessagesRepo = userMessagesRepo;
    }

    //see is user has any messages and the body is not empty
    public boolean checkMessage(String message){
        if (message == null || message.isEmpty()){
            return false;
        }
        return true;
    }

    //create a new message
    public UserMessage createMessage(UserMessage userMessages){
        if (userMessages == null || userMessages.getMessage() == null || userMessages.getMessage().isEmpty()){
            return null;
        }
        return userMessagesRepo.save(userMessages);
    }

    //get message by id
    public Optional<UserMessage> getMessageById(int messageId){
        if (messageId <= 0){
            return null;
        }
        return userMessagesRepo.findByMessageId(messageId);
    }

    //get message by user id
    public UserMessage getMessageByUserId(int userId){
        if (userId <= 0){
            return null;
        }
        return userMessagesRepo.findByUserId(userId);
    }

    //get all messages
    public List<UserMessage> getAllMessages(){
        return userMessagesRepo.findAll();
    }

    //delete message by id
    public boolean deleteMessageById(long messageId){
        if (messageId <= 0){
            return false;
        }
        userMessagesRepo.deleteById(messageId);
        return true;
    }

    //delete message by user id
    public void deleteMessageByUserId(long userId){
        if (userId <= 0){
            return;
        }
        userMessagesRepo.deleteUserMessageByUserId(userId);
    }

    //delete all messages
    public void deleteAllMessages(){
        userMessagesRepo.deleteAll();
    }



}
