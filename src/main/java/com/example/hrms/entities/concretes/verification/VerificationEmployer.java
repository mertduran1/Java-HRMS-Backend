package com.example.hrms.entities.concretes.verification;

import com.example.hrms.entities.concretes.ApplicationUsers.Employer;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Data
@Table(name = "verification_code_employers")
@Entity
public class VerificationEmployer extends VerificationCode {
    @OneToOne
    @JoinColumn(name = "employer_id")
    @ToString.Exclude
    private Employer employer;
}
