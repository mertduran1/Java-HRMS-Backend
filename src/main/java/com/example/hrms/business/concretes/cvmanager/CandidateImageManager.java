package com.example.hrms.business.concretes.cvmanager;

import com.example.hrms.business.abstracts.candidatecv.CandidateImageService;
import com.example.hrms.business.abstracts.responses.candidatecv.GetAllCandidateImagesResponse;
import com.example.hrms.business.services.storage.FileOperations;
import com.example.hrms.business.services.storage.FileService;
import com.example.hrms.core.utilities.mappers.ModelMapperService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.CandidateDao;
import com.example.hrms.dataAccess.abstracts.candidatecv.CandidateImageDao;
import com.example.hrms.entities.concretes.CandidateCV.CandidateImage;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class CandidateImageManager implements CandidateImageService {
    private CandidateImageDao candidateImageDao;
    private CandidateDao candidateDao;
    private ModelMapperService modelMapperService;
    private FileService fileService;

    @Override
    public Result uploadFile(MultipartFile file, int candidateId) {
        CandidateImage candidateImage = new CandidateImage();

        try {
            String filePath = fileService.uploadFile(file);
            candidateImage.setCandidate(candidateDao.findById(candidateId).orElseThrow());
            candidateImage.setImageName(FileOperations.getFileNameWithoutExtension(file));
            candidateImage.setStorageType(fileService.getFileStorageName());
            candidateImage.setImagePath(filePath);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }

        candidateImageDao.save(candidateImage);
        return new SuccessResult("Candidate Image Success");
    }

    @Override
    public DataResult<List<GetAllCandidateImagesResponse>> getAllCandidateImagesByCandidateId(int candidateId) {
        List<CandidateImage> candidateImages = candidateImageDao.findAllByCandidateId(candidateId);
        List<GetAllCandidateImagesResponse> getAllCandidateImagesResponses = candidateImages.stream().map(candidateImage -> modelMapperService.forResponse().map(candidateImage, GetAllCandidateImagesResponse.class)).toList();
        return new SuccessDataResult<>(getAllCandidateImagesResponses);

    }
}
