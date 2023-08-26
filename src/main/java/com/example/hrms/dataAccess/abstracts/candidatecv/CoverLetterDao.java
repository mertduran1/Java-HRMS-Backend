package com.example.hrms.dataAccess.abstracts.candidatecv;

import com.example.hrms.entities.concretes.CandidateCV.CoverLetter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoverLetterDao extends JpaRepository<CoverLetter, Integer> {
}
