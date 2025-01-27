package com.Revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface userRepository extends JpaRepository<User, Integer> {

    User findByEmail(String email);
    User findByUserId(int userId);
}