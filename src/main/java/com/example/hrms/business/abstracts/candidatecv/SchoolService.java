package com.example.hrms.business.abstracts.candidatecv;

import com.example.hrms.business.abstracts.responses.candidatecv.GetAllSchoolsResponse;
import com.example.hrms.core.utilities.results.DataResult;

import java.util.List;

public interface SchoolService {
    DataResult<List<GetAllSchoolsResponse>> getAllByCandidateIdOrderByEndYearDesc(int candidateId);
}
