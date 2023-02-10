package com.example.keycloak.services.impl;

import com.example.keycloak.dto.requests.OvertimeRequestCreateRequest;
import com.example.keycloak.dto.requests.OvertimeRequestHistoryCreateRequest;
import com.example.keycloak.dto.requests.OvertimeRequestUpdateRequest;
import com.example.keycloak.dto.responses.Response;
import com.example.keycloak.entity.OvertimeRequestEntity;
import com.example.keycloak.services.OvertimeRequestService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OvertimeRequestServiceImpl implements OvertimeRequestService {
    @Override
    public Response<OvertimeRequestEntity> find(String id) {
        return null;
    }

    @Override
    public Response<OvertimeRequestEntity> create(OvertimeRequestCreateRequest request) {
        return null;
    }

    @Override
    public Response<OvertimeRequestEntity> update(String id, OvertimeRequestUpdateRequest request) {
        return null;
    }

    @Override
    public Response<OvertimeRequestEntity> approve(String id, OvertimeRequestHistoryCreateRequest request) {
        return null;
    }
}
