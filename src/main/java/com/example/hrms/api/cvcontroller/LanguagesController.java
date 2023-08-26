package com.example.hrms.api.cvcontroller;

import com.example.hrms.business.abstracts.candidatecv.LanguageService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/languages")
@AllArgsConstructor
public class LanguagesController {
    private LanguageService languageService;

    /*
    Add parameter

     */
}
