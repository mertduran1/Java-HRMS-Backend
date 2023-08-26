package com.example.hrms.api.base;


import com.example.hrms.business.abstracts.LocationTypeService;
import com.example.hrms.business.abstracts.responses.GetAllLocationTypes;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.entities.concretes.LocationType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/locationTypes")
public class LocationTypesController {
    private LocationTypeService locationTypeService;

    public LocationTypesController(LocationTypeService locationTypeService) {
        this.locationTypeService = locationTypeService;
    }

    @GetMapping("/getAll")
    public DataResult<List<GetAllLocationTypes>> getAll() {
        return locationTypeService.getAll();
    }

}
