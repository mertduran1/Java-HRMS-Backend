package com.example.hrms.business.abstracts.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateJobAdvertisementRequest {

    private int companyId;
    //private int jobPositionId;
    @Size(min = 2)
    private String description;

    private Integer minSalary;
    private Integer maxSalary;
    private int numberOfJobOpenings;


}
