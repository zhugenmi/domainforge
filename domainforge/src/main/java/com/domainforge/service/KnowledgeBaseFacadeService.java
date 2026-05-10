package com.domainforge.service;

import com.domainforge.model.request.CreateKnowledgeBaseRequest;
import com.domainforge.model.request.UpdateKnowledgeBaseRequest;
import com.domainforge.model.response.CreateKnowledgeBaseResponse;
import com.domainforge.model.response.GetKnowledgeBasesResponse;

public interface KnowledgeBaseFacadeService {
    GetKnowledgeBasesResponse getKnowledgeBases();

    CreateKnowledgeBaseResponse createKnowledgeBase(CreateKnowledgeBaseRequest request);

    void deleteKnowledgeBase(String knowledgeBaseId);

    void updateKnowledgeBase(String knowledgeBaseId, UpdateKnowledgeBaseRequest request);
}

