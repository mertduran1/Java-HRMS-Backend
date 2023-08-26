package com.example.hrms.business.abstracts;

import com.example.hrms.business.abstracts.responses.GetAllCitiesresponse;
import com.example.hrms.core.utilities.results.DataResult;

import java.util.List;

public interface CityService {
    DataResult<List<GetAllCitiesresponse>> getAll();
}
