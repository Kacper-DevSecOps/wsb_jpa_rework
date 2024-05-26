package com.capgemini.wsb.persistence.service;

import com.capgemini.wsb.dto.VisitTO;
import com.capgemini.wsb.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientService patientService;

    @Test
    public void testFindAllVisitsByPatientId() {
        Long patientId = 1L; 
        List<VisitTO> visits = patientService.findAllVisitsByPatientId(patientId);
        assertThat(visits).isNotEmpty();
        assertThat(visits.get(0).getPatient().getId()).isEqualTo(patientId);
    }
}
