package com.example.hrms.api.cvcontroller;

import com.example.hrms.business.abstracts.candidatecv.JobExperienceService;
import com.example.hrms.business.abstracts.requests.CreateJobExperienceRequest;
import com.example.hrms.business.abstracts.responses.candidatecv.GetAllJobExperiencesResponse;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobexperiences")
@AllArgsConstructor
public class JobExperiencesController {
    private JobExperienceService jobExperienceService;

    @GetMapping("/getAllByCandidateIdOrderByEndYearDesc")
    public DataResult<List<GetAllJobExperiencesResponse>> getAllByCandidateIdOrderByEndYearDesc(@RequestParam int candidateId)
    {
        return jobExperienceService.getAllByCandidateIdOrderByEndedYearDesc(candidateId);
    }

    @PostMapping("/addjobexperiences")
    public Result add(@RequestBody List<CreateJobExperienceRequest> createJobExperienceRequests) {
        return jobExperienceService.add(createJobExperienceRequests);
    }
}
