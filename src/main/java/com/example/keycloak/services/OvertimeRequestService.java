package com.example.keycloak.services;

import com.example.keycloak.dto.requests.OvertimeRequestCreateRequest;
import com.example.keycloak.dto.requests.OvertimeRequestHistoryCreateRequest;
import com.example.keycloak.dto.requests.OvertimeRequestUpdateRequest;
import com.example.keycloak.dto.responses.Response;
import com.example.keycloak.entity.OvertimeRequestEntity;

public interface OvertimeRequestService {
    Response<OvertimeRequestEntity> find(String id);
    Response<OvertimeRequestEntity> create(OvertimeRequestCreateRequest request);
    Response<OvertimeRequestEntity> update(String id, OvertimeRequestUpdateRequest request);
    Response<OvertimeRequestEntity> approve(String id, OvertimeRequestHistoryCreateRequest request);
}
