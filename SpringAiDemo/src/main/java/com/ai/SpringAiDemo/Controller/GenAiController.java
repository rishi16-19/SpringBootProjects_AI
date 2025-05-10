package com.ai.SpringAiDemo.Controller;

import com.ai.SpringAiDemo.Service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenAiController {

    @Autowired
    ChatService chatService;

    @GetMapping("/get/ask-ai")
    public String getResponse(@RequestParam String prompt){
        return chatService.getChatResponse(prompt);
    }
}
