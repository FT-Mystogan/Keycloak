package com.example.keycloak.entity;

import com.example.keycloak.support.enums.OvertimeType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Setter(AccessLevel.PRIVATE)
@Getter
@Entity
public class OvertimeEmployeeEntity {
    @Id
    private String id;
    private String userId;
    private String overtimeSchedulerId;
    private Boolean deleted;
    private OvertimeType overtimeType;
    private Long actualStartTime;
    private Long actualEndTime;
    private LocalDate workingDate;
}

