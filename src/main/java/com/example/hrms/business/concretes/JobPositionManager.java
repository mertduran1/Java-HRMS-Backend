package com.example.hrms.business.concretes;

import com.example.hrms.business.abstracts.JobPositionService;
import com.example.hrms.business.abstracts.responses.GetAllJobAdvertisementResponse;
import com.example.hrms.business.abstracts.responses.GetAllJobPositionsResponse;
import com.example.hrms.core.utilities.mappers.ModelMapperService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.dataAccess.abstracts.JobPositionDao;
import com.example.hrms.entities.concretes.JobPosition;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class JobPositionManager implements JobPositionService {
    private JobPositionDao jobPositionDao;
    private ModelMapperService modelMapperService;

    @Override
    public DataResult<List<GetAllJobPositionsResponse>> getAll() {
        List<JobPosition> jobPositions = jobPositionDao.findAll();
        List<GetAllJobPositionsResponse> getAllJobPositionsResponses = jobPositions.stream().map(jobPosition -> modelMapperService.forResponse().map(jobPosition, GetAllJobPositionsResponse.class)).toList();

        return new SuccessDataResult<List<GetAllJobPositionsResponse>>(getAllJobPositionsResponses, "Successful job position lis");
    }
}
