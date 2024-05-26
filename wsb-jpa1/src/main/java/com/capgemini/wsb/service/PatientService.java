package com.capgemini.wsb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.dto.VisitTO;



@Service
public interface PatientService {
    PatientTO findById(Long id);
    PatientTO save(PatientTO patientTO);
    void delete(Long id);

    List<VisitTO> findAllVisitsByPatientId(Long patientId);
}
