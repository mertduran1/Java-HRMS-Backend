package com.example.hrms.business.abstracts.candidatecv;

import com.example.hrms.business.abstracts.requests.CreateSchoolRequest;
import com.example.hrms.business.abstracts.responses.candidatecv.GetAllSchoolsResponse;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;

import java.util.List;

public interface SchoolService {

    Result add(List<CreateSchoolRequest> createSchoolRequests);
    DataResult<List<GetAllSchoolsResponse>> getAllByCandidateIdOrderByEndYearDesc(int candidateId);
}
