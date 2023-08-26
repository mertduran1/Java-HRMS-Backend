package com.example.hrms.business.abstracts;

import com.example.hrms.business.abstracts.responses.GetAllJobPositionsResponse;
import com.example.hrms.core.utilities.results.DataResult;

import java.util.List;

public interface JobPositionService {
    DataResult<List<GetAllJobPositionsResponse>> getAll();
    
}
