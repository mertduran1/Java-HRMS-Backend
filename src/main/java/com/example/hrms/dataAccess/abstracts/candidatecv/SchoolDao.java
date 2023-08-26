package com.example.hrms.dataAccess.abstracts.candidatecv;

import com.example.hrms.entities.concretes.CandidateCV.School;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolDao extends JpaRepository<School, Integer> {
    List<School> findAllByCandidateIdOrderByEndYearDesc(int candidateId);
}
