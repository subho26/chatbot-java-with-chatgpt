package com.chatgpt.chatbot.service;

import com.chatgpt.chatbot.dto.Message;
import com.chatgpt.chatbot.dto.OpenAIRequest;
import com.chatgpt.chatbot.dto.OpenAIResponse;
import com.chatgpt.chatbot.dto.PromptRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class OpenAIService {

    @Autowired
    private RestClient restClient;

    @Value("${openai.secret}")
    private String openAISecret;
    @Value("${openai.model}")
    private String openAIModel;

    public String getChatResponse(PromptRequest promptRequest) {
        OpenAIRequest openAIRequest = new OpenAIRequest(openAIModel,
                List.of(new Message("user", promptRequest.prompt())));

        return restClient.post()
                .header("Authorization", "Bearer " + openAISecret)
                .header("Content-Type", "application/json")
                .body(openAIRequest)
                .retrieve()
                .body(OpenAIResponse.class)
                .choices()
                .get(0)
                .message()
                .content();
    }
}
