package com.resumemanager.resumemanagerapi.service;

import com.resumemanager.resumemanagerapi.entity.EmployeeResume;

import java.util.List;
import java.util.Optional;

public interface EmployeeResumeService {

    Optional<EmployeeResume> findOne(Long id);

    List<EmployeeResume> findAllResumes();

    EmployeeResume save(EmployeeResume employeeResume);

    void delete(Long id);

}
