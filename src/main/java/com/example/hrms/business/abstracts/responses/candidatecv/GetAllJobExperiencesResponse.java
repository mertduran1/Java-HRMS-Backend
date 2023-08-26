package com.example.hrms.business.abstracts.responses.candidatecv;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllJobExperiencesResponse {
    private int id;
    private int candidateId;
    private String companyName;
    private String position;
    private Date startYear;
    private Date endYear;


    //If candidate is still working
    public Object getEndYear() {
        if(endYear == null)
            return "Continuing";
        return endYear;
    }
}
