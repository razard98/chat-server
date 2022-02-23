package com.example.chat.service;

import com.example.chat.model.ChatRoom;
import org.springframework.web.socket.WebSocketSession;

import java.util.List;

public interface ChatService {
    <T> void sendMessage(WebSocketSession session, T message);

    ChatRoom createRoom(String name);

    ChatRoom findRoomById(String roomId);

    List<ChatRoom> findAllRoom();
}
