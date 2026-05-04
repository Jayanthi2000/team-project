package com.example.genchat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.genchat.model.Message;
import com.example.genchat.service.MessageService;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private MessageService service;

    @PostMapping
    public Message send(@RequestBody Message msg) {
        return service.sendMessage(msg);
    }

    @GetMapping
    public List<Message> getAll() {
        return service.getMessages();
    }
}