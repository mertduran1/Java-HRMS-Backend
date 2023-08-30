package com.example.hrms.api.cvcontroller;

import com.example.hrms.business.abstracts.candidatecv.SchoolService;
import com.example.hrms.business.abstracts.requests.CreateSchoolRequest;
import com.example.hrms.business.abstracts.responses.candidatecv.GetAllSchoolsResponse;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schools")
@AllArgsConstructor
public class SchoolsController {
    private SchoolService schoolService;

    @GetMapping("/getAllByCandidateId")
    public DataResult<List<GetAllSchoolsResponse>> getAllByCandidateIdOrderByEndYearDesc(@RequestParam int candidateId) {
        return schoolService.getAllByCandidateIdOrderByEndYearDesc(candidateId);
    }

    @PostMapping("/addschool")
    public Result add(@RequestBody List<CreateSchoolRequest> createSchoolRequests) {
        return schoolService.add(createSchoolRequests);
    }
}
