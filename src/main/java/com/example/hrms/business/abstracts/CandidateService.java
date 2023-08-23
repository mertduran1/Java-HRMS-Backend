package com.example.hrms.business.abstracts;

import com.example.hrms.entities.concretes.Candidate;

import java.util.List;

public interface CandidateService {
    List<Candidate> getAll();
}
