package com.example.hrms.api;

import com.example.hrms.business.abstracts.JobService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Employer;
import com.example.hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.List;

@RestController
@RequestMapping("/api/jobtitle")
public class JobsController {
    private JobService jobService;

    @Autowired
    public JobsController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/getalljobtitles")
    public DataResult<List<JobTitle>> getAllJobTitles() {return this.jobService.getAll(); }

    @PostMapping("/addjobs")
    public Result add(JobTitle jobTitle) {
        return this.jobService.add(jobTitle);
    }


}
