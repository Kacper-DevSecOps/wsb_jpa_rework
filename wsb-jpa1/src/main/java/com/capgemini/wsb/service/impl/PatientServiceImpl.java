package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.dto.VisitTO;
import com.capgemini.wsb.mapper.PatientMapper;
import com.capgemini.wsb.mapper.VisitMapper;
import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import com.capgemini.wsb.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientDao patientDao;

    @Override
    public PatientTO findById(Long id) {
        return PatientMapper.mapToTO(patientDao.findOne(id));
    }

    @Override
    public PatientTO save(PatientTO patientTO) {
        PatientEntity entity = PatientMapper.mapToEntity(patientTO);
        entity = patientDao.save(entity);
        return PatientMapper.mapToTO(entity);
    }

    @Override
    public void delete(Long id) {
        patientDao.delete(id);
    }


    @Override
    public List<VisitTO> findAllVisitsByPatientId(Long patientId) {
        List<VisitEntity> visits = patientDao.findAllVisitsByPatientId(patientId);
        return visits.stream()
                .map(VisitMapper::mapToTO)
                .collect(Collectors.toList());
    }
    
}
