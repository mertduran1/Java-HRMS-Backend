package com.example.hrms.business.abstracts.requests;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateSchoolRequest {
    @Min(1)
    @NotNull
    private int candidateId;

    @NotBlank
    private String schoolName;

    @NotBlank
    private String department;

    @NotNull
    private int startYear;

    private Integer endYear;

}
