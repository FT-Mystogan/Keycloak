package com.example.keycloak.dto.requests;

import com.example.keycloak.support.constant.Constants;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class OvertimeSchedulerRequest extends Request {
    @Max(value = Constants.MAX_MILLI_IN_DAY, message ="Min time is 22pm" )
    @Min(value = Constants.MIN_MILLI_IN_DAY, message ="Min time is 6am")
    @NotNull(message = "START_TIME_REQUIRED")
    private long startTime;

    @Max(value = Constants.MAX_MILLI_IN_DAY, message ="Min time is 22pm" )
    @Min(value = Constants.MIN_MILLI_IN_DAY, message ="Min time is 6am")
    @NotNull(message = "END_TIME_REQUIRED")
    private long endTime;

    @NotNull(message = "WORKING_DATE_REQUIRED")
    private LocalDate workingDate;

    @Valid
    @NotEmpty(message = "EMPLOYEE_REQUIRED")
    private List<String> employeeIds;
}
