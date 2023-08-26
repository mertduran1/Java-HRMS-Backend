package com.example.hrms.entities.concretes.CandidateCV;

import com.example.hrms.entities.concretes.ApplicationUsers.Candidate;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "schools")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "school_name")
    private String schoolName;

    @Column(name = "department")
    private String department;

    @Column(name = "start_year")
    private int startYear;

    @Column(name = "end_year")
    private Integer endYear;

    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;
}
