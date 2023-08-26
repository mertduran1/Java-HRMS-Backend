package com.example.hrms.business.concretes.cvmanager;

import com.example.hrms.business.abstracts.candidatecv.CoverLetterService;
import com.example.hrms.business.abstracts.responses.candidatecv.GetCoverLetterResponse;
import com.example.hrms.core.utilities.mappers.ModelMapperService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.dataAccess.abstracts.candidatecv.CoverLetterDao;
import com.example.hrms.entities.concretes.CandidateCV.CoverLetter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CoverLetterManager implements CoverLetterService {
    private CoverLetterDao coverLetterDao;
    private ModelMapperService modelMapperService;


    @Override
    public DataResult<GetCoverLetterResponse> getCoverLetterByCandidateId(int candidateId) {
        CoverLetter coverLetter = coverLetterDao.findById(candidateId).orElseThrow();

        GetCoverLetterResponse getCoverLetterResponse = new GetCoverLetterResponse(); //We need to return to client DTO so we new'd it
        getCoverLetterResponse.setCandidateId(coverLetter.getCandidateId());
        getCoverLetterResponse.setCoverLetter(coverLetter.getCoverLetter());

        return new SuccessDataResult<>(getCoverLetterResponse);
    }
}
