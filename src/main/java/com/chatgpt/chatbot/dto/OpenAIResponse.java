package com.chatgpt.chatbot.dto;

import java.util.List;

public record OpenAIResponse(List<Choice> choices) {
}
