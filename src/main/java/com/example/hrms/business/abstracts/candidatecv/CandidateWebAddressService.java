package com.example.hrms.business.abstracts.candidatecv;

import com.example.hrms.business.abstracts.responses.candidatecv.GetCandidateWebAddressResponse;
import com.example.hrms.core.utilities.results.DataResult;

public interface CandidateWebAddressService {
    DataResult<GetCandidateWebAddressResponse> getCandidateWebAddressResponse(int candidateId);
}
