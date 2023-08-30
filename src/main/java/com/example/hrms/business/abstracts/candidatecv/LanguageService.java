package com.example.hrms.business.abstracts.candidatecv;

import com.example.hrms.business.abstracts.requests.CreateLanguageRequest;
import com.example.hrms.business.abstracts.responses.candidatecv.GetAllLanguagesResponse;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;

import java.util.List;

public interface LanguageService {

    Result add(List<CreateLanguageRequest> createLanguageRequests);
    DataResult<List<GetAllLanguagesResponse>> getAllLanguagesByCandidateId(int candidateId);
}
