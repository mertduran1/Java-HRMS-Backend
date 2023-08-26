package com.example.hrms.api.cvcontroller;

import com.example.hrms.business.abstracts.candidatecv.CoverLetterService;
import com.example.hrms.business.abstracts.responses.candidatecv.GetCoverLetterResponse;
import com.example.hrms.core.utilities.results.DataResult;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/coverletters")
@AllArgsConstructor
public class CoverLettersController {
    private CoverLetterService coverLetterService;

    @GetMapping("/getCoverLetterByCandidateId")
    public DataResult<GetCoverLetterResponse> getCoverLetterByCandidateId(@RequestParam int candidateId) {
        return coverLetterService.getCoverLetterByCandidateId(candidateId);
    }
}
