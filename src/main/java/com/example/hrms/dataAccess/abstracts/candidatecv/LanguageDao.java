package com.example.hrms.dataAccess.abstracts.candidatecv;

import com.example.hrms.entities.concretes.CandidateCV.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LanguageDao extends JpaRepository<Language, Integer> {
    List<Language> findAllByCandidateId(int candidateId);
}
