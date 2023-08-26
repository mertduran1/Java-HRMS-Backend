package com.example.hrms.dataAccess.abstracts.candidatecv;

import com.example.hrms.entities.concretes.CandidateCV.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TechnologyDao extends JpaRepository<Technology, Integer> {
    List<Technology> findAllByCandidateId(int candidateId);
}
