package com.example.hrms.business.abstracts;

import com.example.hrms.business.abstracts.responses.GetAllEmploymentTypesResponse;
import com.example.hrms.core.utilities.results.DataResult;

import java.util.List;

public interface EmploymentTypeService {
    DataResult<List<GetAllEmploymentTypesResponse>> getAll();
}
