package com.example.hrms.business.concretes;

import com.example.hrms.business.abstracts.CityService;
import com.example.hrms.business.abstracts.responses.GetAllCitiesresponse;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.dataAccess.abstracts.candidatecv.CityDao;
import com.example.hrms.entities.concretes.CandidateCV.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityManager implements CityService {

    private CityDao cityDao;

    @Autowired
    public CityManager(CityDao cityDao) {
        this.cityDao = cityDao;
    }


    @Override
    public DataResult<List<GetAllCitiesresponse>> getAll() {
       return new SuccessDataResult<List<City>>(this.cityDao.findAll(), "Cities are found");
    }
}
