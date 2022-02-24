package com.example.chat.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ChatController {

    @GetMapping("/chat")
    public String getChatRoom() {
        log.info("======");
        return "chat";
    }
}
