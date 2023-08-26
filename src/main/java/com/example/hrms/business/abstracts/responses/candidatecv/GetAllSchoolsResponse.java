package com.example.hrms.business.abstracts.responses.candidatecv;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllSchoolsResponse {
    private int id;
    private int candidateId;
    private String schoolName;
    private String department;
    private int startYear;
    private Integer endYear;

    public Object getEndYear() {
        if(endYear == null)
            return "Not graduated yet";
        return endYear;
    }
}
