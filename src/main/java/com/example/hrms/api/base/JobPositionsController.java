package com.example.hrms.api.base;

import com.example.hrms.business.abstracts.JobPositionService;
import com.example.hrms.business.abstracts.responses.GetAllJobPositionsResponse;
import com.example.hrms.core.utilities.results.DataResult;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobpositions")
@AllArgsConstructor
public class JobPositionsController {
    private JobPositionService jobPositionService;

    @GetMapping("/getall")
    public DataResult<List<GetAllJobPositionsResponse>> getAll() {
        DataResult<List<GetAllJobPositionsResponse>> result = jobPositionService.getAll();
        return result;
    }
}
