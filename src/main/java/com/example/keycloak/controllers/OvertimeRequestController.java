package com.example.keycloak.controllers;

import com.example.keycloak.dto.requests.OvertimeRequestCreateRequest;
import com.example.keycloak.dto.requests.OvertimeRequestHistoryCreateRequest;
import com.example.keycloak.dto.requests.OvertimeRequestUpdateRequest;
import com.example.keycloak.dto.responses.Response;
import com.example.keycloak.entity.OvertimeRequestEntity;
import com.example.keycloak.services.OvertimeRequestService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/overtime-requests")
@Validated
public class OvertimeRequestController {
    private final OvertimeRequestService overtimeRequestService;

    public OvertimeRequestController(OvertimeRequestService overtimeRequestService) {
        this.overtimeRequestService = overtimeRequestService;
    }

    @GetMapping("/{id}/find")
    Response<OvertimeRequestEntity> findByOvertimeRequestId(@PathVariable String id) {
        return overtimeRequestService.find(id);
    }

    @GetMapping("/")
    Response<List<OvertimeRequestEntity>> search() {
        return null;
    }

    @PostMapping("/")
    Response<OvertimeRequestEntity> create(@RequestBody @Valid OvertimeRequestCreateRequest request) {
        return overtimeRequestService.create(request);
    }

    @PostMapping("/{id}/update")
    Response<OvertimeRequestEntity> update(@PathVariable String id,
                                           @RequestBody @Valid OvertimeRequestUpdateRequest request) {
        return overtimeRequestService.update(id, request);
    }

    @PostMapping("/{id}/approve")
    Response<OvertimeRequestEntity> approve(@PathVariable String id,
                                            @RequestBody @Valid OvertimeRequestHistoryCreateRequest request) {
        return overtimeRequestService.approve(id, request);
    }
}
