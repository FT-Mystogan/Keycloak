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
public class OvertimeRequestEntity {
    @Id
    private String id;
    private String title;
    private String description;
    private Boolean deleted;
    private OvertimeStatus status;
    private String requestUserId;
    private String approvalUserId;
}

