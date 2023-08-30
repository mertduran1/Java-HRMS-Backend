package com.example.hrms.api.cvcontroller;

import com.example.hrms.business.abstracts.candidatecv.CandidateImageService;
import com.example.hrms.core.utilities.results.Result;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/candidateimages")
@AllArgsConstructor
public class CandidateImagesController {
    private CandidateImageService candidateImageService;

    @PostMapping("/addcandidateimage")
    public Result uploadFile(@RequestParam MultipartFile file, @RequestParam int candidateId) {
        return candidateImageService.uploadFile(file, candidateId);
    }
}
