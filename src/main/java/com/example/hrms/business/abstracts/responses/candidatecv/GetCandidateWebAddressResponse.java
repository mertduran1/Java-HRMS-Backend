package com.example.hrms.business.abstracts.responses.candidatecv;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetCandidateWebAddressResponse {
    private int candidateId;
    private String githubAddress;
    private String linkedinAddress;
}
