package com.example.hrms.api.base;

import com.example.hrms.business.abstracts.EmploymentTypeService;
import com.example.hrms.business.abstracts.responses.GetAllEmploymentTypesResponse;
import com.example.hrms.core.utilities.results.DataResult;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employmentTypes")
@AllArgsConstructor
public class EmploymentTypesController {
    private EmploymentTypeService employmentTypeService;

    @GetMapping("/getAll")
    public DataResult<List<GetAllEmploymentTypesResponse>> getAll() {
        return employmentTypeService.getAll();
    }

}
