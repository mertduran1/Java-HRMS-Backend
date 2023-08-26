package com.example.hrms.business.abstracts.responses.candidatecv;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllLanguagesResponse {
    private int id;
    private int candidateId;
    private String languageName;
}
