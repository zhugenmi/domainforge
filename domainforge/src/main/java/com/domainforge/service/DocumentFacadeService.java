package com.domainforge.service;

import com.domainforge.model.request.CreateDocumentRequest;
import com.domainforge.model.request.UpdateDocumentRequest;
import com.domainforge.model.response.CreateDocumentResponse;
import com.domainforge.model.response.GetDocumentsResponse;
import org.springframework.web.multipart.MultipartFile;

public interface DocumentFacadeService {
    GetDocumentsResponse getDocuments();

    GetDocumentsResponse getDocumentsByKbId(String kbId);

    CreateDocumentResponse createDocument(CreateDocumentRequest request);

    CreateDocumentResponse uploadDocument(String kbId, MultipartFile file);

    void deleteDocument(String documentId);

    void updateDocument(String documentId, UpdateDocumentRequest request);
}
