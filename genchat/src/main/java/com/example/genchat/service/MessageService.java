package com.example.genchat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.genchat.model.Message;
import com.example.genchat.repository.MessageRepository;

@Service
public class MessageService {

    @Autowired
    private MessageRepository repo;

    public Message sendMessage(Message msg) {
        return repo.save(msg);
    }

    public List<Message> getMessages() {
        return repo.findAll();
    }
}