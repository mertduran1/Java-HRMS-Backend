package com.example.hrms.entities.concretes.CandidateCV;

import com.example.hrms.entities.concretes.ApplicationUsers.Candidate;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "job_experiences")
public class JobExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "position")
    private String position;

    @Column(name = "start_year")
    private Date startYear;

    @Column(name = "end_year")
    private Date endYear;

    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;
}
