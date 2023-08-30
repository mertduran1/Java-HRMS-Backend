package com.example.hrms.business.abstracts.requests;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCoverLetterRequest {
    @NotNull
    private int candidateId;

    private String coverLetter;
}
