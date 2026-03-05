package com.hospitalManagement.hospitalManagement.repository;

import com.hospitalManagement.hospitalManagement.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}