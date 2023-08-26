package com.example.hrms.business.concretes.cvmanager;

import com.example.hrms.business.abstracts.candidatecv.CandidateWebAddressService;
import com.example.hrms.business.abstracts.responses.candidatecv.GetCandidateWebAddressResponse;
import com.example.hrms.core.utilities.mappers.ModelMapperService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.dataAccess.abstracts.candidatecv.CandidateWebAddressDao;
import com.example.hrms.entities.concretes.CandidateCV.CandidateWebAddress;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CandidateWebAddressManager implements CandidateWebAddressService {
    private CandidateWebAddressDao candidateWebAddressDao;
    private ModelMapperService modelMapperService;

    @Override
    public DataResult<GetCandidateWebAddressResponse> getCandidateWebAddressResponse(int candidateId) {
        CandidateWebAddress candidateWebAddress = candidateWebAddressDao.findById(candidateId).orElseThrow();

        GetCandidateWebAddressResponse getCandidateWebAddressResponse = new GetCandidateWebAddressResponse();
        getCandidateWebAddressResponse.setCandidateId(candidateWebAddress.getCandidateId());
        getCandidateWebAddressResponse.setGithubAddress(candidateWebAddress.getGithubAddress());
        getCandidateWebAddressResponse.setLinkedinAddress(candidateWebAddress.getLinkedinAddress());
        return new SuccessDataResult<>(getCandidateWebAddressResponse);
    }
}
