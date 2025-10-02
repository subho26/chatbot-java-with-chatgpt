package com.chatgpt.chatbot.dto;

import java.util.List;

public record OpenAIRequest(String model, List<Message> messages) {
}
