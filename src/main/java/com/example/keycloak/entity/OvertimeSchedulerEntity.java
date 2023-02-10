package com.example.keycloak.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Setter(AccessLevel.PRIVATE)
@Getter
@Entity
public class OvertimeSchedulerEntity {
    @Id
    private String id;
    private Boolean deleted;
    private long startTime;
    private long endTime;
    private LocalDate workingDate;
    private String overtimeRequestId;
    private Float coefficientsSalary;
}
