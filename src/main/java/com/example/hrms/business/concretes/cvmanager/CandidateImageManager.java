package com.example.hrms.business.concretes.cvmanager;

import com.example.hrms.business.abstracts.candidatecv.CandidateImageService;
import com.example.hrms.business.abstracts.responses.candidatecv.GetAllCandidateImagesResponse;
import com.example.hrms.core.utilities.mappers.ModelMapperService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.dataAccess.abstracts.CandidateDao;
import com.example.hrms.dataAccess.abstracts.candidatecv.CandidateImageDao;
import com.example.hrms.entities.concretes.CandidateCV.CandidateImage;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CandidateImageManager implements CandidateImageService {
    private CandidateImageDao candidateImageDao;
    private CandidateDao candidateDao;
    private ModelMapperService modelMapperService;


    @Override
    public DataResult<List<GetAllCandidateImagesResponse>> getAllCandidateImagesByCandidateId(int candidateId) {
        List<CandidateImage> candidateImages = candidateImageDao.findAllByCandidateId(candidateId);
        List<GetAllCandidateImagesResponse> getAllCandidateImagesResponses = candidateImages.stream().map(candidateImage -> modelMapperService.forResponse().map(candidateImage, GetAllCandidateImagesResponse.class)).toList();
        return new SuccessDataResult<>(getAllCandidateImagesResponses);

    }
}
