package com.resumemanager.resumemanagerapi.repository;


import com.resumemanager.resumemanagerapi.entity.EmployeeResume;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeResumeRepository extends JpaRepository<EmployeeResume, Long> {

    // SELECT * FROM EmployeeResume WHERE ID = id;
    Optional<EmployeeResume> findById(Long id);

}
