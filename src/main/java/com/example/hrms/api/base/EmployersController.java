package com.example.hrms.api.base;

import com.example.hrms.business.abstracts.EmployerService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.ApplicationUsers.Employer;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
    private EmployerService employerService;

    @Autowired
    public EmployersController(EmployerService employerService) {
        this.employerService = employerService;
    }

    @GetMapping("/getallemployers")
    public DataResult<List<Employer>> getAllEmployers() {return this.employerService.getAll(); }

    @PostMapping("/addemployers")
    public Result add(@RequestBody @Valid Employer employer) {
        return this.employerService.add(employer);
    }
}
