package com.zosh.ai.services;

import com.zosh.exception.ProductException;
import com.zosh.response.ApiResponse;

public interface AiChatBotService {

    ApiResponse aiChatBot(String prompt,Long productId,Long userId) throws ProductException;
}
