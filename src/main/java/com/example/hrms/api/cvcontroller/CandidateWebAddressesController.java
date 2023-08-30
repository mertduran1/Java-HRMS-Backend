package com.example.hrms.api.cvcontroller;

import com.example.hrms.business.abstracts.candidatecv.CandidateWebAddressService;
import com.example.hrms.business.abstracts.requests.CreateCandidateWebAddressRequest;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.CandidateCV.CandidateWebAddress;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/candidatewebaddress")
public class CandidateWebAddressesController {

    private final CandidateWebAddressService candidateWebAddressService;

    @Autowired
    public CandidateWebAddressesController(CandidateWebAddressService candidateWebAddressService) {
        this.candidateWebAddressService = candidateWebAddressService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody CreateCandidateWebAddressRequest createCandidateWebAddressRequest) {
        return candidateWebAddressService.add(createCandidateWebAddressRequest);
    }
}
