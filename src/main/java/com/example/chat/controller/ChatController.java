package com.example.chat.controller;

import com.example.chat.model.ChatRoom;
import com.example.chat.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/chat")
public class ChatController {

    private final ChatService chatService;

    @PostMapping
    public ResponseEntity<ChatRoom> createRoom(@RequestParam String name) {
        ChatRoom chatRoom = chatService.createRoom(name);
        return new ResponseEntity<>(chatRoom, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ChatRoom>> getAllRoom() {
        List<ChatRoom> chatRooms = chatService.findAllRoom();
        return new ResponseEntity<>(chatRooms, HttpStatus.OK);
    }
}
