package com.example.hrms.dataAccess.abstracts.verification;

import com.example.hrms.entities.concretes.verification.VerificationEmployer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationCodeEmployer extends JpaRepository<VerificationEmployer, Integer> {
}
