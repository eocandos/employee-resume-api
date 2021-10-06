package com.resumemanager.resumemanagerapi.service.impl;

import com.resumemanager.resumemanagerapi.entity.EmployeeResume;
import com.resumemanager.resumemanagerapi.repository.EmployeeResumeRepository;
import com.resumemanager.resumemanagerapi.service.EmployeeResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeResumeServiceImpl implements EmployeeResumeService {

    @Autowired
    EmployeeResumeRepository employeeResumeRepository;

    @Override
    public Optional<EmployeeResume> findOne(Long id) { return employeeResumeRepository.findById(id);  }

    @Override
    public List<EmployeeResume> findAllResumes() {
        return employeeResumeRepository.findAll();
    }

    @Override
    @Transactional
    public EmployeeResume save(EmployeeResume employeeResume) {
        return employeeResumeRepository.save(employeeResume);
    }

    @Override
    public void delete(Long resumeId) {
        Optional<EmployeeResume> employeeResume = findOne(resumeId);
        if (employeeResume.isPresent()) {
            employeeResumeRepository.delete(employeeResume.get());
        }
    }

}
