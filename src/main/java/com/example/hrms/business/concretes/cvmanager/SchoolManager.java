package com.example.hrms.business.concretes.cvmanager;

import com.example.hrms.business.abstracts.candidatecv.SchoolService;
import com.example.hrms.business.abstracts.responses.candidatecv.GetAllSchoolsResponse;
import com.example.hrms.core.utilities.mappers.ModelMapperService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.dataAccess.abstracts.candidatecv.SchoolDao;
import com.example.hrms.entities.concretes.CandidateCV.School;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SchoolManager implements SchoolService {
    private SchoolDao schoolDao;
    private ModelMapperService modelMapperService;

    @Override
    public DataResult<List<GetAllSchoolsResponse>> getAllByCandidateIdOrderByEndYearDesc(int candidateId) {
        List<School> schools = schoolDao.findAllByCandidateIdOrderByEndYearDesc(candidateId);

        List<GetAllSchoolsResponse> getAllSchoolsResponses = schools.stream().map(school -> modelMapperService.forResponse().map(school, GetAllSchoolsResponse.class)).toList();
        return new SuccessDataResult<>(getAllSchoolsResponses, "School listed successfully");
    }
}
