package com.example.hrms.dataAccess.abstracts.verification;

import com.example.hrms.entities.concretes.verification.VerificationCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationCodeDao extends JpaRepository<VerificationCode, Integer> {
}
