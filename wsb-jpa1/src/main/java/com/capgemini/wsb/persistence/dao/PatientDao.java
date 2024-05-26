package com.capgemini.wsb.persistence.dao;

import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface PatientDao extends Dao<PatientEntity, Long> {

    List<PatientEntity> findByLastName(String lastName);

    @Query("SELECT p FROM PatientEntity p WHERE SIZE(p.visits) > :visitCount")
    List<PatientEntity> findPatientsWithMoreThanXVisits(@Param("visitCount") int visitCount);

    @Query("SELECT p FROM PatientEntity p WHERE p.height > :height")
    List<PatientEntity> findByHeightGreaterThan(@Param("height") Double height);


    @Query("SELECT v FROM VisitEntity v WHERE v.patient.id = :patientId")
List<VisitEntity> findAllVisitsByPatientId(@Param("patientId") Long patientId);
}
