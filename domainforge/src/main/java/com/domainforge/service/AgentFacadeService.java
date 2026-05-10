package com.domainforge.service;

import com.domainforge.model.request.CreateAgentRequest;
import com.domainforge.model.request.UpdateAgentRequest;
import com.domainforge.model.response.CreateAgentResponse;
import com.domainforge.model.response.GetAgentsResponse;

public interface AgentFacadeService {
    GetAgentsResponse getAgents();

    CreateAgentResponse createAgent(CreateAgentRequest request);

    void deleteAgent(String agentId);

    void updateAgent(String agentId, UpdateAgentRequest request);
}
