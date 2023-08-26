package com.example.hrms.business.concretes.cvmanager;

import com.example.hrms.business.abstracts.candidatecv.JobExperienceService;
import com.example.hrms.business.abstracts.responses.candidatecv.GetAllJobExperiencesResponse;
import com.example.hrms.core.utilities.mappers.ModelMapperService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.dataAccess.abstracts.candidatecv.JobExperienceDao;
import com.example.hrms.entities.concretes.CandidateCV.JobExperience;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class JobExperienceManager implements JobExperienceService {
    private JobExperienceDao jobExperienceDao;
    private ModelMapperService modelMapperService;

    @Override
    public DataResult<List<GetAllJobExperiencesResponse>> getAllByCandidateIdOrderByEndedYearDesc(int candidateId) {
        List<JobExperience> jobExperiences = jobExperienceDao.findAllByCandidateId(candidateId);

        List<GetAllJobExperiencesResponse> getAllJobExperiencesResponses = jobExperiences.stream().map(jobExperience -> modelMapperService.forResponse().map(jobExperience, GetAllJobExperiencesResponse.class)).toList();
        return new SuccessDataResult<>(getAllJobExperiencesResponses, "Job experiences list success");
    }
}
