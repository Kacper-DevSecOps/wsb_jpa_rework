package com.capgemini.wsb.persistence.dao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientDaoTest {

    @Autowired
    private PatientDao patientDao;

    @Transactional
    @Test
    public void testShouldFindPatientsByLastName() {
        // given
        String lastName = "Kowalski";
        
        // when
        List<PatientEntity> patients = patientDao.findByLastName(lastName);
        
        // then
        assertThat(patients).isNotEmpty();
        assertThat(patients.get(0).getLastName()).isEqualTo(lastName);
    }

    @Transactional
    @Test
    public void testShouldFindPatientsWithMoreThanXVisits() {
        // given
        int visitCount = 1; 
        
        // when
        List<PatientEntity> patients = patientDao.findPatientsWithMoreThanXVisits(visitCount);
        
        // then
        assertThat(patients).isNotEmpty();
        assertThat(patients.get(0).getVisits().size()).isGreaterThan(visitCount);
    }


    @Transactional
    @Test
    public void testShouldFindByHeightGreaterThan() {
        // given
        Double height = 170.0; 
        
        // when
        List<PatientEntity> patients = patientDao.findByHeightGreaterThan(height);
        
        // then
        assertThat(patients).isNotEmpty();
        assertThat(patients.get(0).getHeight()).isGreaterThan(height);
    }

}
