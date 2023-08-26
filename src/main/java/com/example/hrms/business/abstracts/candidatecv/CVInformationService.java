package com.example.hrms.business.abstracts.candidatecv;

import com.example.hrms.business.abstracts.responses.candidatecv.GetAllCVInformationResponse;
import com.example.hrms.core.utilities.results.DataResult;

public interface CVInformationService {
    DataResult<GetAllCVInformationResponse> getAllCvInformationByCandidateId(int candidateId);
}
