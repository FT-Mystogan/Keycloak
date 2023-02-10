package com.example.keycloak.repositories;

import com.example.keycloak.entity.OvertimeRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OvertimeRequestRepository extends JpaRepository<OvertimeRequestEntity, String> {

    @Query("Select o from OvertimeRequestEntity o where o.deleted = false")
    List<OvertimeRequestEntity> findOvertimeRequestEntities();

    @Query("Select o from OvertimeRequestEntity o where o.deleted = false and o.id in :ids")
    List<OvertimeRequestEntity> findOvertimeRequestEntityByIds(List<String> ids);
}
