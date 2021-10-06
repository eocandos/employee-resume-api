package com.resumemanager.resumemanagerapi.entity;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "resume")
@Getter
@Setter
@NoArgsConstructor
public class EmployeeResume implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq")
    @Column(name = "resume_id")
    private Long id;

    @Column
    @NotNull
    private String name;

    @Column
    private int phoneNumber;

    @Column
    private String address;

    @Column
    @NotNull
    private String emailAddress;

    @OneToMany( cascade = CascadeType.ALL)
    private List<AcademicInformation> academicInformation;

    @OneToMany( cascade = CascadeType.ALL)
    private List<JobExperience> jobExperience;

    @CreationTimestamp
    private Date createTime;

    @UpdateTimestamp
    private Date updateTime;

}
