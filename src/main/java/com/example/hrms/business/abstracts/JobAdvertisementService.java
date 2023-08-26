package com.example.hrms.business.abstracts;

import com.example.hrms.business.abstracts.requests.CreateJobAdvertisementRequest;
import com.example.hrms.business.abstracts.responses.GetAllJobAdvertisementResponse;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;

import java.util.List;

public interface JobAdvertisementService {
    Result add(CreateJobAdvertisementRequest createJobAdvertisementRequest);
    DataResult<List<GetAllJobAdvertisementResponse>> getAll();
    DataResult<List<GetAllJobAdvertisementResponse>> getAllActiveJobAdvertisementsSortedBySalary(int minSalary, int maxSalary);

}
