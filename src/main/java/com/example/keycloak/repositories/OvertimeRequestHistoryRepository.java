package com.example.keycloak.repositories;

import com.example.keycloak.entity.OvertimeRequestHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OvertimeRequestHistoryRepository extends JpaRepository<OvertimeRequestHistoryEntity, String> {
    @Query("select o from OvertimeRequestHistoryEntity o where o.deleted = false and o.overtimeRequestId = :overtimeRequestId")
    List<OvertimeRequestHistoryEntity> findOvertimeRequestHistoryEntityByOvertimeRequestId(String overtimeRequestId);
}
