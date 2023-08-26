package com.example.hrms.entities.concretes.CandidateCV;

import com.example.hrms.entities.concretes.ApplicationUsers.Candidate;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "cover_letters")
@AllArgsConstructor
@NoArgsConstructor
public class CoverLetter {
    @Id
    @Column(name = "candidate_id")
    private int candidateId;

    @Column(name = "cover_letter")
    private String coverLetter;

    @OneToOne
    @MapsId
    private Candidate candidate;
}
