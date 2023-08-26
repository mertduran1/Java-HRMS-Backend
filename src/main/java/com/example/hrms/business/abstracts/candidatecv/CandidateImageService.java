package com.example.hrms.business.abstracts.candidatecv;

import com.example.hrms.business.abstracts.responses.candidatecv.GetAllCandidateImagesResponse;
import com.example.hrms.core.utilities.results.DataResult;

import java.util.List;

public interface CandidateImageService {
    DataResult<List<GetAllCandidateImagesResponse>> getAllCandidateImagesByCandidateId(int candidateId);
}
