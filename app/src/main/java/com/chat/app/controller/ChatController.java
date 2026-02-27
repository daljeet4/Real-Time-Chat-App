package com.chat.app.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {
    @MessageMapping("/send")
    @SendTo("/topic/messages")
    public ChatMessage send(ChatMessage message){
        return message;
    }



    @GetMapping("chat")
    public String chat(){
        return "chat";
    }
}
