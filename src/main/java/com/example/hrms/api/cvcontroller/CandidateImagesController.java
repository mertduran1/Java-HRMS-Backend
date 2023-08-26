package com.example.hrms.api.cvcontroller;

import com.example.hrms.business.abstracts.candidatecv.CandidateImageService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/candidateimages")
@AllArgsConstructor
public class CandidateImagesController {
    private CandidateImageService candidateImageService;

    /*
    Add
     */
}
