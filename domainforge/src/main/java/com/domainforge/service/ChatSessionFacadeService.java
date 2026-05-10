package com.domainforge.service;

import com.domainforge.model.request.CreateChatSessionRequest;
import com.domainforge.model.request.UpdateChatSessionRequest;
import com.domainforge.model.response.CreateChatSessionResponse;
import com.domainforge.model.response.GetChatSessionResponse;
import com.domainforge.model.response.GetChatSessionsResponse;

public interface ChatSessionFacadeService {
    GetChatSessionsResponse getChatSessions();

    GetChatSessionResponse getChatSession(String chatSessionId);

    GetChatSessionsResponse getChatSessionsByAgentId(String agentId);

    CreateChatSessionResponse createChatSession(CreateChatSessionRequest request);

    void deleteChatSession(String chatSessionId);

    void updateChatSession(String chatSessionId, UpdateChatSessionRequest request);
}
