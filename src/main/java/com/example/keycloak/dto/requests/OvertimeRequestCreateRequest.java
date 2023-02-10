package com.example.keycloak.dto.requests;

import com.example.keycloak.support.enums.OvertimeStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class OvertimeRequestCreateRequest  extends Request{
    @NotBlank(message = "OVERTIME_REQUEST_TITLE_REQUIRED")
    private String title;

    @Size(message = "OVERTIME_REQUEST_DESCRIPTION_LENGTH")
    private String description;

    @NotNull(message = "OVERTIME_REQUEST_STATUS_REQUIRED")
    private OvertimeStatus status;

    @Size(message = "SENT_USER_ID_LENGTH")
    @NotBlank(message = "APPROVAL_USER_ID_REQUIRED")
    private String approvalUserId;

    @Valid
    @NotEmpty(message = "OVERTIME_SCHEDULE_REQUIRED")
    private List<OvertimeSchedulerRequest> overtimeSchedulers;
}
