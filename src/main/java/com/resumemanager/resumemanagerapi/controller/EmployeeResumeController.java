package com.resumemanager.resumemanagerapi.controller;

import com.resumemanager.resumemanagerapi.service.EmployeeResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.resumemanager.resumemanagerapi.entity.EmployeeResume;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@EnableAutoConfiguration
public class EmployeeResumeController {

    @Autowired
    EmployeeResumeService employeeResumeService;

    @GetMapping("/resumes")
    public List<EmployeeResume> findAllResumes() {
        return employeeResumeService.findAllResumes();
    }

    @PostMapping("/resume")
    public EmployeeResume create(@RequestBody EmployeeResume employeeResume) {
        return employeeResumeService.save(employeeResume);
    }

    @PutMapping("/resume/{id}")
    public ResponseEntity edit(@PathVariable("id") Long resumeId,
                               @RequestBody EmployeeResume employeeResume) {

        Optional<EmployeeResume> employeeResumeExist = employeeResumeService.findOne(resumeId);
        if(employeeResumeExist.isPresent()) {
            employeeResume.setId(resumeId);
            return ResponseEntity.ok(employeeResumeService.save(employeeResume));
        }
        return ResponseEntity.badRequest().body("No fue posible actualiar la hoja de vida");
    }

    @DeleteMapping("/resume/{id}")
    public ResponseEntity delete(@PathVariable("id") Long resumeId) {
        employeeResumeService.delete(resumeId);
        return ResponseEntity.ok().build();
    }

}
