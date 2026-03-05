package com.hospitalManagement.hospitalManagement.service;

import com.hospitalManagement.hospitalManagement.entity.Insurance;
import com.hospitalManagement.hospitalManagement.entity.Patient;
import com.hospitalManagement.hospitalManagement.repository.InsuranceRepository;
import com.hospitalManagement.hospitalManagement.repository.PatientRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class InsuranceService {

    private final InsuranceRepository insuranceRepository;
    private final PatientRepository patientRepository;

    @Transactional
    public Patient assignInsuranceToPatient(Insurance insurance, Long patientId){
        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() -> new EntityNotFoundException("Patient not found with thi ID"+patientId));

        patient.setInsurance(insurance);
        insurance.setPatient(patient); //For bidirectional consistency maintain.

        return patient;
    }
}
