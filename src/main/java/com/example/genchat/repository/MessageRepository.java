package com.example.genchat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.genchat.model.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
}