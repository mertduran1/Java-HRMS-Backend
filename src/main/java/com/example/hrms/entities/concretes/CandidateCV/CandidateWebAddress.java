package com.example.hrms.entities.concretes.CandidateCV;

import com.example.hrms.entities.concretes.ApplicationUsers.Candidate;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "candidate_web_address")
@AllArgsConstructor
@NoArgsConstructor
public class CandidateWebAddress {
    @Id
    @Column(name = "candidate_id")
    private int candidateId;

    @Column(name = "github_address")
    private String githubAddress;

    @Column(name = "linkedin_address")
    private String linkedinAddress;

    @OneToOne
    @MapsId
    private Candidate candidate;
}
