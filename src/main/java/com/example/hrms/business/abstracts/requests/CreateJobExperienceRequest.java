package com.example.hrms.business.abstracts.requests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateJobExperienceRequest {

    @NotNull
    @Min(1)
    private int candidateId;

    @NotBlank
    private String companyName;

    @NotBlank
    private String positionName;

    @NotNull
    private Date startYear;

    private Date endYear;

}
