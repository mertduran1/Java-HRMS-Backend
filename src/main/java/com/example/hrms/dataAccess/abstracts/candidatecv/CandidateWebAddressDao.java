package com.example.hrms.dataAccess.abstracts.candidatecv;

import com.example.hrms.entities.concretes.CandidateCV.CandidateWebAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateWebAddressDao extends JpaRepository<CandidateWebAddress, Integer> {
}
