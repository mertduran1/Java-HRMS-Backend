package com.example.hrms.dataAccess.abstracts.candidatecv;

import com.example.hrms.entities.concretes.CandidateCV.CandidateImage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateImageDao extends JpaRepository<CandidateImage, Integer> {
    List<CandidateImage> findAllByCandidateId(int candidateId);
}
