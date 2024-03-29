package com.example.hrms.business.abstracts;

import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.entities.concretes.JobTitle;

import java.util.List;

public interface JobService {
    DataResult<List<JobTitle>> getAll();
    Result add(JobTitle jobTitle);
}
