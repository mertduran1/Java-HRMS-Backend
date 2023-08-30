package com.example.hrms.business.abstracts.candidatecv;

import com.example.hrms.business.abstracts.responses.candidatecv.GetAllCandidateImagesResponse;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CandidateImageService {
    Result uploadFile(MultipartFile file, int candidateId);
    DataResult<List<GetAllCandidateImagesResponse>> getAllCandidateImagesByCandidateId(int candidateId);
}
