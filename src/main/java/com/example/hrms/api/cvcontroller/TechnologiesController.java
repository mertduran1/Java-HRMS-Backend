package com.example.hrms.api.cvcontroller;

import com.example.hrms.business.abstracts.candidatecv.TechnologyService;
import com.example.hrms.business.abstracts.requests.CreateTechnologyRequest;
import com.example.hrms.core.utilities.results.Result;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/technology")
@AllArgsConstructor
public class TechnologiesController {
    private TechnologyService technologyService;

    @PostMapping("/addtechnology")
    public Result add(List <CreateTechnologyRequest> createTechnologyRequests) {
        return technologyService.add(createTechnologyRequests);
    }
}
