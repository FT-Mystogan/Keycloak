package com.example.keycloak.entity;

import com.example.keycloak.support.enums.OvertimeStatus;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Setter(AccessLevel.PRIVATE)
@Getter
@Entity
public class OvertimeRequestHistoryEntity {
    @Id
    private String id;
    private String overtimeRequestId;
    private OvertimeStatus status;
    private String message;
    private Boolean deleted;
    private String createdUserId;
}
