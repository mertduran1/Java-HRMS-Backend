package com.example.hrms.business.concretes;

import com.example.hrms.business.abstracts.JobAdvertisementService;
import com.example.hrms.business.abstracts.requests.CreateJobAdvertisementRequest;
import com.example.hrms.business.abstracts.responses.GetAllJobAdvertisementResponse;
import com.example.hrms.core.utilities.mappers.ModelMapperService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.JobAdvertisementDao;
import com.example.hrms.entities.concretes.JobAdvertisement;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class JobAdvertisementManager implements JobAdvertisementService {

    private JobAdvertisementDao jobAdvertisementDao;

    private ModelMapperService modelMapperService;

    @Autowired
    public void setModelMapperService(ModelMapperService modelMapperService) {
        this.modelMapperService = modelMapperService;
    }


    @Override
    public Result add(CreateJobAdvertisementRequest createJobAdvertisementRequest) {
        JobAdvertisement jobAdvertisement = modelMapperService.forRequest().map(createJobAdvertisementRequest, JobAdvertisement.class);
       jobAdvertisementDao.save(jobAdvertisement);

       return new SuccessResult("Job advertisement successfully added");
    }

    @Override
    public DataResult<List<GetAllJobAdvertisementResponse>> getAll() {
        List<JobAdvertisement> jobAdvertisements = jobAdvertisementDao.findAll();

        List<GetAllJobAdvertisementResponse> getAllJobAdvertisementResponses = jobAdvertisements.stream().map(jobAdvertisement -> modelMapperService.forResponse().map(jobAdvertisement, GetAllJobAdvertisementResponse.class)).toList();
        return new SuccessDataResult<List<GetAllJobAdvertisementResponse>>(getAllJobAdvertisementResponses, "Job ads listed");
    }

    @Override
    public DataResult<List<GetAllJobAdvertisementResponse>> getAllActiveJobAdvertisementsSortedBySalary(int minSalary, int maxSalary) {
        List<JobAdvertisement> jobAdvertisements = jobAdvertisementDao.findByMinSalaryAndMaxSalary(minSalary, maxSalary);

        List<GetAllJobAdvertisementResponse> getAllJobAdvertisementResponses = jobAdvertisements.stream().map(jobAdvertisement -> modelMapperService.forResponse().map(jobAdvertisement, GetAllJobAdvertisementResponse.class)).toList();
        return new SuccessDataResult<List<GetAllJobAdvertisementResponse>>(getAllJobAdvertisementResponses, "Jobs are listed");
    }


}
