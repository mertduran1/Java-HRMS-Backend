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
public class CreateLanguageRequest {
    @NotNull
    @Min(1)
    private int candidateId;

    @NotBlank
    private String languageName;

    @NotNull
    @Min(1)
    @Max(5)
    private int languageLevel;

}
