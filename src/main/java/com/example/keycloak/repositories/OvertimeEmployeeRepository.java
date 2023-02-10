package com.example.keycloak.repositories;

import com.example.keycloak.entity.OvertimeEmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OvertimeEmployeeRepository extends JpaRepository<OvertimeEmployeeEntity, String> {

    @Query("Select o from OvertimeEmployeeEntity o where o.deleted = false and o.overtimeSchedulerId = :overtimeSchedulerId")
    List<OvertimeEmployeeEntity> findAllBySubOvertimeRequestId(String overtimeSchedulerId);
}
