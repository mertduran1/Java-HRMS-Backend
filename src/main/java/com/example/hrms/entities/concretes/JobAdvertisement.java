package com.example.hrms.entities.concretes;


import com.example.hrms.entities.concretes.ApplicationUsers.Employer;
import com.example.hrms.entities.concretes.CandidateCV.City;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Table(name = "job_advertisements")
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "description")
    private String description;

    @Column(name = "min_salary")
    private Integer minSalary;

    @Column(name = "max_salary")
    private Integer maxSalary;

    @Column(name = "application_deadline")
    private int applicationDeadline;

    @Column(name = "status")
    private boolean status;

    @ManyToOne()
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne()
    @JoinColumn(name = "job_position_id")
    private JobPosition jobPosition;

    @ManyToOne()
    @JoinColumn(name = "employer_id", referencedColumnName = "id")
    private Employer employer;

    @ManyToOne()
    private EmploymentType employmentType;

    @ManyToOne()
    @JoinColumn(name = "location_type_id")
    private LocationType locationType;


}