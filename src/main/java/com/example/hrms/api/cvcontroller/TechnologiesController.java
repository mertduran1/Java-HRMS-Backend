package com.example.hrms.api.cvcontroller;

import com.example.hrms.business.abstracts.candidatecv.TechnologyService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/technology")
@AllArgsConstructor
public class TechnologiesController {
    private TechnologyService technologyService;

    /*

    Add parameter

     */
}
