package com.example.hrms.business.abstracts.candidatecv;

import com.example.hrms.business.abstracts.requests.CreateTechnologyRequest;
import com.example.hrms.business.abstracts.responses.candidatecv.GetAllTechnologiesResponse;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;

import java.util.List;

public interface TechnologyService {
    Result add(List<CreateTechnologyRequest> createTechnologyRequests);
    DataResult<List<GetAllTechnologiesResponse>> getAllTechnologiesByCandidateId(int candidateId);
}
