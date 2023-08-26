package com.example.hrms.dataAccess.abstracts.verification;

import com.example.hrms.entities.concretes.verification.VerificationCandidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationCodeCandidate extends JpaRepository<VerificationCandidate, Integer> {
}
