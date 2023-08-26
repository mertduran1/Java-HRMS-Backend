package com.example.hrms.business.concretes;

import com.example.hrms.business.abstracts.EmploymentTypeService;
import com.example.hrms.business.abstracts.responses.GetAllEmploymentTypesResponse;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.dataAccess.abstracts.EmploymentTypeDao;
import com.example.hrms.entities.concretes.EmploymentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmploymentTypeManager implements EmploymentTypeService {

    private EmploymentTypeDao employmentTypeDao;

    @Autowired
    public EmploymentTypeManager(EmploymentTypeDao employmentTypeDao) {
        this.employmentTypeDao = employmentTypeDao;
    }

    @Override
    public DataResult<List<GetAllEmploymentTypesResponse>> getAll() {
        return new SuccessDataResult<List<EmploymentType>>(this.employmentTypeDao.findAll(), "Employment Type Added");
    }
}
