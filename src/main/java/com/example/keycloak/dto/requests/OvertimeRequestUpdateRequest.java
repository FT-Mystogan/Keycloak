package com.example.keycloak.dto.requests;

import com.example.keycloak.support.enums.OvertimeStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class OvertimeRequestUpdateRequest extends Request {
    @NotBlank(message = "OVERTIME_REQUEST_TITLE_REQUIRED")
    private String title;

    private String description;

    @NotNull(message = "OVERTIME_REQUEST_STATUS_REQUIRED")
    private OvertimeStatus status;

    @NotBlank(message = "APPROVAL_USER_ID_REQUIRED")
    private String approvalUserId;

    @Valid
    @NotEmpty(message = "OVERTIME_SCHEDULER_REQUIRED")
    private List<OvertimeSchedulerRequest> overtimeSchedulers;
}
