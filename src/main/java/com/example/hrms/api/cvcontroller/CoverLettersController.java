package com.example.hrms.api.cvcontroller;

import com.example.hrms.business.abstracts.candidatecv.CoverLetterService;
import com.example.hrms.business.abstracts.requests.CreateCoverLetterRequest;
import com.example.hrms.business.abstracts.responses.candidatecv.GetCoverLetterResponse;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.CandidateCV.CoverLetter;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/coverletters")

public class CoverLettersController {
    private CoverLetterService coverLetterService;

    @Autowired
    public CoverLettersController(CoverLetterService coverLetterService) {
        this.coverLetterService = coverLetterService;
    }

    @GetMapping("/getCoverLetterByCandidateId")
    public DataResult<GetCoverLetterResponse> getCoverLetterByCandidateId(@RequestParam int candidateId) {
        return coverLetterService.getCoverLetterByCandidateId(candidateId);
    }

    @PostMapping("/addcoverletter")
    public Result add(CreateCoverLetterRequest createCoverLetterRequest) {
        return coverLetterService.add(createCoverLetterRequest);
    }
}
