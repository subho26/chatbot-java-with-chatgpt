package com.chatgpt.chatbot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;

@SpringBootApplication
public class ChatbotWithChatgptApplication {

    @Value("${openai.url}")
    private String openAIURL;

    public static void main(String[] args) {
        SpringApplication.run(ChatbotWithChatgptApplication.class, args);
    }

    @Bean
    public RestClient restClient() {
        return RestClient.builder().baseUrl(openAIURL).build();
    }


}
