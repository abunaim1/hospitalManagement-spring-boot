package com.hospitalManagement.hospitalManagement.repository;

import com.hospitalManagement.hospitalManagement.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}