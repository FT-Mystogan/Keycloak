package com.example.keycloak.dto.requests;

import com.example.keycloak.support.enums.OvertimeStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@EqualsAndHashCode(callSuper = true)
public class OvertimeRequestHistoryCreateRequest extends Request {

    @Size(message = "OVERTIME_REQUEST_MESSAGE_LENGTH")
    private String message;

    @Size(message = "OVERTIME_REQUEST_ID_LENGTH")
    @NotBlank(message = "OVERTIME_REQUEST_ID_REQUIRED")
    private String overtimeRequestId;

    @NotNull(message = "OVERTIME_REQUEST_STATUS_REQUIRED")
    private OvertimeStatus status;
}
