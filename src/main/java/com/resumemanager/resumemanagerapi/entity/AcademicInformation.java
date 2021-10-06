package com.resumemanager.resumemanagerapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.resumemanager.resumemanagerapi.enums.CityEnum;
import com.resumemanager.resumemanagerapi.enums.CountryEnum;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown=true)
public class AcademicInformation implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq")
    @Column(name = "id")
    private Long id;

    @Column
    @NotNull
    private String institution;

    @Column
    @NotNull
    @Enumerated(EnumType.STRING)
    private CountryEnum country;

    @Column
    @NotNull
    @Enumerated(EnumType.STRING)
    private CityEnum city;

    @Column
    @NotNull
    private Date startDate;

    @Column
    @NotNull
    private Date endDate;

    @CreationTimestamp
    private Date createTime;

    @UpdateTimestamp
    private Date updateTime;

}
