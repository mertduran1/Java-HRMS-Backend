package com.example.hrms.entities.concretes.verification;

import com.example.hrms.entities.concretes.ApplicationUsers.Candidate;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Data
@Table(name = "verification_code_candidates")
@Entity
public class VerificationCandidate extends VerificationCode{

    @OneToOne
    @JoinColumn(name = "candidate_id")
    @ToString.Exclude //Hide sensitive data in order to prevent it from being printed on console
    private Candidate candidate;
}
