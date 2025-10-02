package com.chatgpt.chatbot.controller;

import com.chatgpt.chatbot.dto.PromptRequest;
import com.chatgpt.chatbot.service.OpenAIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bot")
public class ChatBotController {
    @Autowired
    private OpenAIService openAIService;

    @PostMapping("/chat")
    public String chat(@RequestBody PromptRequest promptRequest) {
        return openAIService.getChatResponse(promptRequest);
    }
}
