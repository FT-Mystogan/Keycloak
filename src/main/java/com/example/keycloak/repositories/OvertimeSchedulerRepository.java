package com.example.keycloak.repositories;

import com.example.keycloak.entity.OvertimeSchedulerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;

@Repository
public interface OvertimeSchedulerRepository extends JpaRepository<OvertimeSchedulerEntity, String> {
    @Query("Select s from OvertimeSchedulerEntity s where s.deleted = false and s.overtimeRequestId = :overtimeRequestId")
    List<OvertimeSchedulerEntity> findAllByOvertimeRequestId(String overtimeRequestId);

    @Query("Select s from OvertimeSchedulerEntity s where s.deleted = false and s.startTime <= :nowDate")
    List<OvertimeSchedulerEntity> findAllBeforeNowDate(Instant nowDate);

    @Query("SELECT o from OvertimeSchedulerEntity o where o.id in " +
            "(select e.overtimeSchedulerId from OvertimeEmployeeEntity e where e.userId = :userId)")
    List<OvertimeSchedulerEntity>findOvertimeSchedulerEntitiesByEmployee(String userId);

    @Query("SELECT o from OvertimeSchedulerEntity o where o.id in " +
            "(select o.overtimeSchedulerId from OvertimeEmployeeEntity o where o.userId = :userId and " +
            "o.overtimeSchedulerId <> :overtimeSchedulerId )")
    List<OvertimeSchedulerEntity>findOvertimeSchedulerEntitiesByEmployee(String userId, String overtimeSchedulerId);
}
