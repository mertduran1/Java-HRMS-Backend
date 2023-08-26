package com.example.hrms.business.abstracts.responses.candidatecv;

import java.util.List;

public class GetAllCVInformationResponse {
    private int candidateId;
    private GetCoverLetterResponse getCoverLetterResponse;
    private GetCandidateWebAddressResponse getCandidateWebAddressResponse;
    private List<GetAllJobExperiencesResponse> jobExperiencesResponses;
    private List<GetAllCandidateImagesResponse> candidateImagesResponses;
    private List<GetAllLanguagesResponse> getAllLanguagesResponses;

    private List<GetAllSchoolsResponse> getAllSchoolsResponses;

    private List<GetAllTechnologiesResponse> getAllTechnologiesResponses;


}
