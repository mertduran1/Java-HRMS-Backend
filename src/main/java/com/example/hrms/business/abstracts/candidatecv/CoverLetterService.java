package com.example.hrms.business.abstracts.candidatecv;

import com.example.hrms.business.abstracts.requests.CreateCoverLetterRequest;
import com.example.hrms.business.abstracts.responses.candidatecv.GetCoverLetterResponse;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.CandidateCV.CoverLetter;

public interface CoverLetterService {
    DataResult<GetCoverLetterResponse> getCoverLetterByCandidateId(int candidateId);
    Result add(CreateCoverLetterRequest createCoverLetterRequest);
}
