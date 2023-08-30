package com.example.hrms.business.abstracts;

import com.example.hrms.business.abstracts.responses.GetAllLocationTypes;
import com.example.hrms.core.utilities.results.DataResult;

import java.util.List;

public interface LocationTypeService {
    DataResult<List<GetAllLocationTypes>> getAll();

}
