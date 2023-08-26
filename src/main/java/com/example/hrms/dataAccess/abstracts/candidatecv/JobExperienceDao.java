package com.example.hrms.dataAccess.abstracts.candidatecv;

import com.example.hrms.entities.concretes.CandidateCV.JobExperience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobExperienceDao extends JpaRepository<JobExperience, Integer> {
    List<JobExperience> findAllByCandidateId(int candidateId);
}
