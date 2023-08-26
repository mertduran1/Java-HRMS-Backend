package com.example.hrms.business.concretes;

import com.example.hrms.business.abstracts.LocationTypeService;
import com.example.hrms.business.abstracts.responses.GetAllLocationTypes;
import com.example.hrms.core.utilities.mappers.ModelMapperService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.dataAccess.abstracts.LocationTypeDao;
import com.example.hrms.entities.concretes.LocationType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationTypeManager implements LocationTypeService {

    private LocationTypeDao locationTypeDao;
    private ModelMapperService modelMapperService;


    @Autowired
    public LocationTypeManager(LocationTypeDao locationTypeDao, ModelMapperService modelMapperService) {
        this.locationTypeDao = locationTypeDao;
        this.modelMapperService = modelMapperService;
    }


    @Override
    public DataResult<List<GetAllLocationTypes>> getAll() {
        List<LocationType> locationTypes = locationTypeDao.findAll();

        List<GetAllLocationTypes> getAllLocationTypes = locationTypes.stream().map(locationType -> modelMapperService.forResponse().map(locationType, GetAllLocationTypes.class)).toList();
        return new SuccessDataResult<>(getAllLocationTypes, "Location types listed");
    }
}
