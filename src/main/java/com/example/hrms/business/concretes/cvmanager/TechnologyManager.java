package com.example.hrms.business.concretes.cvmanager;

import com.example.hrms.business.abstracts.candidatecv.TechnologyService;
import com.example.hrms.business.abstracts.responses.candidatecv.GetAllTechnologiesResponse;
import com.example.hrms.core.utilities.mappers.ModelMapperService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.dataAccess.abstracts.candidatecv.TechnologyDao;
import com.example.hrms.entities.concretes.CandidateCV.Technology;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TechnologyManager implements TechnologyService {
    private TechnologyDao technologyDao;
    private ModelMapperService modelMapperService;


    @Override
    public DataResult<List<GetAllTechnologiesResponse>> getAllTechnologiesByCandidateId(int candidateId) {
        List<Technology> technologies = technologyDao.findAllByCandidateId(candidateId);

        List<GetAllTechnologiesResponse> getAllTechnologiesResponses = technologies.stream().map(technology -> modelMapperService.forResponse().map(technology, GetAllTechnologiesResponse.class)).toList();
        return new SuccessDataResult<>(getAllTechnologiesResponses, "TechTree Successfull");
    }
}
