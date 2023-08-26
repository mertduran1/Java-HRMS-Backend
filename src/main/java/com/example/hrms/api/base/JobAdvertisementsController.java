package com.example.hrms.api.base;

import com.example.hrms.business.abstracts.JobAdvertisementService;
import com.example.hrms.business.abstracts.requests.CreateJobAdvertisementRequest;
import com.example.hrms.business.abstracts.responses.GetAllJobAdvertisementResponse;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobadvertisements")
@AllArgsConstructor
@CrossOrigin
public class JobAdvertisementsController {

    private JobAdvertisementService jobAdvertisementService;

    @GetMapping("/getAll")
    public DataResult<List<GetAllJobAdvertisementResponse>> getAllActive() {
        return jobAdvertisementService.getAll();
    }
    @GetMapping("/getbysalary")
    public DataResult<List<GetAllJobAdvertisementResponse>> getAllBySalary(int minSalary, int maxSalary) {
        return jobAdvertisementService.getAllActiveJobAdvertisementsSortedBySalary(minSalary, maxSalary);
    }

    @PostMapping("/add")
    public Result add(@RequestBody @Valid CreateJobAdvertisementRequest createJobAdvertisementRequest) {
        return jobAdvertisementService.add(createJobAdvertisementRequest);
    }
}
