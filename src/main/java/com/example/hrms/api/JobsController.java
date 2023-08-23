package com.example.hrms.api;

import com.example.hrms.business.abstracts.JobService;
import com.example.hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<JobTitle> getAllJobTitles() {return this.jobService.getAll(); }

}
