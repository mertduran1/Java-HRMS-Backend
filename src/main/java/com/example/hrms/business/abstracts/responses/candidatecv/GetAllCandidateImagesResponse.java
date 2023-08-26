package com.example.hrms.business.abstracts.responses.candidatecv;

import com.example.hrms.entities.concretes.CandidateCV.StorageType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCandidateImagesResponse {
    private int id;
    private int candidateId;
    private String imageName;
    private String imagePath;
    private StorageType storageType;

}
