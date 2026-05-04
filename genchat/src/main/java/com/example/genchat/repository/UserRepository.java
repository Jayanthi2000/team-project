package com.example.genchat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.genchat.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}