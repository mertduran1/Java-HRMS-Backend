package com.example.hrms.api;

import com.example.hrms.business.abstracts.CandidateService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.ApplicationUsers.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {
    private CandidateService candidateService;

    @Autowired
    public CandidatesController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping("/getallcandidates")
    public DataResult<List<Candidate>> getAllCandidates() {return this.candidateService.getAll(); }

    @PostMapping("/addCandidate")
    public Result add(@RequestBody Candidate candidate) {
        return this.candidateService.add(candidate);
    }
}
