package com.example.hrms.business.abstracts.candidatecv;

import com.example.hrms.business.abstracts.requests.CreateJobExperienceRequest;
import com.example.hrms.business.abstracts.responses.candidatecv.GetAllJobExperiencesResponse;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;

import java.util.List;

public interface JobExperienceService {

    Result add(List<CreateJobExperienceRequest> createJobExperienceRequests);
    DataResult<List<GetAllJobExperiencesResponse>> getAllByCandidateIdOrderByEndedYearDesc(int candidateId);
}
