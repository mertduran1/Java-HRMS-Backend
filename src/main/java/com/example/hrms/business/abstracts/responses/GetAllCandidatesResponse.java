package com.example.hrms.business.abstracts.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCandidatesResponse {
    private int id;
    private String email;
    private String firstName;
    private String lastName;
    private String identityNumber;
}
