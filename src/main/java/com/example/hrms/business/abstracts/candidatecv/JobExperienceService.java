package com.example.hrms.business.abstracts.candidatecv;

import com.example.hrms.business.abstracts.responses.candidatecv.GetAllJobExperiencesResponse;
import com.example.hrms.core.utilities.results.DataResult;

import java.util.List;

public interface JobExperienceService {
    DataResult<List<GetAllJobExperiencesResponse>> getAllByCandidateIdOrderByEndedYearDesc(int candidateId);
}
