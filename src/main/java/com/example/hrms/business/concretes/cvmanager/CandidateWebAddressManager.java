package com.example.hrms.business.concretes.cvmanager;

import com.example.hrms.business.abstracts.candidatecv.CandidateWebAddressService;
import com.example.hrms.business.abstracts.requests.CreateCandidateWebAddressRequest;
import com.example.hrms.business.abstracts.responses.candidatecv.GetCandidateWebAddressResponse;
import com.example.hrms.core.utilities.mappers.ModelMapperService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.candidatecv.CandidateWebAddressDao;
import com.example.hrms.entities.concretes.CandidateCV.CandidateWebAddress;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CandidateWebAddressManager implements CandidateWebAddressService {
    private CandidateWebAddressDao candidateWebAddressDao;

    private ModelMapperService modelMapperService;

    @Autowired
    public CandidateWebAddressManager(CandidateWebAddressDao candidateWebAddressDao, ModelMapperService modelMapperService) {
        this.candidateWebAddressDao = candidateWebAddressDao;
        this.modelMapperService = modelMapperService;
    }

    @Override
    public DataResult<GetCandidateWebAddressResponse> getCandidateWebAddressResponse(int candidateId) {
        CandidateWebAddress candidateWebAddress = candidateWebAddressDao.findById(candidateId).orElseThrow();

        GetCandidateWebAddressResponse getCandidateWebAddressResponse = new GetCandidateWebAddressResponse();
        getCandidateWebAddressResponse.setCandidateId(candidateWebAddress.getCandidateId());
        getCandidateWebAddressResponse.setGithubAddress(candidateWebAddress.getGithubAddress());
        getCandidateWebAddressResponse.setLinkedinAddress(candidateWebAddress.getLinkedinAddress());
        return new SuccessDataResult<>(getCandidateWebAddressResponse);
    }

    @Override
    public Result add(CreateCandidateWebAddressRequest createCandidateWebAddressRequest) {
        CandidateWebAddress candidateWebAddress = modelMapperService.forRequest().map(createCandidateWebAddressRequest, CandidateWebAddress.class);
        candidateWebAddress.setCandidateId(createCandidateWebAddressRequest.getCandidateId());
        candidateWebAddressDao.save(candidateWebAddress);
        return new SuccessResult("Web address added");
    }
}
