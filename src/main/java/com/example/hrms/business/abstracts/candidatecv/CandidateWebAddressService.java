package com.example.hrms.business.abstracts.candidatecv;

import com.example.hrms.business.abstracts.requests.CreateCandidateWebAddressRequest;
import com.example.hrms.business.abstracts.responses.candidatecv.GetCandidateWebAddressResponse;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;

import java.awt.image.RescaleOp;

public interface CandidateWebAddressService {
    DataResult<GetCandidateWebAddressResponse> getCandidateWebAddressResponse(int candidateId);
    Result add(CreateCandidateWebAddressRequest createCandidateWebAddressRequest);
}
