package com.example.hrms.api.cvcontroller;

import com.example.hrms.business.abstracts.candidatecv.LanguageService;
import com.example.hrms.business.abstracts.requests.CreateLanguageRequest;
import com.example.hrms.core.utilities.results.Result;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
@AllArgsConstructor
public class LanguagesController {
    private LanguageService languageService;

    @PostMapping("/addlanguage")
    public Result add(@RequestBody List<CreateLanguageRequest> createLanguageRequests) {
        return languageService.add(createLanguageRequests);
    }

}
