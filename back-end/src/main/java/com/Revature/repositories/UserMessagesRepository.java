package com.Revature.repositories;

import com.Revature.models.UserMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserMessagesRepository extends JpaRepository<UserMessage, Long> {

    Optional<UserMessage> findByMessageId(int messageId);
    UserMessage findByUserId(int userId);
    void deleteUserMessageByUserId(long userId);

}
